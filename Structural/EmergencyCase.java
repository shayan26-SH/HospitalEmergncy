package Structural;

import Creational.Patient;

public class EmergencyCase {

    private String caseId;
    private Patient patient;
    private String emergencyType;
    private boolean roomAvailable;
    private boolean equipmentReady;

    public EmergencyCase(
            String caseId,
            Patient patient,
            String emergencyType,
            boolean roomAvailable) {

        this.caseId = caseId;
        this.patient = patient;
        this.emergencyType = emergencyType;
        this.roomAvailable = roomAvailable;
        this.equipmentReady = false;
    }

    public String getCaseId() {
        return caseId;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public boolean isRoomAvailable() {
        return roomAvailable;
    }

    public boolean isEquipmentReady() {
        return equipmentReady;
    }

    public void setRoomAvailable(boolean roomAvailable) {
        this.roomAvailable = roomAvailable;
    }

    public void setEquipmentReady(boolean equipmentReady) {
        this.equipmentReady = equipmentReady;
    }
}