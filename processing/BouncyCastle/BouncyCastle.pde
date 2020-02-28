//global variables
Ball[] ballCollection;

int n = 2;

void setup(){
  size(500,500);
  
  ballCollection = new Ball[n];
  for (int i = 0; i < ballCollection.length;  i++){
    ballCollection[i] = new Ball(random(10, 80)); //fills every spot with a radius of a number between 10 and 49
  } //array filled

}

void draw(){
  background(255);
  for (int i = 0; i < ballCollection.length;  i++){
    ballCollection[i].show();
    //ballCollection[i].move();
  }
  for (Ball b : ballCollection){
    b.show();
    b.move();
    b.grow();
  }
}
