package test.service;

import com.qa.framework.ServiceBase;
import com.qa.framework.ioc.annotation.AutoInject;
import test.page.SearchPage;

public class SearchService extends ServiceBase {
    @AutoInject
    SearchPage searchPage;

    public void search(String content){
        searchPage.searchFor(content);
        searchPage.verifyResult();
    }
}
