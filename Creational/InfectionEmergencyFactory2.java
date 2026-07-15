package Creational;

public class InfectionEmergencyFactory2 implements EmergencyTeamFactory {

	@Override
	public Doctor createDoctor(String specialization, String name, String email) {
		// TODO Auto-generated method stub
		return new Doctor(specialization, name, email);
	}

	@Override
	public Nurse createNurse(String role, String name, String email) {
		// TODO Auto-generated method stub
		return new Nurse(role, name);
	}

	@Override
	public TreatmentRoom createTreatmentRoom(String roomType) {
		// TODO Auto-generated method stub
		return new TreatmentRoom(roomType);
	}


}
