package Creational;

public class Doctor {

    private String specialization;
    private String name;
    private String email;

    public Doctor(String specialization, String name, String email) {
        this.specialization = specialization;
        this.name = name;
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void treatPatient() {
        System.out.println(specialization + " doctor " + name +
                " is treating the patient.");
    }
}