package com.qaprosoft.carina.demo.gui.pages.google.dataProvider;

import org.testng.annotations.DataProvider;

public class GoogleDataProvider {
    public GoogleDataProvider() {
    }

    @DataProvider(name = "items")
    public Object[][] searchData(){
        Object[][]data ={{"Liga Argentina"},{"Messi"},{"Palermo"},{"Riquelme"}};
        return data;
    }
    @DataProvider(name = "search")
    public Object[][] searchPanda(){
        Object[][]data ={{"Panda Gigante"}};
        return data;
    }
}