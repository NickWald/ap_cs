/*SUDOCODE
* if(first before second) return negative
* else if(after) return positive
* else return 0
*/


/* returns 0 when this customer is equal to other;
*  a positive integer when this customer is greater than other;
* a negative integer when this customer is less than other
*/
public int compareCustomer(Customer other){
  int comparison = this.getName().compareTo(other.getName());

  if(comparison != 0){
    retrun comparison;
  }
  else{
    return this.getID() - other.getID();
  }
}
