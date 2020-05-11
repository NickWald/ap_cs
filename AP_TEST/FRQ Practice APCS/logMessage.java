//part a:
//breaking down message into pieces
/* TAKE MESSAGE, FIND COLON (:)
*
*
*/
public void logMessage(String message){
  int colIndex = message.indexOf(":"); //find colon
  machineId = message.substring(0, colIndex); //set machineId to everything before :
  description = message.subsstring(colIndex + 1); //set description to everything after (index+1) :
}

//part b: (DONE IN CLASS)
/* see if there is the word in the string. AND check to see if its at the beginning or has a space after NAD check to see if its at the end, or has a space before
* 1. word is at beginning and its at the end
* 2. at beginning, but has a space after it
* 3. at the end but has a space before it
* 4. has a space before and after
*/
public boolean containsWord(String keyword){

}


//part c:
public List<LogMessage> removeMessages(String keyword){
  ArrayList<LogMessage> removed = new ArrayList<LogMessage>();
  for(int i = 0; i < messageList.size(); i++){
    if(messageList.get(i).containsWord(keyword)){
      removed.add(messageList.remove(i));
      i--;
    }
  }
  return removed;
}
