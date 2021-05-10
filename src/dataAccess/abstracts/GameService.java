package dataAccess.abstracts;

import java.util.List;

import entities.Game;
import entities.Player;

public interface GameService {
	void add(Game game, Player player);
	void update(Game game, Player player);
	void delete(Game game, Player player);
	void addMultipleGamesForUser(List<Game> games, Player player);
}
