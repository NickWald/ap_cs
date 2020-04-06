you have a couple lists with a couple different objects

you want to take those lists and put it into a new list, with the smallest entries first

so first you have to sort both
then choose what you want to extrapolate from the array

FRQ 2006:

Consider the following incomplete class that stores information about a customer, which includes a name and unique ID (a positive integer). To facilitate sorting, customers are ordered alphabetically by name. If two or more customers have the same name, they are further ordered by ID number. A particular customer is "greater than" another customer if that particular customer appears later in the ordering than the other customer.


```java
public class Customer
    {
      // constructs a Customer with given name and ID number
public Customer(String name, int idNum)
      {  /* implementation not shown */  }
// returns the customer's name
      public String getName()
      {  /* implementation not shown */  }
// returns the customer's id
      public int getID() {  
      /* implementation not shown */  
    }
      // returns 0 when this customer is equal to other;
      //   a positive integer when this customer is greater than other;
      //   a negative integer when this customer is less than other
      public int compareCustomer(Customer other){  /* to be implemented in part (a) */  
      }
      // There may be fields, constructors, and methods that are not shown. }
```

(a) Write the `Customer` method `compareCustomer`, which compares this `customer` to a given `customer`, other. Customers are ordered alphabetically by name, using the compareTo method of the String class. If the names of the two customers are the same, then the customers are ordered by ID number. Method compareCustomer should return a positive integer if this customer is greater than other, a negative integer if this customer is less than other, and0iftheyarethesame.


2 conditions to worry about

in the case of c1.compareCustomer(c2)
What cases for before?
//this stuff refers to c1's fields and methods
this.getName();
this.getID();
DONT HAVE TO USE THIS, JUST FOR CLARITY

//this stuff refers to c2's fields and methods
other.getName();
other.getID();

Either:
```java
if(this.getName().compareTo(other.getName()) < 0) return negative;
```

this.getName() is alphabetically before other.getName() -- just return a negative number
or it's after (alphabetically) --  just return a positive number
or theyre the same. (compareTo returns 0)-- then i have to check ID's:


```java
if(this.getID()) < other.getID()) return negative;
else if(this.getID() > other.getID()) return positive;
else return 0;
```



**PART B:**
(b) A company maintains customer lists where each list is a sorted array of customers stored in ascending order by customer. A customer may appear in more than one list, but will not appear more than once in the same list.
Write method prefixMerge, which takes three array parameters. The first two arrays, list1 and list2, representexistingcustomerlists.Itispossiblethatsomecustomersareinbotharrays.Thethird array,result, hasbeeninstantiatedtoalengththatisnolongerthaneitheroftheothertwoarraysand initially contains null values. Method prefixMerge uses an algorithm similar to the merge step of a Mergesort to fill the array result. Customers are copied into result from the beginning of list1 andlist2, mergingtheminascendingorderuntilallpositionsofresulthavebeenfilled.Customers who appear in both list1 and list2 will appear at most once in result.
For example, assume that three arrays have been initialized as shown below.

NOT ALLOWED TO MAKE NEW ARRAYS OR ARRAYLIST
