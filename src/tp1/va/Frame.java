/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.va;

import java.awt.Color;
import javax.swing.JFrame;



/**
 *
 * @author hanane
 */
public class Frame extends JFrame{
  
  
      
    public Frame(){
        setBackground(Color.white);
         setTitle("Landmarck");
         setSize(700,500);           
        setResizable(true);      
         setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );  
         setLocationRelativeTo(null); 
         setVisible(true);


    }

   
    
}
