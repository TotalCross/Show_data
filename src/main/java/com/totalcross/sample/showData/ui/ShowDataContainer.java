package com.totalcross.sample.showData.ui;

import com.totalcross.sample.showData.util.Colors;

import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;

public class ShowDataContainer extends Container {

    private ScrollContainer sc, sc2, sc3;

    @Override
    public void initUI() {
        // adicionando containers
        sc = new ScrollContainer(true, true);
        sc.setBackColor(Colors.GRAY);
        add(sc, LEFT, TOP, FILL, FILL);

        TimerContainer tcont = new TimerContainer();

        sc2 = new ScrollContainer(true, true);
        sc2.transparentBackground = true;
        sc2.setBorderStyle(BORDER_ROUNDED);

        sc3 = new ScrollContainer(true, true);
        sc3.transparentBackground = true;
        sc3.setBorderStyle(BORDER_ROUNDED);
        // Settings.screenHeight/30, Settings.screenWidth/3
        sc.add(sc2, CENTER, TOP + (int) (Settings.screenHeight * 0.15), (int) (Settings.screenWidth * 0.3),
                (int) (Settings.screenHeight * 0.8));
        sc.add(tcont, CENTER - (int) (Settings.screenWidth * 0.02) - sc2.getWidth(), SAME, sc2.getWidth(),
                sc2.getHeight());
        sc.add(sc3, CENTER + (int) (Settings.screenWidth * 0.02) + sc2.getWidth(), SAME, sc2.getWidth(),
                sc2.getHeight());

        // APP Title
        Label Title = new Label("Show Data");
        Title.setFont(Font.getFont(true, (int) (0.05 * Settings.screenHeight)));

        sc.add(Title, CENTER, TOP + 10);

        // sroll container 2 Actuators
        Label actuators = new Label("Actuators");
        actuators.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));

        Button Actuator1 = new Button("Actuator 1");
        Actuator1.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        Actuator1.setForeColor(Color.getRGB(50, 50, 50));
        Label value1 = new Label("000", CENTER);
        value1.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        value1.setForeColor(Color.getRGB(50, 50, 50));

        Label indicator1 = new Label();
        indicator1.setBackColor(Color.RED);

        Button Actuator2 = new Button("Actuator 2");
        Actuator2.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        Actuator2.setForeColor(Color.getRGB(50, 50, 50));
        Label value2 = new Label("000", CENTER);
        value2.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        value2.setForeColor(Color.getRGB(50, 50, 50));
        Label indicator2 = new Label();
        indicator2.setBackColor(Color.RED);

        Button Actuator3 = new Button("Actuator 3");
        Actuator3.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        Actuator3.setForeColor(Color.getRGB(50, 50, 50));
        Label value3 = new Label("000", CENTER);
        value3.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        value3.setForeColor(Color.getRGB(50, 50, 50));
        Label indicator3 = new Label();
        indicator3.setBackColor(Color.RED);

        Button Actuator4 = new Button("Actuator 4");
        Actuator4.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        Actuator4.setForeColor(Color.getRGB(50, 50, 50));
        Label value4 = new Label("000", CENTER);
        value4.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        value4.setForeColor(Color.getRGB(50, 50, 50));
        Label indicator4 = new Label();
        indicator4.setBackColor(Color.RED);

        Edit PinA = new Edit(); // edit for recive pin for blink
        PinA.caption = "GPIO"; // Edit text
        PinA.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of screen size
        PinA.setMode(Edit.CURRENCY); // set mode numeric
        PinA.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        PinA.setBackForeColors(Color.getRGB(100, 100, 100), Color.BLACK);
        PinA.captionColor = Color.BLACK;

        Button SetValue = new Button("SetValue"); // button for save configuation of blink
        SetValue.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));// set text size 3% of screen size
        SetValue.setForeColor(Color.getRGB(50, 50, 50));

        Edit NewValue = new Edit();
        NewValue.caption = "New Value";
        NewValue.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of screen size
        NewValue.setMode(Edit.CURRENCY); // set mode numeric
        NewValue.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        NewValue.setBackForeColors(Color.getRGB(100, 100, 100), Color.BLACK);
        NewValue.captionColor = Color.BLACK;

        // adicionando a tela
        sc2.add(actuators, CENTER, TOP);

        sc2.add(Actuator1, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.1 * sc2.getWidth()), PREFERRED,
                PREFERRED);
        sc2.add(value1, AFTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.2),
                Actuator1.getHeight());
        sc2.add(indicator1, RIGHT - (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.125),
                Actuator1.getHeight());

        sc2.add(Actuator2, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.1 * sc2.getWidth()), PREFERRED,
                PREFERRED);
        sc2.add(value2, AFTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.2),
                Actuator2.getHeight());
        sc2.add(indicator2, RIGHT - (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.125),
                Actuator2.getHeight());

        sc2.add(Actuator3, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.1 * sc2.getWidth()), PREFERRED,
                PREFERRED);
        sc2.add(value3, AFTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.2),
                Actuator3.getHeight());
        sc2.add(indicator3, RIGHT - (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.125),
                Actuator3.getHeight());

        sc2.add(Actuator4, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.1 * sc2.getWidth()), PREFERRED,
                PREFERRED);
        sc2.add(value4, AFTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.2),
                Actuator4.getHeight());
        sc2.add(indicator4, RIGHT - (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.125),
                Actuator4.getHeight());

        sc2.add(PinA, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.15 * sc2.getWidth()),
                (int) (sc2.getWidth() * 0.3), PREFERRED);
        sc2.add(NewValue, AFTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.45), PREFERRED);
        sc2.add(SetValue, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.05 * sc2.getWidth()),
                (int) (sc2.getWidth() * 0.45), PREFERRED);

        Label Sensors = new Label("Sensors");
        Sensors.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));

        Label Sensor1 = new Label("Sensor 1");
        Sensor1.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        Sensor1.setForeColor(Color.getRGB(50, 50, 50));
        Label values1 = new Label("000", CENTER);
        values1.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        values1.setForeColor(Color.getRGB(50, 50, 50));
        Label indicators1 = new Label();
        indicators1.setBackColor(Color.RED);

        Label Sensor2 = new Label("Sensor 2");
        Sensor2.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        Sensor2.setForeColor(Color.getRGB(50, 50, 50));
        Label values2 = new Label("000", CENTER);
        values2.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        values2.setForeColor(Color.getRGB(50, 50, 50));
        Label indicators2 = new Label();
        indicators2.setBackColor(Color.RED);

        Label Sensor3 = new Label("Sensor 3");
        Sensor3.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        Sensor3.setForeColor(Color.getRGB(50, 50, 50));
        Label values3 = new Label("000", CENTER);
        values3.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        values3.setForeColor(Color.getRGB(50, 50, 50));
        Label indicators3 = new Label();
        indicators3.setBackColor(Color.RED);

        Label Sensor4 = new Label("Sensor 4");
        Sensor4.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        Sensor4.setForeColor(Color.getRGB(50, 50, 50));
        Label values4 = new Label("000", CENTER);
        values4.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
        values4.setForeColor(Color.getRGB(50, 50, 50));
        Label indicators4 = new Label();
        indicators4.setBackColor(Color.RED);

        Edit SensorAS = new Edit();
        SensorAS.caption = "GPIO IN"; // Edit text
        SensorAS.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of screen size
        SensorAS.setMode(Edit.CURRENCY); // set mode numeric
        SensorAS.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        SensorAS.setBackForeColors(Color.getRGB(100, 100, 100), Color.BLACK);
        SensorAS.captionColor = Color.BLACK;

        Edit PinAS = new Edit();
        PinAS.caption = "GPIO OUT"; // Edit text
        PinAS.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of screen size
        PinAS.setMode(Edit.CURRENCY); // set mode numeric
        PinAS.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        PinAS.setBackForeColors(Color.getRGB(100, 100, 100), Color.BLACK);
        PinAS.captionColor = Color.BLACK;

        Edit onvalue = new Edit();
        onvalue.caption = "On Value";
        onvalue.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of screen size
        onvalue.setMode(Edit.CURRENCY); // set mode numeric
        onvalue.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        onvalue.setBackForeColors(Color.getRGB(100, 100, 100), Color.BLACK);
        onvalue.captionColor = Color.BLACK;

        Edit offvalue = new Edit();
        offvalue.caption = "Off Value";
        offvalue.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of screen size
        offvalue.setMode(Edit.CURRENCY); // set mode numeric
        offvalue.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        offvalue.setBackForeColors(Color.getRGB(100, 100, 100), Color.BLACK);
        offvalue.captionColor = Color.BLACK;

        Button SetSensorconfig = new Button("Save");
        SetSensorconfig.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));// set text size 3% of screen
                                                                                          // size
        SetSensorconfig.setForeColor(Color.getRGB(50, 50, 50));

        sc3.add(Sensors, CENTER, TOP);

        sc3.add(Sensor1, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.1 * sc2.getWidth()),
                (int) (sc2.getWidth() * 0.35), PREFERRED);
        sc3.add(values1, CENTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.2),
                Sensor1.getHeight());
        sc3.add(indicators1, RIGHT - (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.125),
                Sensor1.getHeight());

        sc3.add(Sensor2, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.1 * sc2.getWidth()),
                (int) (sc2.getWidth() * 0.35), PREFERRED);
        sc3.add(values2, CENTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.2),
                Sensor2.getHeight());
        sc3.add(indicators2, RIGHT - (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.125),
                Sensor2.getHeight());

        sc3.add(Sensor3, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.1 * sc2.getWidth()),
                (int) (sc2.getWidth() * 0.35), PREFERRED);
        sc3.add(values3, CENTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.2),
                Sensor3.getHeight());
        sc3.add(indicators3, RIGHT - (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.125),
                Sensor3.getHeight());

        sc3.add(Sensor4, LEFT + (int) (0.05 * sc2.getWidth()), AFTER + (int) (0.1 * sc2.getWidth()),
                (int) (sc2.getWidth() * 0.35), PREFERRED);
        sc3.add(values4, CENTER + (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.2),
                Sensor4.getHeight());
        sc3.add(indicators4, RIGHT - (int) (0.05 * sc2.getWidth()), SAME, (int) (sc2.getWidth() * 0.125),
                Sensor4.getHeight());

        sc3.add(SensorAS, CENTER - (int) (0.05 * sc2.getWidth()) - (int) (sc2.getWidth() * 0.17),
                AFTER + (int) (0.1 * sc2.getWidth()), (int) (sc2.getWidth() * 0.4), PREFERRED);
        sc3.add(PinAS, CENTER + (int) (0.05 * sc2.getWidth()) + (int) (sc2.getWidth() * 0.17), SAME,
                (int) (sc2.getWidth() * 0.4), SensorAS.getHeight());

        sc3.add(onvalue, CENTER - (int) (0.05 * sc2.getWidth()) - (int) (sc2.getWidth() * 0.17),
                AFTER + (int) (0.1 * sc2.getWidth()), (int) (sc2.getWidth() * 0.4), PREFERRED);
        sc3.add(offvalue, CENTER + (int) (0.05 * sc2.getWidth()) + (int) (sc2.getWidth() * 0.17), SAME,
                (int) (sc2.getWidth() * 0.4), onvalue.getHeight());

        sc3.add(SetSensorconfig, CENTER - (int) (0.05 * sc2.getWidth()) - (int) (sc2.getWidth() * 0.17),
                AFTER + (int) (0.1 * sc2.getWidth()), (int) (sc2.getWidth() * 0.35), PREFERRED);

    }

}