# addDigits both ways
**Recursive:**
First, write base case
```java
/*
* @param if i have no digits, return 0
*/
public int addDigits(int num){
  if(num==0) return 0;
  return num%10 + addDigits(num/10); //using method on a smaller scale
  //with integer division, when you divide by 10, last number is chopped off, then run again at a smaller scale
}
```
**So, to trace number 7315:**
```
addDigits(7315)
= 5 + addDigits(731)
= 5 + (1 + addDigits(73))
= 5 + (1 + (3 + addDigits(7)))
= 5 + (1 + (3+ (7 + addDigits(0))))
= (5 + (1 + (3 + (7 + 0))))
= 16
```


**Non-Recursive:**
```java
int sum = 0;
int num = 3678;
while (num > 0){
  sum += num%10; //get last digit of a number
  num /= 10;
}
print(sum);
```
