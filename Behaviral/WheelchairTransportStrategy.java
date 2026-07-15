package Behaviral;

import Creational.Patient;

public class WheelchairTransportStrategy implements TransportStrategy {

	@Override
	public boolean transport(Patient p) {
		// TODO Auto-generated method stub
		if(p.isInfection()) return false;
		if(p.getSeverityLevel() >7) return false;
		return true;
	}

}
