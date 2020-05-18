X56UX6U4
NW

//part a:
public int getNumberOfAs(String cat){
  int aCount = 0;
  for(int i = 0; i < assignmentList.size(); i++){
    if(assignmentList.get(i).getGrade() >= 90 && assignmentList.get(i).getCategory().equals(cat)){
      aCount++;
    }
  }
  return aCount;
}

//part b:
public void updateGrade(String cat){
  int 70counter = 0;
  for(int i = 0; i < assignmentList.size(); i++){
    if(assignmentList.get(i).getCategory().equals(cat) && assignmentList.getNumberOfAs() > 5){
      if(assignmentList.get(i).getGrade() < 70 && 70counter < 1){
        assignmentList.get(i).setGrade(70);
        70counter++;
      }
    }
  }
}

//part c:
public ArrayList<Assignment> getAllGroupAssignments(){}

I would need to add a new public boolean method isGroupAssignment() in the Assignment class which returns true if an assignment is deemed to be a group one and false otherwise. I would also need to instantiate a new public Assignment arrayList called groupAssigmentList inside the getAllGroupAssignments() method which stores the assigments from assignmentList in which isGroupAssignment() returns true, and return that list at the end of the method. I would finally need to add a new public void method called setGroupAssignment() in the StudentAssigments class which would update the isGroupAssigment boolean to true.

I would need to add a public boolean variable called groupAssignment to the Assignment constructor and set it to false initially, and change that value to true by using the setGroupAssignment() method if the given assignment is deemed to be a group project (An assignment is deemed to be a group project if when using the isGroupAssigment() method, true is returned). I would fill the groupAssigmentList arrayList with the assignments whose isGroupAssigment() method returns true.
