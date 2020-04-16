package com.totalcross.sample.showData.ui;

import com.totalcross.sample.showData.util.Colors;

import totalcross.sys.Settings;
// import totalcross.ui.Button;
import totalcross.ui.Container;
// import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
// import totalcross.ui.gfx.Color;

public class ShowDataContainer extends Container {

    private ScrollContainer sc;

    @Override
    public void initUI() {
        // adicionando containers
        sc = new ScrollContainer(true, true);
        sc.setBackColor(Colors.GRAY);
        add(sc, LEFT, TOP, FILL, FILL);

        TimerContainer tcont = new TimerContainer();
        ActuatorContainer Acont = new ActuatorContainer();
        SensorContainer Scont = new SensorContainer();

        // Settings.screenHeight/30, Settings.screenWidth/3
        sc.add(Acont, CENTER, TOP + (int) (Settings.screenHeight * 0.15), (int) (Settings.screenWidth * 0.3),
                (int) (Settings.screenHeight * 0.8));
        sc.add(tcont, CENTER - (int) (Settings.screenWidth * 0.02) - Acont.getWidth(), SAME, Acont.getWidth(),
                Acont.getHeight());
        sc.add(Scont, CENTER + (int) (Settings.screenWidth * 0.02) + Acont.getWidth(), SAME, Acont.getWidth(),
                Acont.getHeight());

        // APP Title
        Label Title = new Label("Show Data");
        Title.setFont(Font.getFont(true, (int) (0.05 * Settings.screenHeight)));

        sc.add(Title, CENTER, TOP + 10);

    }

}