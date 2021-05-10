package dataAccess.abstracts;

import entities.Player;

public interface PlayerService {
	void save(Player player);
	void delete(Player player);
	void update(Player player);
}
