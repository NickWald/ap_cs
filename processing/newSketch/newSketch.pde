String file = "text.txt";
ArrayList<Word> poem;
void setup(){
  size(500,500);
  poem = readFileStringsToSingleWords(file);
  
  for (int i = poem.size()-1; i >=0; i--){
    if (random(0,1)<0.5) poem.remove(i);
  }
}
void draw(){
   background(255);
  for (int i = 0; i < poem.size(); i++){
    poem.get(i).show();
    poem.get(i).move();
  }
}
/*
poem here
please read
it's good
*/
public ArrayList<Word> readFileStringsToWords(String filename){
   String[] lines = loadStrings(filename); //processing API loadStrings()
   ArrayList<Word> temp = new ArrayList<Word>();
   // [0] -> "poem here"
   // [1] -> "please read"
   // [2] -> "it's good"
   //String.split(" ");
   for (int i = 0; i < lines.length; i++){
     temp.add(new Word(lines[i], 100, 100*i+100));
   }
   
   
   return temp;
}

public ArrayList<Word> readFileStringsToSingleWords(String filename){
   String[] lines = loadStrings(filename); //processing API loadStrings()
   ArrayList<Word> temp = new ArrayList<Word>();
   // [0] -> "poem here"
   // [1] -> "please read"
   // [2] -> "it's good"
   //String.split(" ");
   for (int i = 0; i < lines.length; i++){
     String [] splitUp = lines[i].split(" ");
     for (int j = 0; j < splitUp.length; j++){
       temp.add(new Word(splitUp[j], 100*i+100, 100*j+100));
     }
   }
   
   
   return temp;
}
