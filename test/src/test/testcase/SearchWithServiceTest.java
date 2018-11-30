package test.testcase;

import com.qa.framework.TestCaseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import test.datamodel.TestCaseData;
import test.service.SearchService;

public class SearchWithServiceTest extends TestCaseBase {
    @Autowired
    private SearchService searchService;

    @Test(dataProviderClass = TestCaseData.class, dataProvider = "searchData", description = "搜索测试")
    public void pageFactoryTest(String content) {
        searchService.search(content);
    }

    @Test(dataProviderClass = TestCaseData.class, dataProvider = "searchData", description = "搜索测试")
    public void pageFactoryTest2(String content) {
        searchService.search(content);
    }
}
