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
 int x = (int)(Math.random()*401);
 int y = (int)(Math.random()*401);

 public void setup()   
 {     
 	size(400,400);
 	colony = new Bacteria[100];
 	for(int p = 0; p<colony.length;p++)
 	{
 		colony[p] = new Bacteria(x,y);
 	}
}   
 public void draw()   
 { 
   background(255);
   for(int i = 0; i<colony.length;i++)
    {
    	colony[i].move();
    	colony[i].show();
     }	
 }  
 class Bacteria    
 {     
 	int myX,myY,myColor;
    Bacteria(int x , int y)
 	{
 		myX = x;
 		myY = y;
 		myColor = color(13,178,35);
 	}
 	public void move()
 	{
 	   myX = myX+(int)(Math.random()*21)-10;
 	   myY = myY+(int)(Math.random()*21)-10;
         
 	} 
 	public void show()
 	{
       fill(myColor);
       ellipse(myX,myY,5,5);
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
