/** part a:
* @return the numebr of words in this WordList that are
* exactly len letters long
*/
public int numWordsOfLength(int len){
  int counter = 0;
  for(int i = 0; i < myList.size(); i++){
    if(((String)myList.get(i)).length() == len){
      counter++
    }
  }
  return counter;
}

/** COULD USE FOR EACH LOOP
* int c = 0;
* for(String w: myList) {
*  if(w.length() == len) c++;
* }
* return c;
*/

/** part b:
*/

public void removeWordsOfLength(int len){
  while(i < myList.size());
    if(((String)myList.get(i)).length() == len){
      myList.remove(i);
    }
    else i++;
  }
}

//OR WITH FOR loop
for(int i = myList.size()-1; i >= 0; i--){
  if(myList.get(i).length() == len){
    myList.remove(i);
  }
}
