int x = 50;
int vx = 0;
int a = 1;

void seup(){
  size(500,500);
  
}

void draw() {
  background(255);
  ellipse(100, x, 50, 50);
  x += vx;
  vx += a;
  if (x > height){
    vx = -vx;
  }
}
