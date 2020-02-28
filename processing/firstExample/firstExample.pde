int x = 0;
//methods
void setup(){ //happens 1 time
  size(1000,500);
}

void draw(){ //continuous loop - repaints picture every time it runs
  background(255);
  rect(x,0, 100, 100);
  x+=5;
}

void keyPressed(){
  if (keyCode == 65){
    x-=100;
  }
}
