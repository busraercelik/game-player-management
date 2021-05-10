package business.abstracts;

import dataAccess.abstracts.PlayerService;
import entities.Player;

public abstract class BasePlayerManager implements PlayerService{
	
	@Override
	public void save(Player player) {
		System.out.println(player.getFirstName()+" saved succesfully.");
	}
}
