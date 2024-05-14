/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinic_Appointment_Management_System;


import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Pop_out_msg {
    String GreettoUser;
    
    Pop_out_msg(String g){
        GreettoUser=g;
    }
    public void greet(String g){
        // Display the data in a dialog box
        JOptionPane.showMessageDialog(null, "Welcome to Healthy Clinic Appointment Management System", 
                "Healthy Clinic Appointment Management System", JOptionPane.INFORMATION_MESSAGE);
    }   
}

