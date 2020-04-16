package com.totalcross.sample.showData.ui;

import com.totalcross.sample.showData.util.Colors;
import com.totalcross.sample.showData.util.MaterialConstants;

// import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.layout.HBox;
import totalcross.ui.layout.VBox;

public class SensorContainer extends Container {
    @Override
    public void initUI(){
        super.initUI();
        ScrollContainer sc = new ScrollContainer(true, true);
        sc.transparentBackground = true;
        sc.setBorderStyle(BORDER_ROUNDED);
        add(sc, LEFT, TOP, FILL, FILL);

        Label Sensors = new Label("Sensors", CENTER);
        Sensors.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));

        Label Sensor1 = new Label("Sensor 1");
        Sensor1.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        Sensor1.setForeColor(Colors.DARK_GRAY);
        Label values1 = new Label("000", CENTER);
        values1.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        values1.setForeColor(Colors.DARK_GRAY);
        Label indicators1 = new Label();
        indicators1.setBackColor(Color.RED);

        Label Sensor2 = new Label("Sensor 2");
        Sensor2.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        Sensor2.setForeColor(Colors.DARK_GRAY);
        Label values2 = new Label("000", CENTER);
        values2.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        values2.setForeColor(Colors.DARK_GRAY);
        Label indicators2 = new Label();
        indicators2.setBackColor(Color.RED);

        Label Sensor3 = new Label("Sensor 3");
        Sensor3.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        Sensor3.setForeColor(Colors.DARK_GRAY);
        Label values3 = new Label("000", CENTER);
        values3.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        values3.setForeColor(Colors.DARK_GRAY);
        Label indicators3 = new Label();
        indicators3.setBackColor(Color.RED);

        Label Sensor4 = new Label("Sensor 4");
        Sensor4.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        Sensor4.setForeColor(Colors.DARK_GRAY);
        Label values4 = new Label("000", CENTER);
        values4.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        values4.setForeColor(Colors.DARK_GRAY);
        Label indicators4 = new Label();
        indicators4.setBackColor(Color.RED);

        Edit SensorAS = new Edit();
        SensorAS.caption = "GPIO IN"; // Edit text
        SensorAS.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE)); // set text size 3% 
        SensorAS.setMode(Edit.CURRENCY); // set mode numeric
        SensorAS.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        SensorAS.setForeColor(Color.BLACK);
        SensorAS.setBackForeColors(Colors.GRAY, Color.BLACK);
        SensorAS.captionColor = Color.BLACK;

        Edit PinAS = new Edit();
        PinAS.caption = "GPIO OUT"; // Edit text
        PinAS.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE)); // set text size 3% 
        PinAS.setMode(Edit.CURRENCY); // set mode numeric
        PinAS.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        PinAS.setForeColor(Color.BLACK);
        PinAS.setBackForeColors(Colors.GRAY, Color.BLACK);
        PinAS.captionColor = Color.BLACK;

        Edit onvalue = new Edit();
        onvalue.caption = "On Value";
        onvalue.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE)); // set text size 3% 
        onvalue.setMode(Edit.CURRENCY); // set mode numeric
        onvalue.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        onvalue.setForeColor(Color.BLACK);
        onvalue.setBackForeColors(Colors.GRAY, Color.BLACK);
        onvalue.captionColor = Color.BLACK;

        Edit offvalue = new Edit();
        offvalue.caption = "Off Value";
        offvalue.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE)); // set text size 3% 
        offvalue.setMode(Edit.CURRENCY); // set mode numeric
        offvalue.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        offvalue.setForeColor(Color.BLACK);
        offvalue.setBackForeColors(Colors.GRAY, Color.BLACK);
        offvalue.captionColor = Color.BLACK;

        Button SetSensorconfig = new Button("Save");
        SetSensorconfig.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));// set text size 3% of screen
                                                                                          // size
        SetSensorconfig.setBackForeColors(Colors.BLUE, Colors.WHITE);

        sc.add(Sensors, CENTER, TOP,sc.getWidth(),MaterialConstants.EDIT_HEIGHT);

        
        VBox boxi = new VBox(VBox.LAYOUT_FILL, VBox.ALIGNMENT_STRETCH);
        boxi.add(indicators1);
        boxi.add(indicators2);
        boxi.add(indicators3);
        boxi.add(indicators4);
        boxi.setSpacing(MaterialConstants.COMPONENT_SPACING);

        sc.add(boxi,RIGHT-MaterialConstants.BORDER_SPACING,AFTER+MaterialConstants.COMPONENT_SPACING,
            MaterialConstants.EDIT_HEIGHT,(MaterialConstants.COMPONENT_SPACING+MaterialConstants.EDIT_HEIGHT)*4);

        VBox boxv = new VBox(VBox.LAYOUT_FILL, VBox.ALIGNMENT_STRETCH);
        boxv.add(values1);
        boxv.add(values2);
        boxv.add(values3);
        boxv.add(values4);

        boxv.setSpacing(MaterialConstants.COMPONENT_SPACING);
        sc.add(boxv,BEFORE - MaterialConstants.BORDER_SPACING, SAME,
        PREFERRED,boxi.getHeight());

        VBox boxa = new VBox(VBox.LAYOUT_FILL, VBox.ALIGNMENT_STRETCH);
        boxa.add(Sensor1);
        boxa.add(Sensor2);
        boxa.add(Sensor3);
        boxa.add(Sensor4);
        boxa.setSpacing(MaterialConstants.COMPONENT_SPACING);

        sc.add(boxa,LEFT + MaterialConstants.BORDER_SPACING, SAME,
        boxv.getX()-MaterialConstants.COMPONENT_SPACING*3,
        boxv.getHeight());
        
        HBox box = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_STRETCH);
        box.add(SensorAS);
        box.add(PinAS);
        box.setSpacing(MaterialConstants.COMPONENT_SPACING);

        sc.add(box,SAME,AFTER+MaterialConstants.BORDER_SPACING,
        FILL-MaterialConstants.BORDER_SPACING,MaterialConstants.EDIT_HEIGHT);

        box = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_STRETCH);
        box.add(onvalue);
        box.add(offvalue);
        box.setSpacing(MaterialConstants.COMPONENT_SPACING);

        sc.add(box,SAME,AFTER+MaterialConstants.COMPONENT_SPACING,
        FILL-MaterialConstants.BORDER_SPACING,MaterialConstants.EDIT_HEIGHT);

    
        sc.add(SetSensorconfig,SAME,AFTER+MaterialConstants.COMPONENT_SPACING,
        onvalue.getWidth(),MaterialConstants.EDIT_HEIGHT);

        

    }

}