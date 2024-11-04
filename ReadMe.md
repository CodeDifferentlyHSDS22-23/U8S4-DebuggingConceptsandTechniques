# U7S4 Debugging Concepts

* Part A - Foundations 8.4

## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `ComputeTime`.

#### Step 02

* Examine `ComputeTime` :
    * Run the program with your IDE's debugger to debug
      this program:
      * Set the breakpoint in the getDistance method
      * Press “Step In” (blue downward pointing arrow in the ‘Terminal’ window) to go to the next line.
      * Observe the values of the x1, x2, y1, y2, speed, distance, and
        time variables
    * Can you identify the bug? 

### Exercise 02

#### Step 01

In the package `partA.ex02` look at the file `BoundaryTesting`.

#### Step 02

* Modify the programs to implement exception handling:
    * Validate the input by executing the program with the
      following boundary test values for year and month:

| Year | Month |
|------|-------|
| 1582 | 2     |
| 1583 | 0     |
| 1583 | 13    |
| 1583 | 1     |
| 1583 | 12    |

Your program is working correctly, if when run, the following is the output:

```
Bad request: 1582 2
Bad request: 1583 0
Bad request: 1583 13
Valid request
Valid request
```
