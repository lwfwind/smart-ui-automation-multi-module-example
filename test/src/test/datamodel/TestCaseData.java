package test.datamodel;

import org.testng.annotations.DataProvider;

/**
 * Created by kcgw001 on 2016/4/29.
 */
public class TestCaseData {

    @DataProvider(name = "searchData")
    public static Object[][] searchData() {
        return new Object[][]{
                {"test"}
        };
    }
}
