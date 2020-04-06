Lets say I have an array or list:
| *50* | 3 | 7 | 2 | 5 | 1 |
|----|---|---|---|---|---|

STEPS FOR **SELECTION SORT**:
1. Find smallest thing
2. Swap with current position
3. Repeat

basically, take a number, compare it to the rest of the array until you find something smaller, and then swap.

Becomes:
| 1  | *3* | 7 | 2 | 5 | 50 |
|----|---|---|---|---|---|
Look at 3 vs all

Becomes:
| 1  | 2 | *7* | 3 | 5 | 50 |
|----|---|---|---|---|---|
Look at 7 vs all

Becomes:
| 1  | 2 | 3 | *7* | 5 | 50 |
|----|---|---|---|---|---|


Becomes:
| 1  | 2 | 3 | 5 | 7 | 50 |
|----|---|---|---|---|---|
Look at 7 vs all

done.

SUDOCODE:
***LOOP1***
Loop through array i --> length
set var to array[i]
set min location

***LOOP2***
loop through i + 1 (j)
if j < min
min = j

then ***swap***
