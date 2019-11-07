//global variables
Ball b1;
Ball b2;
Ball b3;
void setup(){
  size(500,500);
  b1 = new Ball(30);
  b2 = new Ball(20);
  b3 = new Ball(10);
}

void draw(){
  background(255);
  b1.show();
  b1.move();
  
  b2.show();
  b2.move();
  
  b3.show();
  b3.move();

}
