package test.page;

import com.qa.framework.config.Value;
import com.qa.framework.ioc.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

@Page
public class SearchPage {

    @Autowired
    private WebDriver driver;
    @Value("webPath")
    private String url;
    @FindBy(id = "kw")
    private WebElement searchTestBox;

    public void searchFor(String text) {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        searchTestBox.sendKeys(text);
        searchTestBox.submit();
    }

    public void verifyResult() {
        Assert.assertTrue(driver.getTitle().contains("百度搜索"), driver.getTitle());
    }

}
