 Bacteria [] colony;
 int x = (int)(Math.random()*401);
 int y = (int)(Math.random()*401);

 void setup()   
 {     
 	size(400,400);
 	colony = new Bacteria[100];
 	for(int p = 0; p<colony.length;p++)
 	{
 		colony[p] = new Bacteria(x,y);
 	}
}   
 void draw()   
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
 	void move()
 	{
 	   myX = myX+(int)(Math.random()*21)-10;
 	   myY = myY+(int)(Math.random()*21)-10;
         
 	} 
 	void show()
 	{
       fill(myColor);
       ellipse(myX,myY,5,5);
 	}  
 }    