float rate;
int comm;
int infectionCount;
int num;

boolean deathEnabled;
boolean immunityEnabled;

float vel;
boolean playing;
int time;
int immuneCount;
int deadCount;
float iRadius;

void setup() {
  //fullScreen();
  size(700, 700);
  time = 0;
  num = 100;
  
  deathEnabled = false;
  immunityEnabled = false;
  playing = false;
  rate = 1.15;
  iRadius = 6;
  vel = random
  ArrayList<mortal> community = new ArrayList<mortal>();
  
  for(int i = 0; i < num; i++){
    community.add(new mortal());
    community.get(i).vx = random();
  }
  
}

void draw() {
  // draw stuff
}
