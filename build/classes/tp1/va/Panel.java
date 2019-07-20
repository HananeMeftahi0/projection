/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.va;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author hanane
 */
public class Panel extends JPanel {
    
        int x,z,k, xPrime, yPrime;
        int y ;
        int delta;
        int a=20;

        
       public Panel(int x,int y,int delta,int z,int k){
         systemCoordinates s=new systemCoordinates();
        this.x=x;
         this.y=y ;
         this.z=z;
         this.k=k ;
         this.delta=delta;
       this.setBackground(Color.WHITE);
        }
       public void newCoordinates(){
            xPrime=(int) (((x-z)*Math.cos(delta))-((y-k)*Math.sin(delta))+z);
           yPrime=(int) (((x-z)*Math.sin(delta))-((y-k)*Math.cos(delta))+k);
       }
            
      
    
        @Override
    public void paintComponent(Graphics g)
            
    {
        newCoordinates();
    
       g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
       g.setColor(Color.red);
      //g.drawString("O(0,0)", xString, getHeight()-yString);
       //g.drawString(".P("+aString+","+bString +")", x, z);
        g.drawString("O(0,0)", 0, getHeight());
          g.drawString(".R("+x+","+y +")", a+x, getHeight()-a-y);
             g.drawString(".P("+z+","+k +")", a+z, getHeight()-a-k);
               g.drawString(".P'("+xPrime+","+yPrime +")", a+xPrime, getHeight()-a-yPrime);
        g.drawLine(a,getHeight()-a,getWidth(),getHeight()-a);
         g.drawLine(a,a,a,getHeight()-a);
 
     
    }
    
}
