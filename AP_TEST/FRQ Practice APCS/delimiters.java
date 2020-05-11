/*delimeters separate strings into different pieces
* way of determining where section of string starts and ends; when do i move onto the next section?
* act as parentheses
*/

/* part a:
* 1. make an arraylist to store delimeters
* 2. loop thru tokens
* 3. find delimeters -- openDel and closeDel
* 4. add to list
* 5. end loop
* 6. return list
*/
  public ArrayList<String> getDelimitersList(String[] tokens){
    //1:
    ArrayList<String> returnList = new ArrayList<String>();
    //2:
    for(int i = 0; i < tokens.length; i++){
      //3:
      if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
        //4:
        returnList.add(tokens[i]);
      }
    }
    //6:
    return returnList;
  }

/* part b:
* 1. make counters for openDel and closeDel;
* 2. loop thru delimeters arraylist
* 3. if openDel, increase openCount, smae with closedCount
* 4. if(closed > open), return fasle
* 5. end loop
* 6. return true
*/

public boolean isBalanced(ArrayList<String> delimiters){
  //1:
  int openCount = 0;
  int closedCount = 0;
  //2:
  for(int i = 0; i < delimiters.size(); i++){
    //3
    if(delimeters.get(i).equals(openDel)) openCount++;
    else closedCount++;
    //4
    if(closedCount > openCount) return false;
 //5
  }
  return openCount == closedCount;
}

/* part c:
* 1. write the method header
* 2. Identify any new or modified variables, constructors, or methods
* 3. describe how it would change or
*/
//1:
public static ArrayList<String>(ArrayList<String> delimiters){

}

//2:
/* Would need to add a private static int variable to count # of times the method has been used; how many times you have balanced as a class variable
* an accessor method, public static int getNumTimesBalanced to return the above value
*/

//3
/*
*
*/
