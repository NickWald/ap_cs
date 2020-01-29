##  Searching through an array
**(Binary search for sorted data)**
#### *1/28/20*


**<span style="color: yellow;">STANDARD SEQUENTIAL SEARCH:</span>**
```java
/**
** Sequential Search
** @return loc, -1 if not found
**/
public int findElement(int[] arr, int target){
  for(int i = 0; i < arr.length; i++){
    if(arr[i] == target){
      return i;
    }
  }
  return -1;
}
```

| 0 | 1 | 2 | 3 |
|---|---|---|---|
| 1 | 3 | 5 | 2 |

Target = 5


## Sequential Search
In the worst case, this would take the array length's number of steps. so n = arrayLength and also how many steps it takes

## Space Efficiency
How much space is taken up, for n length how much space will it take up
**big O notation**

O <efficiencyLevel>
so, it takes O(n) steps
  (big O of N)
  Double loop = n<sup>2</sup> steps


## What if the list is in order? (BINARY SEARCH)
Makes it easier to find something
  Computer does not know what is in list, just whether it is in order
A system for searching through a list would look like this:

| 2 | 3 | 8 | 12 | 15 | 22 | 64 | 322 |
|---|---|---|----|----|----|----|-----|

**Target = 15**

Start by cutting the list in half. so it becomes:

| 2 | 3 | 8 | 12 |
|---|---|---|----|

compare if target is bigger or smaller from one on left. If its less, then just cut the other half out. so on the next side.:

| 15 | 22 | 64 | 322 |
|----|----|----|-----|

Cut in half again, check if less than 22, it is so it can only be 15.

***BINARY SEARCH*** (much more efficient, this only took 3 steps)

if we have n steps, and n = 8, the max number of half cuts is the log<sub>2</sub>(n)

***BINARY SEARCH: O(log<sub>2</sub>(n))***

so log<sub>2</sub>(10) = 4

log<sub>2</sub>(17) = 5

number of cuts does not scale based on actual space, but on the log, as we are cutting it in half.

**SPEED OF COMPUTER DOES NOT CHANGE HOW MANY STEPS IT WILL TAKE**


This can be done with anything, objects, words, letters, etc
Only requirement of binary search is that the list is in order
