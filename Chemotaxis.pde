 Bacteria [] colony;
 void setup()   
 {     
 	size(400,400);
 	colony = new Bacteria[100];
}   
 void draw()   
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
 	void move()
 	{
 	   myX = myX+(int)(Math.random()*20)-10;
 	   myY = myY+(int)(Math.random()*20)-10;
         
 	} 
 	void show()
 	{
       
       ellipse(myX,myY,10,10);
 	}  
 }    