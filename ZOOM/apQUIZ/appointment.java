public class Appointment{
  public TimeInterval getTime(){
    /* implementation not shown */
  }
  public boolean conflictsWith(Appointment other){
    /* to be implemnted in part (a) */
    if(this.getTime().overlapsWith(other.getTime())) return true;
    else if(!this.getTime().overlapsWith(other.getTime()));
  }
}
