package Creational;

public interface EmergencyTeamFactory {

    Doctor createDoctor(String specialization, String name, String email);

    Nurse createNurse(String role, String name, String email);

    TreatmentRoom createTreatmentRoom(String roomType);
}