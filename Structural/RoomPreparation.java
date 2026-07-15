package Structural;

import Creational.*;

public class RoomPreparation {
	public boolean prepareroom(TreatmentRoom room) {
		if (!room.isAvailable())
			return false;
		room.prepareRoom();
		return true;
	}
}
