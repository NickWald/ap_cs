int playViewSize;
boolean playing = false;
apple a;
snake s;

void setup(){
  size(500, 500);
  playViewSize = 25;
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
  }

  else{
    fill(255);
    textSize(20);
    //start screen
    text("play!", width/2-20, height/2-25);
  }
}

//movement 
void keyPressed(){
  if(keyCode == UP){
    
  }
  if(keyCode == DOWN){
    
  }
  if(keyCode == LEFT){
    
  }
  if(keyCode == RIGHT){
    
  }
}

void mouseClicked(){
  playing = !playing;
}
