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

public class ActuatorContainer extends Container {
    @Override
    public void initUI() {
        super.initUI();
        ScrollContainer sc = new ScrollContainer(true, true);
        sc.transparentBackground = true;
        sc.setBorderStyle(BORDER_ROUNDED);
        add(sc, LEFT, TOP, FILL, FILL);
        // sroll container 2 Actuators
        Label actuators = new Label("Actuators", CENTER);
        actuators.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));

        Button Actuator1 = new Button("Actuator 1");
        Actuator1.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        Actuator1.setBackForeColors(Colors.BLUE, Colors.WHITE);
        Label value1 = new Label("000", CENTER);
        value1.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        value1.setForeColor(Colors.DARK_GRAY);

        Label indicator1 = new Label();
        indicator1.setBackColor(Color.RED);

        Button Actuator2 = new Button("Actuator 2");
        Actuator2.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        Actuator2.setBackForeColors(Colors.BLUE, Colors.WHITE);
        Label value2 = new Label("000", CENTER);
        value2.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        value2.setForeColor(Colors.DARK_GRAY);
        Label indicator2 = new Label();
        indicator2.setBackColor(Color.RED);

        Button Actuator3 = new Button("Actuator 3");
        Actuator3.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        Actuator3.setBackForeColors(Colors.BLUE, Colors.WHITE);
        Label value3 = new Label("000", CENTER);
        value3.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        value3.setForeColor(Colors.DARK_GRAY);
        Label indicator3 = new Label();
        indicator3.setBackColor(Color.RED);

        Button Actuator4 = new Button("Actuator 4");
        Actuator4.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        Actuator4.setBackForeColors(Colors.BLUE, Colors.WHITE);
        Label value4 = new Label("000", CENTER);
        value4.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));
        value4.setForeColor(Colors.DARK_GRAY);
        Label indicator4 = new Label();
        indicator4.setBackColor(Color.RED);

        Edit PinA = new Edit(); // edit for recive pin for blink
        PinA.caption = "GPIO"; // Edit text
        PinA.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE)); // set text size 3%
        PinA.setMode(Edit.CURRENCY); // set mode numeric
        PinA.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        PinA.setForeColor(Color.BLACK);
        PinA.setBackForeColors(Colors.GRAY, Color.BLACK);
        PinA.captionColor = Color.BLACK;

        Button SetValue = new Button("SetValue"); // button for save configuation of blink
        SetValue.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE));// set text size 3% of screen size
        SetValue.setBackForeColors(Colors.BLUE, Colors.WHITE);

        Edit NewValue = new Edit();
        NewValue.caption = " Value";
        NewValue.setFont(Font.getFont(true, MaterialConstants.TEXT_SIZE)); // set text size 3%
        NewValue.setMode(Edit.CURRENCY); // set mode numeric
        NewValue.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
        NewValue.setForeColor(Color.BLACK);
        NewValue.setBackForeColors(Colors.GRAY, Color.BLACK);
        NewValue.captionColor = Color.BLACK;

        // adicionando a tela
        sc.add(actuators, CENTER, TOP, sc.getWidth(), MaterialConstants.EDIT_HEIGHT);

        VBox boxi = new VBox(VBox.LAYOUT_FILL, VBox.ALIGNMENT_STRETCH);
        boxi.add(indicator1);
        boxi.add(indicator2);
        boxi.add(indicator3);
        boxi.add(indicator4);
        boxi.setSpacing(MaterialConstants.COMPONENT_SPACING);

        sc.add(boxi, RIGHT - MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.COMPONENT_SPACING,
                MaterialConstants.EDIT_HEIGHT,
                (MaterialConstants.COMPONENT_SPACING + MaterialConstants.EDIT_HEIGHT) * 4);

        VBox boxv = new VBox(VBox.LAYOUT_FILL, VBox.ALIGNMENT_STRETCH);
        boxv.add(value1);
        boxv.add(value2);
        boxv.add(value3);
        boxv.add(value4);

        boxv.setSpacing(MaterialConstants.COMPONENT_SPACING);
        sc.add(boxv, BEFORE - MaterialConstants.BORDER_SPACING, SAME, PREFERRED, boxi.getHeight());

        VBox boxa = new VBox(VBox.LAYOUT_FILL, VBox.ALIGNMENT_STRETCH);
        boxa.add(Actuator1);
        boxa.add(Actuator2);
        boxa.add(Actuator3);
        boxa.add(Actuator4);
        boxa.setSpacing(MaterialConstants.COMPONENT_SPACING);

        sc.add(boxa, LEFT + MaterialConstants.BORDER_SPACING, SAME,
                boxv.getX() - MaterialConstants.COMPONENT_SPACING * 3, boxv.getHeight());

        HBox box = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_STRETCH);
        box.add(PinA);
        box.add(NewValue);
        box.setSpacing(MaterialConstants.COMPONENT_SPACING);

        sc.add(box, SAME, AFTER + MaterialConstants.BORDER_SPACING, FILL - MaterialConstants.BORDER_SPACING,
                MaterialConstants.EDIT_HEIGHT);
        sc.add(SetValue, SAME, AFTER + MaterialConstants.COMPONENT_SPACING, PinA.getWidth(),
                MaterialConstants.EDIT_HEIGHT);

    }

}