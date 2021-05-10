package dataAccess.abstracts;

import entities.Game;
import entities.SalesCampaign;

public interface SalesCampaignService {
	void add(SalesCampaign campaign, Game game);
	void delete(SalesCampaign campaign, Game game);
	void update(SalesCampaign campaign, Game game);
}
