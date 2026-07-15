package Structural;

import Creational.*;

public class NotificationSystem {

    public void notifyStaff(Patient patient) {

        System.out.println(
                "Emergency staff notified for patient: "
                        + patient.getName());

    }

}