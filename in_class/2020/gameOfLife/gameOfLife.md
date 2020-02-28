## 1-30-20 (PROJECT)
#### *Creating a version of Conway's game of life; should use 2D Arrays*


**The Game of Life**  
Treat each box like a living cell. Really, it is just a grid section.


Fill all 9 slots randomly

**RULES:**  
Every stage, you look at all cells:
+ If cell is alive, consider all 8 of its neighbors around it (depending on where current cell is located) (kind of like minesweeper)
  + ignore cells depending on location (if its in a corner)
+ if there are **less than 2 living neighbors** around certain cell, then in the next generation, **you die**
| D | D | D |    
|---|---|---|
| D | A | D |
| D | D | D |

***THIS RESULTS IN DEATH NEXT GEN***

+ if there are **more than 3 living neighbors**, next gen, you die
| A | D | D |    
|-|-|-|
| D | D | A |
| D | A | A |

***THIS RESULTS IN DEATH NEXT GEN***

**Otherwise, you stay alive**


***IF DEAD***
+ Exactly 3 alive neighbors will revive you


## OFFICIAL RULES
<ul>
<li>If the cell is "alive," there are three rules:

<ol>
<li>If the cell has fewer than two live neighbors, it dies--as if by under-population.
<li>If the cell has more than three live neighbors, it dies--as if by over-population.
<li>If a cell has exactly two or three live neighbors, it survives to the next generation.
</ol>
</li>
<li>If the cell is "dead," the following rule applies:

<ol>
<li>If a dead cell has exactly three live neighbors, it becomes alive in the next generation, as if by reproduction.</li>
</ol>
</li>
</ul>


MADE IN PROCESSING

[RULES](https://www.cs.utexas.edu/~nclement/aces/javaII/5-two-dimensional-arrays.html)
