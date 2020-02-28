int playViewSize;
boolean playing = false;
apple a;
snake s;

void setup(){
  size(500, 500);
  playViewSize = 25;
  frameRate(24); //film style :)
  //make new apple and snake size of grid
  a = new apple(playViewSize);
  s = new snake(playViewSize);
}

void draw(){
  background(0);
  //if playing, show apple and snake
  if(playing == true){
    a.show();
    s.show();
    s.move();
  }

  else{
    fill(255);
    textSize(20);
    //start screen
    text("play!", width/2-20, height/2-25);
  }
  if(keyCode == 13){
    playing = !playing;
  }
}

//movement
void keyPressed(){
  if(keyCode == UP){
    s.setVel(0, -1);
  }
  if(keyCode == DOWN){
    s.setVel(0, 1);
  }
  if(keyCode == LEFT){
    s.setVel(-1, 0);
  }
  if(keyCode == RIGHT){
    s.setVel(1, 0);
  }
}

void mouseClicked(){
  playing = !playing;
}
