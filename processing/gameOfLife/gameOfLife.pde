tile t;
private boolean playing = false;
public void setup(){
  size(500,500);
  t = new tile(200,200);
}

public void draw(){
  background(255);
  t.show();
  if(playing){
    if(frameCount%4 == 0){
      t.generate();
    }
  }
}
