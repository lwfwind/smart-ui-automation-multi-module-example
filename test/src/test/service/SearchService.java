package test.service;

import com.qa.framework.ioc.annotation.Autowired;
import com.qa.framework.ioc.annotation.Service;
import test.page.SearchPage;

@Service
public class SearchService {
    @Autowired
    private SearchPage searchPage;

    public void search(String content) {
        searchPage.searchFor(content);
        searchPage.verifyResult();
    }
}
