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
package testingYago;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.google.GoogleHomePage;
import com.qaprosoft.carina.demo.gui.pages.google.GoogleSecondPage;
import com.qaprosoft.carina.demo.gui.pages.google.dataProvider.GoogleDataProvider;
import com.qaprosoft.carina.demo.gui.pages.promiedos.*;
import com.qaprosoft.carina.demo.gui.pages.promiedos.components.FooterMenuPromiedos;
import com.qaprosoft.carina.demo.gui.pages.promiedos.dataProvider.PromiedosDataProvider;
import com.qaprosoft.carina.demo.gui.pages.wikipedia.components.FooterMenuWikipedia;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;


public class WebSampleTest implements IAbstractTest {

    @Test(description = "Changing between yesterday and tomorrow.")
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testMiddleClick() {
        HomePagePromiedos page = new HomePagePromiedos(getDriver());
        page.LoadPage();
        page.LeftButtonClick();
        page.BannerClick();
        page.RightButtonClick();
        page.LeftButtonClick();
    }

    @Test(description = "Ligue click.")
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testLigueClick() {
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

    @Test(description = "Final stage preparation.")
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testQtarPage() {
        HomePagePromiedos page = new HomePagePromiedos(getDriver());
        Qtar2022 qtar = new Qtar2022(getDriver());
        page.LoadPage();
        page.QtarButtonClick();
        qtar.ArgetinianClick();
        qtar.FranceClick();
        qtar.HolandaClick();
        qtar.MexicoClick();
    }

    @Test(description = "Qtar 2022 test.")
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testQtarPage2() {
        HomePagePromiedos page = new HomePagePromiedos(getDriver());
        Qtar2022 qtar = new Qtar2022(getDriver());
        page.LoadPage();
        page.QtarButtonClick();
        qtar.ChampionsClick();
        page.InstagramCick();
    }

    @Test(description = "Qtar 2022 test.")
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testJpWorldCupPage2() {
        HomePagePromiedos page = new HomePagePromiedos(getDriver());
        JpWorldCupPage worldCupPage = new JpWorldCupPage(getDriver());
        page.LoadPage();
        page.JpWorldCupButtonClick();
        // Click in chelsea vs palmeiras
        worldCupPage.PlusButtonClick();
        page.BannerClick();
        page.JpWorldCupButtonClick();
        worldCupPage.ChampíonsButtonClick();
        worldCupPage.MiniPlusButtonClick();
    }

    @Test(description = "Searching in google.", dataProvider = "items", dataProviderClass = GoogleDataProvider.class)
    @MethodOwner(owner = "YLopolito")
    public void searchGoogleDP(String phrase) {
        GoogleHomePage gogHome = new GoogleHomePage(getDriver());
        gogHome.loadPage();
        gogHome.searchWithDataProviders(phrase);
    }

    @Test(description = "DP + UI COMP.", dataProvider = "search", dataProviderClass = GoogleDataProvider.class)
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testUIComponents(String phrase) {
        GoogleHomePage gogHome = new GoogleHomePage(getDriver());
        GoogleSecondPage gogSec = new GoogleSecondPage(getDriver());
        FooterMenuWikipedia fMWiki = new FooterMenuWikipedia(getDriver());
        gogHome.loadPage();
        gogHome.searchWithDataProviders(phrase);
        gogSec.pageOne();
        fMWiki.UIComponents();
    }

    @Test(description = "Footer menu Promiedos Test")
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testFMPromiedos() {
        HomePagePromiedos promiedosHP = new HomePagePromiedos(getDriver());
        FooterMenuPromiedos footerMenuPromiedos = new FooterMenuPromiedos(getDriver());
        promiedosHP.LoadPage();
        footerMenuPromiedos.footerMenuClick();
    }

    @Test(description = "Promedios Comment.", dataProvider = "data", dataProviderClass = PromiedosDataProvider.class)
    @MethodOwner(owner = "YLopolito")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void testPromiedosCommentWhitDP(String name1, String email, String comment) {
        HomePagePromiedos home = new HomePagePromiedos(getDriver());
        ContactPage contactPage = new ContactPage(getDriver());
        FooterMenuPromiedos footerMenuPromiedos = new FooterMenuPromiedos(getDriver());
        home.LoadPage();
        footerMenuPromiedos.contactClick();
        contactPage.contactTest(name1, email, comment);

    }
}
