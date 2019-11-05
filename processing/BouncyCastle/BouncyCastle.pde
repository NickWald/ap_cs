//global variables
Ball b1;
Ball b2;
void setup(){
  size(500,500);
  b1 = new Ball(30);
  b2 = new Ball(20);
}

void draw(){
  background(255);
  b1.show();
  b1.move();
  
  b2.show();
}
