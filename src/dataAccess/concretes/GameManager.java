package dataAccess.concretes;

import java.util.Iterator;
import java.util.List;

import dataAccess.abstracts.GameService;
import entities.Game;
import entities.Player;

public class GameManager implements GameService{

	@Override
	public void add(Game game, Player player) {
		System.out.println(game.getGameName()+" is added in "+ player.getFirstName()+"'s account.");
	}

	@Override
	public void update(Game game, Player player) {
		System.out.println(game.getGameName()+" is updated in "+ player.getFirstName()+"'s account.");
	}

	@Override
	public void delete(Game game, Player player) {
		System.out.println(game.getGameName()+" is deleted from "+ player.getFirstName()+"'s account.");
	}

	@Override
	public void addMultipleGamesForUser(List<Game> games,Player player) {
		for(Game game: games) {
			add(game, player);
		}
	}

}
