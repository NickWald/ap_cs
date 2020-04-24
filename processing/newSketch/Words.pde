/**
*@author Marin Yamaguchi
*@editor Mr. M-S
*Purpose: Represents a Word, includes rhyming checker and word rotation option.
*/
public class Word{
  private int x; //x position
  private int y; //y position
  private String w; //the word string
  private float angle;
  private int size;
  private float r, g, b;
  private float vx, vy;
  
  public Word(String s, int xpos, int ypos){
    angle = random(0, 0); //avoids upside-down orientation
    size = 20;
    w=s;
    x=xpos;
    y=ypos;
    vx = random(-30, 30);
    vy = random(-30, 30);
    r = random(0,255);
    g = random(0,255);
    b = random(0,255);
    
  }
  
  //Shows the word rotated at angle specified in constructor.
  void show(){
    textSize(size);
    pushMatrix();
    fill(r, g, b);
      translate(x,y);
      rotate(angle);
      text(w, 0, 0);
    popMatrix();
  }
  
  public void move(){
    x += vx;
    y += vy;
    if(x == width || x < 0 || y == height || y < 0){
      vx = random(-10, 10);
      vy = random(-10, 10);
    }
  }

  
  //a method for figuring out whether two words rhyme
  boolean compareTo(Word x){
    for(int i=0; i<x.w.length(); i++){
      //determining if there are matching strings and whether that matched string
      //occurs at the end (since the words have to rhyme)
      
      //I'm sure there is a much more efficient way to do this
      if(x.w.indexOf(this.w.substring(i))>0 && 
      x.w.indexOf(this.w.substring(i))+this.w.substring(i).length()==x.w.length()){
        return true;
      }
    }
    return false;
  }
}
