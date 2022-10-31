/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital_Management;

/**
 *
 * @author PRIYANSHI TANEJA
 */
public class Patient extends Person {

    public static int PATIENT_ID = 1000;

    public Person personDetails;
    public Encounter_History allVisitsHistory;
    public Vital_Signs vitalSigns;
    public int patientIdentifier;
    
    public Patient() {
        allVisitsHistory = new Encounter_History();
    }

}
