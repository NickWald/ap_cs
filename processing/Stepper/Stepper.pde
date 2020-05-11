ArrayList<Mover> population;
void setup(){
  size(1000, 800);
  population = new ArrayList<Mover>();
  //fills my population array with Movers of step count 200.
  for (int i = 0; i < 100; i++){
    population.add(new Mover(200));
  }
}
void draw(){
  background(255);
    fill(255);
  ellipse(100, 100, 50, 50);
  fill(255, 0, 0);
  ellipse(100, 100, 20, 20);

    for (Mover m : population){
      m.show();
      m.move();
    }
    
    //shows the closest object to target in red, prints min distance.
    if (frameCount>population.get(0).velocities.size()){
      Mover k = population.get(0);
      float min = dist(100, 100, k.location.x, k.location.y);
      
      for (int i = 1; i < population.size(); i++){
       float temp = dist(100, 100, population.get(i).location.x, population.get(i).location.y);
       if (temp<min){
         min = temp;
         k = population.get(i);
       }
      }
      k.c.x = 255;
      text("Min distance: " + min, width/2, height/2);
    }
}
