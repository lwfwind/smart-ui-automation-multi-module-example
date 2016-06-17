package test.datamodel;

import org.testng.annotations.DataProvider;

import java.util.Map;

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
