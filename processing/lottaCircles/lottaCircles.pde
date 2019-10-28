int circleNum = 1;

void setup(){
  size (1000, 1000);
}

void draw(){
  //most stuff goes in here
  //make a double loop
  //ellipse(x, y, w, h);
  background(0);
  fill(255);
  circleNum = 1;
  for(int x = 25; x<width; x+=100){
    for(int y = 25; y<height; y+=100){
    fill((int)(x/(double)width * 255));
    ellipse(50+x, 50+y, 100, 100);
    
    
    fill(0);
    text(circleNum + "", 50+x, 50+y);
    circleNum++;
    }
  }
}
