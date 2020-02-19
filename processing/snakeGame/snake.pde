class snake{
  float x, y, w, h;
  
  snake(int grid){
    w = width/grid;
    h = height/grid;
    x = (int)(grid/2)*w;
    y = (int)(grid/2)*h;
  }
  
  void show(){
    fill(255, 0, 255);
    rect(x, y, w, h);
  }
}
