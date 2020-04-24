//lets make some pvectors!
PVector x, mouse;

void setup(){
  size(1000,800);
  x = new PVector(50,0);
  mouse = new PVector(50,50);
}

void draw(){
   background(148, 147, 147);
   strokeWeight(3); //line thickness
   //we could redefine 0, 0
   
   fill(20);
   translate(width/2, height/2); //sets (0,0) to (width/2, height/2)
   line(0, 0, x.x, x.y);
   line(0, 0, mouse.x, mouse.y);
   
   mouse.x = mouseX - width/2;
   mouse.y = mouseY - height/2;
   
   text("mouse vector length: " + mouse.mag(), 100, 100); //putting text on screen
   text("mouse vector angle: " + PVector.angleBetween(mouse, x), 100, 50); //.heading() gives angle
}
