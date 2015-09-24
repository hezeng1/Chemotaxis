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
 int mouTh = 0;
 int mouThx = 0; 


 public void setup()   
 {     
 	size(400,400);
 	colony = new Bacteria[500];
 	for(int p = 0; p<colony.length;p++)
 	{
 		colony[p] = new Bacteria(200,200);
 	}
 }   
 public void draw()   
 { 
   background(255);
    x= x +  (int)(Math.random()*7)-3;
    y= y +  (int)(Math.random()*7)-3;
    fill(255, 0, 0);
    arc(x+50,y+50,50,50,PI/4,PI*7/4);
   for(int i = 0; i<colony.length;i++)
    {
    	colony[i].move();
    	colony[i].show();
     }	
     if(mouTh == -PI/4 && mouThx ==PI/4)
     {
     	mouTh = 0;
     	mouThx = 0; 
     }
}  
 class Bacteria    
 {     
 	int myX,myY,myColor,strokeColor;
    boolean alive;
    Bacteria(int x , int y)
 	{
 		myX = x;
 		myY = y;
 		myColor = color(13,178,35);
 		strokeColor= (int)(Math.random()*256);
 		alive = true; 
 		
 	}
 	public void move()
 	{
 	   myX = myX+(int)(Math.random()*3)-1;
 	   myY = myY+(int)(Math.random()*3)-1;
         
 	} 
 	public void show()
 	{
       if(get(myX,myY)==color(255,0,0))
       {
       	 alive = false; 

       }
       if(alive == true){
       stroke(strokeColor,strokeColor,strokeColor);
       fill(myColor);
       ellipse(myX,myY,5,5);
    }
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
