import java.util.ArrayList;
import java.util.List;

import adapters.MernisServiceAdapter;
import dataAccess.concretes.GameManager;
import dataAccess.concretes.PlayerManager;
import dataAccess.concretes.SalesCampaignManager;
import entities.Game;
import entities.Player;
import entities.SalesCampaign;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1,"The Witcher", 560.25);
		Game game2 = new Game(2, "Call of Duty", 300.65);
		Player player = new Player(1,"41200425446", "Büşra", "Erçelik", "1994");
		SalesCampaign campaign = new SalesCampaign(1, "Summer100", "%90");
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.save(player);
		
		GameManager gameManager = new GameManager();
		List<Game> gameList = new ArrayList<Game>();
		gameList.add(game1);
		gameList.add(game2);
		gameManager.addMultipleGamesForUser(gameList, player);
		
		SalesCampaignManager campaignManager = new SalesCampaignManager();
		campaignManager.add(campaign, game2);
	}

}
