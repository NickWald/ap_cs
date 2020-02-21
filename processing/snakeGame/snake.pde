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
    x += vx*8;
    y += vy*8;

    if(x < 0) x = width - w;
    if(x > width) x = 0;
    if(y < 0) y = height - h;
    if(y > height) y = 0;
  }

  void move5X(){
    x += vx*5;
    y += vy*5;
  }

  void setVel(int a, int b){
    vx = a;
    vy = b;
  }

  void eat(apple grannySmith){
    if (x == grannySmith.x && y == grannySmith.y){
      grannySmith.restart();
    }
  }
}
