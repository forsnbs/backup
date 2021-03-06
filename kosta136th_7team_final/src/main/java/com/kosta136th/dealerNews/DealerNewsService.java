package com.kosta136th.dealerNews;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface DealerNewsService {

	List<DealerNews> getDealerNewsList(int startDealerNewsIndex, int howMuch, String dealerName);

	DealerNews getPageMaker(DealerNews dealerNews, String dealerName);

	void getPageMakerByDealerNewsNo(DealerNews pageMaker, String dealerName);

	void writeNews(DealerNews dealerNews, String dealerName);

	void deleteNews(DealerNews dealerNews, String dealerName);

	DealerNews getNews(DealerNews dealerNews, String dealerName);

	void modifyNews(DealerNews dealerNews, String dealerName);

	DealerNews getPreviousNews(DealerNews dealerNews, String dealerName);

	DealerNews getNextNews(DealerNews dealerNews, String dealerName);

	int getDealerNewsListSize(String dealerName);

}
