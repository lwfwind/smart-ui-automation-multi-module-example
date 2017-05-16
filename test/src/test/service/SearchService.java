package test.service;

import com.qa.framework.ServiceBase;
import com.qa.framework.ioc.annotation.Autowired;
import test.page.SearchPage;

public class SearchService extends ServiceBase {
    @Autowired
    SearchPage searchPage;

    public void search(String content){
        searchPage.searchFor(content);
        searchPage.verifyResult();
    }
}
