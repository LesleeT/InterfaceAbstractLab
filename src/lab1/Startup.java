/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
//import javax.swing.JOptionPane;

/**
 *
 * @author ltrinastic
 */
public class Startup {
    public static void main(String[] args) {
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java","222");
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java","444");
        IntroToProgrammingCourse introProg = new IntroToProgrammingCourse("Intro to Programming", "111");

        
        College college = new College();
        
    }
    
}
