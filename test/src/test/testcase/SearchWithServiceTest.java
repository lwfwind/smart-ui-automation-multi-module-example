package test.testcase;

import com.qa.framework.TestCaseBase;
import com.qa.framework.ioc.annotation.Autowired;
import org.testng.annotations.Test;
import test.datamodel.TestCaseData;
import test.service.SearchService;

public class SearchWithServiceTest extends TestCaseBase {
    @Autowired
    SearchService searchService;

    @Test(dataProviderClass = TestCaseData.class, dataProvider = "searchData", description = "搜索测试")
    public void pageFactoryTest(String content) {
        searchService.search(content);
    }
}
