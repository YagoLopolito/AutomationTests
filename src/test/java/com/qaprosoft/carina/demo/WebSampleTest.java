/*
 * Copyright 2013-2021 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.carina.demo;

import java.util.List;

import com.qaprosoft.carina.demo.gui.pages.promiedos.HomePagePromiedos;
import com.qaprosoft.carina.demo.gui.pages.promiedos.LiguePage;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.NewsItem;
import com.qaprosoft.carina.demo.gui.components.compare.ModelSpecs;
import com.qaprosoft.carina.demo.gui.components.compare.ModelSpecs.SpecType;


public class WebSampleTest implements IAbstractTest {

    @Test(description = "Changing between yesterday and tomorrow.")
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testMiddleClick(){
        HomePagePromiedos page = new HomePagePromiedos(getDriver());
        page.LoadPage();
        page.LeftButtonClick();
        page.BannerClick();
        page.RightButtonClick();
        page.LeftButtonClick();
    }
    @Test(description = "Changing between yesterday and tomorrow.")
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testLigueClick(){
        HomePagePromiedos page = new HomePagePromiedos(getDriver());
        LiguePage page2 = new LiguePage(getDriver());
        page.LoadPage();
        page.LigueButtonClick();
        page2.NextGameClick();
        page2.NextGameClick();
        page2.NextGameClick();
        page2.LastGameClick();
        page2.LastGameClick();
        page2.TittlesButtonClick();

    }
}
