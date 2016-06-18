package test.testcase;

import com.qa.framework.TestCaseBase;
import com.qa.framework.ioc.annotation.AutoInject;
import test.datamodel.TestCaseData;
import test.page.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends TestCaseBase {
    @AutoInject
    SearchPage searchPage;

    @Test(dataProviderClass = TestCaseData.class, dataProvider = "searchData", description = "搜索测试")
    public void pageFactoryTest(String content) {
        searchPage.searchFor(content);
        searchPage.verifyResult();
    }
}
