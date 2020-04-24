public class mortal{
    protected float vx, vy;
    protected float x, y;
    protected boolean dead;
    protected float xSpeed, ySpeed; 
    protected float circleSize;
    protected float radius;
    protected color c, colorInfected;
    protected boolean infected;
  public mortal(float xpos, float ypos, float cSize, boolean inf){
     x = xpos;
    y = ypos;
    circleSize = cSize;
    radius = cSize*1.5;
    infected = inf;
    inf = false;
    
    if(inf == true){
      fill(colorInfected);
    }
    
    colorInfected = color(255, 0, 0);
    c = color(0, 0, 255);
    
    //set initial speed to random
    xSpeed = random(-.5, .5);
    ySpeed = random(-.5, .5);
  } 
    
   //allows movement
    void update() {
      x += xSpeed; 
      y += ySpeed;  
    }
    
    void checkCollisions() { 
      float r = circleSize/2;
      if ( (x<r) || (x>width-r)){ 
        xSpeed = -xSpeed; 
      }
      if( (y<r) || (y>height-r)) { 
        ySpeed = -ySpeed;  
      }

    }
    
    void collisionColor(mortal other){
      float d = dist(this.x, this.y, other.x, other.y);
      this.infected = true;
      for(int i = 0; i < community.length; i++){
        if(d > circleSize*2 && other.infected == false){
         this.infected = false;
        }
        else if(d < circleSize*2 && other.infected == true){
          //infect();
          this.infected = true;
        }
       }  
      }
      
     // boolean checkInfected(mortal i){
       // if(i.infected == true){ 
         // return true;
       // }
       // else if(i.infected == false){
       //   return false;
      //  }
    //  }
    
    

  void drawCircle() {  
    if(this.infected == true){
      fill(colorInfected);
    }
    else if(this.infected == false){
      fill(c);
    }
    else fill(255,255,255);
    ellipse(x, y, circleSize, circleSize); 
  } 
}
