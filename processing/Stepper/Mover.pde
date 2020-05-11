public class Mover{
 //location
 //velocity
 private PVector location;
 private ArrayList<PVector> velocities;
 private int currentStep;
 private PVector c; //using a 3D PVector for color. x = red, y = green, z = blue.
 //your comment here.
 public Mover(int stepCount){
   c = new PVector(0,0,0);
   location = new PVector(width, height);
   velocities = new ArrayList<PVector>();
   for (int i = 0; i < stepCount; i++){
     velocities.add(PVector.random2D().mult(10));
   }
   currentStep = 0;
 }
 //shows the mover with the specified color, default black.
 public void show(){
   fill(c.x, c.y, c.z);
   ellipse(location.x, location.y, 20, 20);
 }
 
 //your comment here.
 public void move(){
   if (currentStep<velocities.size()){
     location.add(velocities.get(currentStep));
     currentStep++;
     location.x = constrain(location.x, 0, width);
     location.y = constrain(location.y, 0, height);
   }
 }
 
 
  
  
}
