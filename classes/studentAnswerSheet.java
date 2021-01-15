// Consider a system for processing student test scores. The following class will be used as part of this system and contains a student's name and the student's answers for a multiple-choice test. The answers are represented as strings of length one with an omitted answer being represented by a string containing a single question mark ("?"). These answers are stored in an ArrayList in which the position of the answer corresponds to the question number on the test (question numbers start at 0). A student's score on the test is computed by comparing the student's answers with the corresponding answers in the answer key for the test. One point is awarded for each correct answer and ¼ of a point is deducted for each incorrect answer. Omitted answers (indicated by "?") do not change the student's score

public class StudentAnswerSheet{
  private ArrayList<String> answers;

  /* PART A
  */
  public double getScore(ArrahList<String> key){
    int correct = 0;
    int incorrect = 0;
    int omitted = 0;

    for(int i = 0; i < key.size(); i++){
      for (int j = 0; j < answers.size(); j++) {
        if(key.get(i).equals(answers.get(j))){
          correct++;
        }
        else if(!key.get(i).equals(answers.get(j))){
          incorrect++;
        }
        else omitted++;
      }
    }
    private int score = (((correct*1) - (incorrect * 0.25)) + (omitted*0));
    return score;
  }

  public String getName(){
    /* implementation not shown */
  }
}

/* PART B
*
*/
public class TestResults{
  private ArrayList<StudentAnswerSheet> sheets;

  public String highestScoringStudent(ArrayList<String> key){
    int highestScore = 0;
    for(int i = 0; i < key.size(); i++){
      if(key.get(i).getScore > highestScore){
      highestScore = key.get(i).getScore;
      }
      else highsScore
    }
  }
}
