/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinic_Appointment_Management_System;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class CAMS_function {
    
   public void showAllUser() throws IOException{
    try {

        File f = new File("UserData.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line, data = "";
        while ((line = br.readLine()) != null) {

            data += line + "\n";
        }
        br.close();

        JOptionPane.showMessageDialog(null, data, "Healthy Clinic All User Data", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error reading from file!");
    }
}
public void showAllTime() throws IOException{
    try {
        File f = new File("AppointmentData.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line, data = "";
        while ((line = br.readLine()) != null) {
           
            data += line + "\n";
        }
        br.close();

        // Display the data in a dialog box
        JOptionPane.showMessageDialog(null, data, "Healthy Clinic All TimeSlot", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Sorry, please try again!");
    }
}
public void UsershowAllTime() throws IOException{
    try {
        File f = new File("AppointmentData.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line, data = "";
        while ((line = br.readLine()) != null) {
             line =  line.split(",")[1] + "," + line.split(",")[2]+ "," +line.split(",")[9];
            data += line + "\n";
        }
        br.close();

        // Display the data in a dialog box
        JOptionPane.showMessageDialog(null, data, "Healthy Clinic All TimeSlot", 
                JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Sorry, please try again!");
    }
}
}

