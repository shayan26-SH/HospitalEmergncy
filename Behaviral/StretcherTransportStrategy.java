package Behaviral;

import Creational.Patient;

public class StretcherTransportStrategy implements TransportStrategy {

	@Override
	public boolean transport(Patient p) {
		// TODO Auto-generated method stub
		if (p.isInfection())
			return false;
		if (p.getSeverityLevel() < 4)
			return false;
		return true;
	}

}
