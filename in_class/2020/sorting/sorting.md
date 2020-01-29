## Sorting
#### *1/29/20*

## **<span style="color: yellow;">Bubble Sorting</span>**
*(kind of inefficient)* /
(ONLY LOOKING AT TWO LOOPS)

ONE CHECK THE ARRAY AS SUCH

+ POS 0 > ALL
+ POS 1 > ALL
+ POS 2 > ALL?

To do this, we need to know how to swap 2 elements. How?

| 3 | 4 | -1 | 7 |
|---|---|----|---|

How do i put 7 in  3?

```java
int s = arr[0];
arr[0]=arr[3];
arr[3] = s;
```

Why cant you just do this?:
```java
arr[0]=arr[3];
arr[3] = arr[0]
```
*because you lose track of what you are replacing*


So a swap needs 3 step

store the first thing
overwrite the first thing
hold that first thing in a variable

**<span style="color: yellow;">Standard Swap:</span>**

```java
int temp = arr[0];
arr[0] = arr[3];
arr[3] = temp;
```
