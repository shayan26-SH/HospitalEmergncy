package Creational;

public class Nurse {
private String role,  name;

public Nurse(String role, String name) {
	this.role = role;
	this.name = name;
}

/**
 * @return the role
 */
public String getRole() {
	return role;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}
public String assistDoctor() {
	return role + "Nuse is assisting the doctor";
}
}
