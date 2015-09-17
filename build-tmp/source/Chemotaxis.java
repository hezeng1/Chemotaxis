import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 Bacteria [] colony;
 public void setup()   
 {     
 	size(400,400);
 	colony = new Bacteria[100];
}   
 public void draw()   
 {    
   
    background(0);
    fill((int)(Math.random()*256));
    for(int i = 0; i<colony.length;i++)
    {
    	colony[i] = new Bacteria(50,50);
    	colony[i].move();
    	colony[i].show();
     }	
 }  
 class Bacteria    
 {     
 	int myX,myY;
    Bacteria(int x , int y )
 	{
 		myX = 0;
 		myY = 0;
 	}
 	public void move()
 	{
 	   myX = myX+(int)(Math.random()*20)-10;
 	   myY = myY+(int)(Math.random()*20)-10;
         
 	} 
 	public void show()
 	{
       
       ellipse(myX,myY,10,10);
 	}  
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
