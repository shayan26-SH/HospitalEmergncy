package Creational;

import Behaviral.TransportStrategy;

public class Patient {
private String name;
private int age, severityLevel;
private boolean Registrated, infection,admitted;
private TransportStrategy transportStrategy;


/**
 * @return the transportStrategy
 */
public TransportStrategy getTransportStrategy() {
	return transportStrategy;
}

/**
 * @param transportStrategy the transportStrategy to set
 */
public void setTransportStrategy(TransportStrategy transportStrategy) {
	this.transportStrategy = transportStrategy;
}

public Patient(String name, int age, int severityLevel, boolean infection) {
	this.name = name;
	this.age = age;
	this.severityLevel = severityLevel;
	this.infection = infection;
	this.Registrated = false;
	this.admitted = false;
}

/**
 * @return the severityLevel
 */
public int getSeverityLevel() {
	return severityLevel;
}

/**
 * @param severityLevel the severityLevel to set
 */
public void setSeverityLevel(int severityLevel) {
	this.severityLevel = severityLevel;
}

/**
 * @return the infection
 */
public boolean isInfection() {
	return infection;
}
/**
 * @param infection the infection to set
 */
public void setInfection(boolean infection) {
	this.infection = infection;
}
/**
 * @return the admitted
 */
public boolean isAdmitted() {
	return admitted;
}
/**
 * @param admitted the admitted to set
 */
public void setAdmitted(boolean admitted) {
	this.admitted = admitted;
}
/**
 * @return the registrated
 */
public boolean isRegistrated() {
	return Registrated;
}
/**
 * @param registrated the registrated to set
 */
public void setRegistrated(boolean registrated) {
	Registrated = registrated;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}


}
