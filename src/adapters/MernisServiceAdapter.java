package adapters;

import java.rmi.RemoteException;

import business.abstracts.PlayerCheckService;
import entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean checkIfRealPlayer(Player player) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
		    result = client.TCKimlikNoDogrula(
					Long.parseLong(player.getNationalityId()), 
					player.getFirstName(), 
					player.getLastName(),
					Integer.parseInt(player.getYearOfBirth()));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NumberFormatException occured!");
		} catch (RemoteException e) {
			e.printStackTrace();
			System.out.println("There is no client with these credentials!");
		}
		
		return result;
	}

}
