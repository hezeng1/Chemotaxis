 void setup()   
 {     
 	size(400,400);
 	
 }   
 void draw()   
 {    
 	bob.show();  
 }  
 class Bacteria    
 {     
 	int myX,myY,colOres,sIze;
    Bac(int x, int y)
 	{
 		myX = x + (int)(Math.random()*401);
 		myY = y + (int)(Math.random()*401);
 		colOres = color(39,205,61);
    }
 	void move()
 	{
         
 	} 
 	void show()
 	{
       background(255);
       ellipse(myX,myY,20,30);
 	}  
 }    