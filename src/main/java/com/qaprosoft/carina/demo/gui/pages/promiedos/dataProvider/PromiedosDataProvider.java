package com.qaprosoft.carina.demo.gui.pages.promiedos.dataProvider;

import org.testng.annotations.DataProvider;

public class PromiedosDataProvider {
    public PromiedosDataProvider() {
    }

    @DataProvider(name = "data")
    public Object[][] placingData() {
        Object[][] data = {{"Yago Lopolito", "Yagolopolito@hotmail.com", "Daledale dale daledale dale dale vooca"}};
        return data;
    }
}
