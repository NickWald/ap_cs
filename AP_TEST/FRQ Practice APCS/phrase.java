//part a:
/* 1. does the nth occurence exist?
* 2. if it does, do string stuff
* 3. if  not, do nothing
*/
public void replaceNthOccurence(String str, int n, String repl){
  int index = findNthOccurence(str, n);
  if(index != -1){
    currentPhrase = currentPhrase.substring(0, index) + repl + currentPhrase.substring(index + str.length());
  }
}


//part b:
/**  1. check current phrase, does first occurence exist?
* 2. while loop (do i not get -1?)
* 3. return index
*/
//use a while loop becuase im not sure ill find something
public int findLastOccurance(String str){
  int a = 1;
  int index = 0;
  int next = findNthOccurence(str, a);
  while(next != -1){
    index = next;
    a++;
    next = findNthOccurence(str, n);
  }
  return index;
}
