package com.totalcross.sample.showData;

import totalcross.ui.MainWindow;
import totalcross.ui.font.Font;

import com.totalcross.sample.showData.ui.ShowDataContainer;
import com.totalcross.sample.showData.util.Fonts;

import totalcross.sys.Settings;
import totalcross.sys.Vm;

public class ShowData extends MainWindow {
    public static final String version = "1.0.0";

    
    public ShowData() {
        super("Show Data", NO_BORDER);
        setUIStyle(Settings.VISTA_UI);
        setDefaultFont(Font.getFont(Fonts.FONT_DEFAULT_SIZE));

    }

    static {
		Settings.applicationId = "SDSA";
		Settings.appVersion = version;
		Settings.iosCFBundleIdentifier = "com.totalcross.mocknbuild";
	}

    @Override
    public void initUI() {
        super.initUI();

        ShowDataContainer container = new ShowDataContainer();
        swap(container);
    }

}
