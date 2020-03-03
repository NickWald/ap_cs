public class vampire extends monster{ //extends makes this a subclass
  private int bloodThirst;
  private int sleepiness;
  private boolean dayWalker; //true = able to live in sun

  public vampire(int b, int s, boolean d){
    super((int)random(0, width-200), (int) random(0, height-200)); //making a call to the superconstructor w position (x, y)
    pic = loadImage("mrDinardo.jpg");
    bloodThirst = b;
    sleepiness = s;
    dayWalker = d;
  }

  public void emitSound(){ //this overrides monster emitSound
    println("Romanian Noise -- SCrEEeeeE");
    //to use the parent emitSound:
    super.emitSound();
    //now, emitSound is based off superconstructor
  }
}
