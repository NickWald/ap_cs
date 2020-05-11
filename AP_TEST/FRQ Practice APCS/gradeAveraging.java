//part a:

/*
* 1. loop thru scores
* 2. find int first and int last, check if equal to pos i in loop
* 3.
*/

public double average(int first, int last){
  double final = 0;
  for(int i = first; i < last; i++){
    final += scores[i];
  }
  return final/(last-first+1);
}

//part b:
private boolean hasImproved(){
  for(int i = 1; i < scores.length; i++){
    if(scores[i] > scores[i-1]){
      return true;
    }
    else return false;
  }
}

//part c
public double finalAverage(){
  if(hasImproved() == true){
    return average(scores.length/2, scores.length-1);
  }
  else return average(0, scores.length);
}
