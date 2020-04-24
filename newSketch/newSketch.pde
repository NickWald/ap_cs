String file = "samplePoetry.txt";
ArrayList<Word> poem;
void setup(){
  size(500,500);
  poem = readFileStringsToSingleWords(file);
}
void draw(){
  for (int i = 0; i < poem.size(); i++){
    poem.get(i).show();
  }
}

public String[] readFile(String filename){
   String[] lines = loadStrings(filename); //turns poem into just lines
   ArrayList <Word> temp = new ArrayList<Word> ();
   // [0] -> line 1
   // [1] -> line 2
   for(int i = 0; i < lines.length; i++){
     temp.add(new Word(lines[i], 20, 100));
   }
   return lines;
}
