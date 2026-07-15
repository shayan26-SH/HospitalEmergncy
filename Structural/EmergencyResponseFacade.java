package Structural;

import Creational.*;
import Behaviral.*;

public class EmergencyResponseFacade {
	private PatientRegistrationSystem register;
	private RoomPreparation room;
	private MedicalEquipmentSystem equip;
	private NotificationSystem notify;

	public EmergencyResponseFacade(PatientRegistrationSystem register, RoomPreparation room,
			MedicalEquipmentSystem equip, NotificationSystem notify) {
		this.register = register;
		this.room = room;
		this.equip = equip;
		this.notify = notify;
	}

	/**
	 * @return the register
	 */
	public PatientRegistrationSystem getRegister() {
		return register;
	}

	/**
	 * @param register the register to set
	 */
	public void setRegister(PatientRegistrationSystem register) {
		this.register = register;
	}

	/**
	 * @return the room
	 */
	public RoomPreparation getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(RoomPreparation room) {
		this.room = room;
	}

	/**
	 * @return the equip
	 */
	public MedicalEquipmentSystem getEquip() {
		return equip;
	}

	/**
	 * @param equip the equip to set
	 */
	public void setEquip(MedicalEquipmentSystem equip) {
		this.equip = equip;
	}

	/**
	 * @return the notify
	 */
	public NotificationSystem getNotify() {
		return notify;
	}

	/**
	 * @param notify the notify to set
	 */
	public void setNotify(NotificationSystem notify) {
		this.notify = notify;
	}

	public boolean handleEmergency(EmergencyCase emergencyCase, EmergencyTeamFactory factory,
			TransportStrategy strategy, String doctorSpecialization, String doctorName, String doctorEmail,
			String nurseRole, String nurseName, String nurseEmail, String roomType) {
		Patient p = emergencyCase.getPatient();
		register.Registration(p);
		Doctor doc = factory.createDoctor(doctorSpecialization, doctorName, doctorEmail);
		Nurse nurse = factory.createNurse(nurseRole, nurseName, nurseEmail);
		TreatmentRoom room = factory.createTreatmentRoom(roomType);
		if (!room.isAvailable())
			return false;
		room.prepareRoom();
		equip.prepareEquipment();
		p.setTransportStrategy(strategy);
		doc.treatPatient();
		nurse.assistDoctor();
		p.setAdmitted(true);
		return true;
	}

}
