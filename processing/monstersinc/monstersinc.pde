monster m;
vampire v;
monster unknown;
void setup(){
  size(800, 800);
  m = new monster(0, 0);
  v = new vampire(1000, 100000, false);
  unknown = new vampire(10, 0, true);
}
//these happen sequentially (60fps)
void draw(){
  m.show();
  m.move();
  m.emitSound();
  v.show();
  v.emitSound(); //same name as default, so look at method inside vampire first
}
