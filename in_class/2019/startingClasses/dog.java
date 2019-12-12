/**
* Author: Nick
* File: dog.java
* Purpose: To define the Dog class.
*/

//NO MAIN METHOD IN A CLASS

public class dog{
  //fields (unset vars)
  private String name;
  private String breed;
  private double mass;
  private int goodness; //1-10
  private String color;
  private double legCount;
  private boolean isHappy;
  private boolean isHungry;

  //zero argument constructor:
  public Dog(){
    //set defualt values for variables declared above:
    isHappy = true;
    isHungry = true;
    goodness = 10;
    mass = 1;
    name = "";
    breed = "Shiba Inu";
    legCount = 4.0;
    color = "clear";
  }

  //want to be able to set: name, mass, isHungry, and breed. So use a new constructor w/ args
  //useful constructor:
  public Dog(String n, double m){ //gets name, and stores in string n
    //any arg is temporary, n is the user's input
    //n is temporary, name is forever
    name = n;
    mass = m;

  }
  //Dog boomer = new Dog("boomer", 3.6) //whatever is in the parentheses is values being used
  //Dog taco = new Dog()// this uses the first constructor because nothing is set to args; a new dog with no args uses constructor that takes no args

  //methods
  public void bark(){
    System.out.println("Woof!");
  }
  public int bite(){ //if bite is used, do this
    if(goodness > 5) return 0;
    else return (int)(10*mass); //number value is the damage done. in this case, a big dog will do more damage. if its goodness is over 5, then it doesnt bite
  }
  public void run(int speed){
  }
  public void feed(){
  }
}
