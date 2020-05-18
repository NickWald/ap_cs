//part a: write the constructor for the wordPairList class
private ArrayList<WordPair> allPairs;

public WordPairList (String[] words) {
  allPairs = new ArrayList<WordPair>();
  for (int i = 0; i < words.length; i++) {
    for (int j = 0; j < word.length; j++) {
      allPairs.add(new WordPair(words[i], words[j]));
    }
  }
}

//part b:
public int numMatches(){
  count = 0;
  for (int i = 0; i < allPairs.length; i++) {
    for (int j = 0; j < allPairs.length; j++) {
      if(allPairs[i].equals(allPairs[j])) count++;
    }
  }
  return count;
}

//OR USE FOREACH LOOP
