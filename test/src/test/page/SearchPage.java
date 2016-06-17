package test.page;

import com.qa.framework.PageBase;
import com.qa.framework.config.PropConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchPage extends PageBase {

    String url = PropConfig.getWebPath();
    @FindBy(id = "kw")
    public WebElement searchTestBox;

    public void searchFor(String text) {
        open(url);
        searchTestBox.sendKeys(text);
        searchTestBox.submit();
    }

    public void verifyResult() {
        Assert.assertTrue(getPageTitle().contains("百度搜索"),getPageTitle());
    }

}
