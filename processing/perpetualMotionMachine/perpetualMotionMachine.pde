int x = 50;
int vx = 0;
int a = 1;

void setup(){
  size(500, 500);
  frameRate(10);
}

void draw() {
  background(255);
  ellipse(x, 100, 50, 50);
  x += vx;
  vx += a;
  if (x > width){
    vx = -vx;
  }
  println(vx);
}
