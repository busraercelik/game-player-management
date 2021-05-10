package dataAccess.concretes;

import business.abstracts.BasePlayerManager;
import business.abstracts.PlayerCheckService;
import dataAccess.abstracts.PlayerService;
import entities.Player;

public class PlayerManager extends BasePlayerManager implements PlayerService{
	
	PlayerCheckService checkService;
	
	public PlayerManager(PlayerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Player player) {
		System.out.println(player.getFirstName() + " named player is saved to db!");
	}
	
	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " named player is saved from db!");
	}
	
	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " named player is updated in db!");
	}
}
