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

  void show(){
    fill(255, 0, 255);
    rect(x, y, w, h);
  }

  void move(){
    x += vx;
    y =+ vy;
  }
}
