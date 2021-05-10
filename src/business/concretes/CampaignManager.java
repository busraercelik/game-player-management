package business.concretes;

import business.abstracts.CampaignService;
import entities.Game;
import entities.Player;
import entities.SalesCampaign;

public class CampaignManager implements CampaignService{

	@Override
	public void assignCampaignToGame(Game game, SalesCampaign campaign) {
		System.out.println(campaign.getCampaignCode()+" is addigned to "
					+game.getGameName()+" with "+campaign.getDiscountAmount()+" discount");
	}

	@Override
	public void assignCampaignToPlayer(Player player, SalesCampaign campaign) {
		System.out.println(campaign.getCampaignCode()+" is addigned to "
				+player.getFirstName()+" with "+campaign.getDiscountAmount()+" discount");
	}

}
