package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
