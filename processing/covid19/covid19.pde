float rate;
int comm;
int infectionCount;
int num;

boolean deathEnabled;
boolean immunityEnabled;
boolean infected;

float vel;
boolean playing;
int time;
int immuneCount;
int deadCount;
float iRadius;
color c, colorInfected;

//ArrayList<mortal> community = new ArrayList<mortal>();
mortal[] community = new mortal[15];
//community0 = new mortal(200, 100, 50, true);
mortal m1 = new mortal(200, 100, 50, true);


void setup() {
  //fullScreen();
  size(1000, 900);
  smooth();
  infected = false;
  deathEnabled = false;
  immunityEnabled = false;
  playing = false;
  rate = 1.15;
  iRadius = 6;
  vel = random(0, 20);
  
  community[0] = new mortal(random(0,width), random(0,height), 30, true); 
  for(int i = 1; i < community.length; i++){
    community[i] = new mortal(random(0,width), random(0,height), 30, false);
  }
  
  if(infected == true) fill(colorInfected);
  //for(int i = 0; i < community.size(); i++){
  //  community.add(new mortal());
  //  community.get(i).vx = random(0,5);
  //}
  
}

void draw() {
  // draw stuff
  background(0);
  for(int i = 1; i < community.length; i++) {
    for(int j = 1; j < community.length; j++){
      community[i].update();
      
      if(community[i].infected == true || community[i] != community[j]){
        community[i].checkCollisions();
        community[i].collisionColor(community[j]);
        community[i].drawCircle();
        m1.update();
        m1.checkCollisions();
        m1.drawCircle();
        m1.collisionColor(community[i]);
        community[i].drawCircle();
      }
    }
    
 
  }
  
}
