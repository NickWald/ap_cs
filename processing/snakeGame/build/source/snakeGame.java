import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class snakeGame extends PApplet {

int playViewSize;
boolean playing = false;
apple a;
snake s;

public void setup(){
  
  playViewSize = 25;
  //make new apple and snake size of grid
  a = new apple(playViewSize);
  s = new snake(playViewSize);
}

public void draw(){
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
public void keyPressed(){
  if(keyCode == UP){

  }
  if(keyCode == DOWN){

  }
  if(keyCode == LEFT){

  }
  if(keyCode == RIGHT){

  }
}

public void mouseClicked(){
  playing = !playing;
}
class apple{
  float x, y, w, h;
  
  apple(int grid){
    w = width/grid;
    h = height/grid;
    x = (int)random(0, grid-1)*w;
    y = (int)random(0, grid-1)*h;
  }
  
  public void show(){
    fill(255, 0, 0);
    rect(x, y, w, h);
  }
  
  public void restart(){
    x = (int)random(0, playViewSize-1)*w;
    y = (int)random(0, playViewSize-1)*h;
  }
}
class snake{
  float x, y, w, h;
  float vx, vy;
  
  snake(int grid){
    w = width/grid;
    h = height/grid;
    x = (int)(grid/2)*w;
    y = (int)(grid/2)*h;
    vx = 0;
    vy = 0;
  }
  
  public void show(){
    fill(255, 0, 255);
    rect(x, y, w, h);
  }
  
  public void move(){
    x += vx;
    y =+ vy;
  }
}
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "snakeGame" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
