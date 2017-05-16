package test.page;

import com.qa.framework.PageBase;
import com.qa.framework.config.PropConfig;
import com.qa.framework.config.Value;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchPage extends PageBase {

    @Value("webPath")
    private String url;
    @FindBy(id = "kw")
    private WebElement searchTestBox;

    public void searchFor(String text) {
        open(url);
        searchTestBox.sendKeys(text);
        searchTestBox.submit();
    }

    public void verifyResult() {
        Assert.assertTrue(getPageTitle().contains("百度搜索"),getPageTitle());
    }

}
