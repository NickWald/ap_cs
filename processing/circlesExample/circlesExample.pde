//runnable program, kind of like a main method
//use the class in this file
circle c1 = new circle(40, 120, 100); //MAKING CIRCLE EXIST
circle c2 = new circle(200, 300, 150);
circle c3 = new circle(25, 14, 98);

void setup(){
  size (500, 500);
  frameRate(120);
}

void draw(){
  background(0);
  c1.show(); //DRAWING THE CIRCLE
  c2.show();
  c3.show(); //lower down a thing is the later it is done
}

void keyPressed(){
  //move only X w/ left and right arrows
   if (keyCode == 37){
     c1.moveX(-5);
   }
   if (keyCode == 39){
     c1.moveX(5);
   }
//move only Y w/ up and down arrows
   if (keyCode == 38){
     c1.moveY(-5);
   }
   if (keyCode == 40){
     c1.moveY(5);
   }
}
