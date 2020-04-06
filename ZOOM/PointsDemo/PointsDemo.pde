PointCollection p;
LineCollection l;
void setup(){
  size(500,500);
  p = new PointCollection(500);
  l = new LineCollection();
}
void draw(){
  background(0);
  p.show();
  l.show();
  if (frameCount%15 == 0) {
   Line k = p.removeClosestPair();
   if (k!=null) l.addLine(k);
  }
}
