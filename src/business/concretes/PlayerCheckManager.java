package business.concretes;

import business.abstracts.PlayerCheckService;
import entities.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPlayer(Player player) {
		if (Integer.parseInt(player.getYearOfBirth()) <= 2010) {
			return true;
		}else {
			return false;
		}
	}

}
