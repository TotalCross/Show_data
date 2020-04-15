package com.totalcross.sample.showData.ui;

import com.totalcross.sample.showData.util.Colors;
import com.totalcross.sample.showData.util.MaterialConstants;

import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.layout.HBox;

public class TimerContainer extends Container {

        @Override
        public void initUI() {
                // TODO Auto-generated method stub
                super.initUI();

                ScrollContainer sc1 = new ScrollContainer(true, true);
                // sc1.setBackColor(Color.RED);
                sc1.transparentBackground = true;
                sc1.setBorderStyle(BORDER_ROUNDED);

                add(sc1, LEFT, TOP, FILL, FILL);

                // scroll container 1 Timer e blink
                Label timerLb = new Label("Timer"); // title of container
                timerLb.transparentBackground = true; // set background transparent
                timerLb.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // define text size 3% of
                                                                                           // screen size

                Edit pintEdit = new Edit(); // edit for recive pin for timer
                pintEdit.caption = "GPIO"; // Edit text
                pintEdit.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of
                                                                                            // screen size
                pintEdit.setMode(Edit.CURRENCY); // set mode numeric
                pintEdit.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
                pintEdit.setBackForeColors(Colors.GRAY, Color.BLACK);
                pintEdit.captionColor = Color.BLACK;

                Button savetBt = new Button("Save"); // button for save configuation of timer
                savetBt.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));// set text size 3% of screen
                                                                                          // size
                savetBt.setBackForeColors(Colors.BLUE, Colors.WHITE);

                Edit starttEdit = new Edit("99" + Settings.timeSeparator + "99" + Settings.timeSeparator + "99");
                starttEdit.caption = "Start";
                starttEdit.setValidChars("0123456789AMP");
                starttEdit.setMode(Edit.NORMAL, true);
                starttEdit.setKeyboard(Edit.KBD_TIME);
                starttEdit.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
                starttEdit.setBackForeColors(Colors.GRAY, Color.BLACK);
                starttEdit.captionColor = Color.BLACK;

                Edit endtEdit = new Edit("99" + Settings.timeSeparator + "99" + Settings.timeSeparator + "99");
                endtEdit.caption = "End";
                endtEdit.setValidChars("0123456789AMP");
                endtEdit.setMode(Edit.NORMAL, true);
                endtEdit.setKeyboard(Edit.KBD_TIME);
                endtEdit.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));
                endtEdit.setBackForeColors(Colors.GRAY, Color.BLACK);
                endtEdit.captionColor = Color.BLACK;

                HBox box = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_STRETCH);
                box.add(starttEdit);
                box.add(endtEdit);
                box.setSpacing(MaterialConstants.COMPONENT_SPACING);

                // add components for timer
                sc1.add(timerLb, CENTER, TOP);
                sc1.add(box, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.COMPONENT_SPACING,
                                FILL - MaterialConstants.BORDER_SPACING, MaterialConstants.EDIT_HEIGHT);

                box = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_STRETCH);
                box.add(pintEdit);
                box.add(savetBt);
                box.setSpacing(MaterialConstants.COMPONENT_SPACING);

                sc1.add(box, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.COMPONENT_SPACING,
                                FILL - MaterialConstants.BORDER_SPACING, MaterialConstants.EDIT_HEIGHT);

                // blink
                Edit pinbEdit = new Edit(); // edit for recive pin for blink
                pinbEdit.caption = "GPIO"; // Edit text
                pinbEdit.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of
                                                                                            // screen
                                                                                            // size
                pinbEdit.setMode(Edit.CURRENCY); // set mode numeric
                pinbEdit.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
                pinbEdit.setForeColor(Color.BLACK);
                pinbEdit.setBackForeColors(Colors.GRAY, Color.BLACK);
                pinbEdit.captionColor = Color.BLACK;

                Button saveButton = new Button("Save"); // button for save configuation of blink
                saveButton.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));// set text size 3% of
                                                                                             // screen
                                                                                             // size
                saveButton.setBackForeColors(Colors.BLUE, Colors.WHITE);

                Edit startEdit = new Edit("99" + Settings.timeSeparator + "99" + Settings.timeSeparator + "99");
                startEdit.caption = "Start";
                startEdit.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of
                                                                                             // screen size
                startEdit.setMode(Edit.CURRENCY); // set mode numeric
                startEdit.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
                startEdit.setBackForeColors(Colors.GRAY, Color.BLACK);
                startEdit.captionColor = Color.BLACK;

                Edit endEdit = new Edit("99" + Settings.timeSeparator + "99" + Settings.timeSeparator + "99");
                endEdit.caption = "End";
                endEdit.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of screen
                                                                                           // size
                endEdit.setMode(Edit.CURRENCY); // set mode numeric
                endEdit.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
                endEdit.setBackForeColors(Colors.GRAY, Color.BLACK);
                endEdit.captionColor = Color.BLACK;

                Edit repeatEdit = new Edit("99" + Settings.timeSeparator + "99" + Settings.timeSeparator + "99");
                repeatEdit.caption = "Repeat";
                repeatEdit.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of
                                                                                              // screen // size
                repeatEdit.setMode(Edit.CURRENCY); // set mode numeric
                repeatEdit.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
                repeatEdit.setBackForeColors(Colors.GRAY, Color.BLACK);
                repeatEdit.captionColor = Color.BLACK;

                box = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_STRETCH);
                box.setSpacing(MaterialConstants.COMPONENT_SPACING);
                box.add(startEdit);
                box.add(endEdit);

                sc1.add(box, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.COMPONENT_SPACING,
                                FILL - MaterialConstants.BORDER_SPACING, MaterialConstants.EDIT_HEIGHT);

                sc1.add(repeatEdit, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.COMPONENT_SPACING,
                                FILL - MaterialConstants.BORDER_SPACING, MaterialConstants.EDIT_HEIGHT);

                box = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_STRETCH);
                box.setSpacing(MaterialConstants.COMPONENT_SPACING);
                box.add(pinbEdit);
                box.add(saveButton);

                sc1.add(box, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.COMPONENT_SPACING,
                                FILL - MaterialConstants.BORDER_SPACING, MaterialConstants.EDIT_HEIGHT);

                // clear timer/ blink of pin
                Edit pincEdit = new Edit(); // edit for recive pin for clear configuration of timer/blink
                pincEdit.caption = "GPIO"; // Edit text
                pincEdit.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight))); // set text size 3% of
                                                                                            // screen size
                pincEdit.setMode(Edit.CURRENCY); // set mode numeric
                pincEdit.setKeyboard(Edit.KBD_NUMERIC); // lock all non-numeric keys for this edit
                pincEdit.setBackForeColors(Colors.GRAY, Color.BLACK);
                pincEdit.captionColor = Color.BLACK;

                Button clearButton = new Button("Clear"); // button for clear configuration of timer/blink
                clearButton.setFont(Font.getFont(true, (int) (0.03 * Settings.screenHeight)));// set text size 3% of
                                                                                              // screen size
                clearButton.setBackForeColors(Colors.BLUE, Colors.WHITE);

                box = new HBox(HBox.LAYOUT_FILL, HBox.ALIGNMENT_STRETCH);
                box.setSpacing(MaterialConstants.COMPONENT_SPACING);
                box.add(pincEdit);
                box.add(clearButton);

                sc1.add(box, LEFT + MaterialConstants.BORDER_SPACING, AFTER + MaterialConstants.COMPONENT_SPACING,
                                FILL - MaterialConstants.BORDER_SPACING, MaterialConstants.EDIT_HEIGHT);

        }

}