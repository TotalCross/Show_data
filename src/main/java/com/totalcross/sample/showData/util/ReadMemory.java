package com.totalcross.sample.showData.util;

import com.totalcross.sample.showData.model.Memory;

import totalcross.io.BufferedStream;
import totalcross.io.File;
import totalcross.sys.Convert;
import totalcross.sys.InvalidNumberException;
import totalcross.sys.Vm;
import totalcross.io.IOException;
import totalcross.io.IllegalArgumentIOException;

public class ReadMemory {

    public Memory readMemory() {

        File f = null;
        BufferedStream bs = null;
        Memory memory = new Memory();
        try {
            Vm.exec("top -c -p $(pgrep -d',' -f ShowData) -b -n 1 > memory.txt", null, 0, false);
            Vm.debug("comando para gerar o arquivo executado");

            f = new File("memory.txt", File.CREATE);
            bs = new BufferedStream(f, BufferedStream.READ, 1024);

            String s;
            while ((s = bs.readLine()) != null) {
                Vm.debug(s);

                if (s.contains("ShowData")) {
                    String[] data = s.split(" ");

                    int count = 0;
                    for (String string : data) {
                        if (string.trim().equals(""))
                            continue;

                        if (++count == 5)
                            memory.setVirt(Convert.toInt(string));
                        else if (count == 6)
                            memory.setRes(Convert.toInt(string));
                        else if (count == 7)
                            memory.setShr(Convert.toInt(string));
                    }
                }
            }

            Vm.debug(memory.toString());

        } catch (IllegalArgumentIOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidNumberException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (bs != null)
                    bs.close();
                if (f != null)
                    f.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        return memory;
    }

}