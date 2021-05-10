package business.abstracts;

import entities.Game;
import entities.Player;
import entities.SalesCampaign;

public interface CampaignService {
	void assignCampaignToGame(Game game, SalesCampaign campaign);
	void assignCampaignToPlayer(Player player, SalesCampaign campaign);
}
