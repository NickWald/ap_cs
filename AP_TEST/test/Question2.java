X56UX6U4
NW

//part a:
public static int totalPointsEarned(int numFlights){
  int points = 0;
  for(int i = 0; i < numFlights.milesTraveled(); i++){
    while(i <= 1000){
      i += points;
    }
    while(i >= 1000 && i <= 10000){
      i*2 += points;
    }
    while(i >= 10000){
      i*5 += points;
    }
  }
  return points
}

//part b:
I would need to add in the airTravel constructor a public static integer called maxPoints which holds the maximum value set by the airline of points a customer can earn.

I would implement the maxPoints integer into the totalPointsEarned method so that once that limit is reached, that variable is returned. 
