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
public class Pop_notice  extends Pop_out_msg{
    public Pop_notice(String g){
        super(g);
    }
    public void NoticeTel(String g){
        JOptionPane.showMessageDialog(null, "If any problem, can contact 0188882222", 
                "Healthy Clinic Tracking Daily Appointment", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
/*
        public void ByeBye(String g){
        JOptionPane.showMessageDialog(null, "See you next time", "Healthy Clinic Tracking Daily Appointment", JOptionPane.INFORMATION_MESSAGE);
    }
*/