//part a
/** any variable made should be private, static, datatype,
* name = default value
* Need getter. Setter? or else modify my metod to change the value
* of the static variable
*/
public static int totalLetters(List <String> wordList){
  int total = 0
  for(String word: wordList) {
    total += word.length();
  }
  return total;
}

//part b
/** MATH! Take formatted length, subtract totalLetters(wordList)
* int totalSpaces = formattedLen - totalLetters(wordlist);
* Use integer division (!!):
* return totalSpaces/(wordList.size() - 1)
*/
public static int basicGaoWidth(List<String> wordList, int formattedLen){
  return(formattedLen - totalLetters(wordList))/(wordList.size() - 1);
}


Make a variabke
Set that variable somehow (either starting value using = is static), using a new constructor with a new arguamen or making a setter
Make sure to write a getter
Maybe reference how/where that variable will change or how it applies to the problem
