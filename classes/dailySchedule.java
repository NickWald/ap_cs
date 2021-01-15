public class DailySchedule {
  // contains appointment objects, no two appointments overlap
  private ArrayList apptList;

  public DailySchedule() {
    apptList = new ArrayList();
  }

  /*
   * Removes all apppointments that overlap the given appointment
   *
   * @postcondition: all appointments that have a time conflict with appt have
   * been removed from this DailySchedule
   */
  public void clearConflicts(Appointment appt) {
    for (int i = 0; i < apptList.size(); i++) {
      if (apptList.get(i).getTime().conflictsWith(appt.getTime())) {
        apptList.remove(i);
      }
    }
  }

  /*
   * if emergency is true, clears any overlapping appointments and adds appt to
   * this DailySchedule; oteherwise, if there are no conflicting appointments,
   * adds appt to this DailySchedule;
   *
   * @return true if appointment was added, otherwise @return false
   */
  public boolean addAppt(Appointment appt, boolean emergency) {
    for (int i = 0; i < apptList.size(); i++) {
      if (emergency == true) {
        clearConflicts(appt);
      } else
        apptList.add(i, appt);
    }
  }
}
