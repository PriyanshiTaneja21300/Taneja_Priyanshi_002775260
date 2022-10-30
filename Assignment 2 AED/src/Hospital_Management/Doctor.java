/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital_Management;

/**
 *
 * @author SHREYA TANEJA
 */
public class Doctor extends Person {
    
    public static int DOCTOR_ID = 5000;
    
    public Person personDetails;
     public Appointment_History allAppointmentsHistory;
     public Doctor_Details doctorDetails;
     public int doctorIdentifier;
     
     public Doctor() {
         allAppointmentsHistory = new Appointment_History();
     
     
     }                  
              
}