package dataAccess.concretes;

import dataAccess.abstracts.SalesCampaignService;
import entities.Game;
import entities.SalesCampaign;

public class SalesCampaignManager implements SalesCampaignService{

	@Override
	public void add(SalesCampaign campaign, Game game) {
		System.out.println(campaign.getCampaignCode()+" is added for "+game.getGameName());
	}

	@Override
	public void delete(SalesCampaign campaign, Game game) {
		System.out.println(campaign.getCampaignCode()+" is deleted from "+game.getGameName());
	}

	@Override
	public void update(SalesCampaign campaign, Game game) {
		System.out.println(campaign.getCampaignCode()+" is updated for "+game.getGameName());
	}
	
	}
