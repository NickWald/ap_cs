class apple{
  float x, y, w, h;
  
  apple(int grid){
    w = width/grid;
    h = height/grid;
    x = (int)random(0, grid-1)*w;
    y = (int)random(0, grid-1)*h;
  }
  
  void show(){
    fill(255, 0, 0);
    rect(x, y, w, h);
  }
  
  void restart(){
    x = (int)random(0, playViewSize-1)*w;
    y = (int)random(0, playViewSize-1)*h;
  }
}
