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
        int h=100;
     

        
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
        g.drawString("O(0,0)", 0, getHeight());
          g.drawString(".R("+x+","+y +")", a+x, getHeight()-a-y);
             g.drawString(".P("+z+","+k +")", a+z, getHeight()-a-k);
               g.drawString(".P'("+xPrime+","+yPrime +")", a+xPrime, getHeight()-a-yPrime);
        g.drawLine(a,getHeight()-a,getWidth(),getHeight()-a);
         g.drawLine(a,a,a,getHeight()-a);
         g.drawLine(0,getHeight()-500 ,1000 ,-500);
         g.drawLine(0,getHeight()-600 ,1000 ,-600);
         g.drawLine(0,getHeight()-700 ,1000 ,-700);
         g.drawLine(0,getHeight()-800 ,1000 ,-800);
         g.drawLine(0,getHeight()-900 ,1000 ,-900);
         g.drawLine(0,getHeight()-1000 ,1000 ,-1000);
                g.drawLine(0,getHeight()-400 ,1000 ,-400);
         g.drawLine(0,getHeight()-300 ,1000 ,-300);
         g.drawLine(0,getHeight()-200 ,1000 ,-200);
         g.drawLine(0,getHeight()-100 ,1000 ,-100);
         g.drawLine(0,getHeight()-0 ,1000 ,0);
         g.drawLine(0,getHeight()-1000 ,1000 ,-1000);
                g.drawLine(0,getHeight()-500 ,1000 ,-500);
         g.drawLine(0,getHeight()+100 ,1000 ,+100);
         g.drawLine(0,getHeight()+200 ,1000 ,200);
         g.drawLine(0,getHeight()+300 ,1000 ,300);
         g.drawLine(0,getHeight()+400 ,1000 ,400);
         g.drawLine(0,getHeight()+500 ,1000 ,500);
            g.drawLine(0,getHeight()+600 ,1000 ,600);
         g.drawLine(0,getHeight()+700 ,1000 ,700);
         g.drawLine(0,getHeight()+800 ,1000 ,800);
         g.drawLine(0,getHeight()+900 ,1000 ,900);
         g.drawLine(0,getHeight()+1000 ,1000 ,1000);
           g.drawLine(0,getHeight()+1000 ,1000 ,1000);
             g.drawLine(0,getHeight()+1100 ,1000 ,1100);
               g.drawLine(0,getHeight()+1000 ,1000 ,1200);
         
          
        
        
     
      
   
 
     
    }
    
}
