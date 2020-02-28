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

public class lottaCircles extends PApplet {

int circleNum = 1;

public void setup(){
  
}

public void draw(){
  //most stuff goes in here
  //make a double loop
  //ellipse(x, y, w, h);
  background(0);
  fill(255);
  circleNum = 1;
  for(int x = 25; x<width; x+=100){
    for(int y = 25; y<height; y+=100){
    fill((int)((x+y)/(double)(width+height) * 155+100), 0, 100);
    ellipse(50+x, 50+y, 100, 100);


    fill(0);
    text(circleNum + "", 50+x, 50+y);
    circleNum++;
    }
  }
}
  public void settings() {  size (1000, 700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "lottaCircles" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
