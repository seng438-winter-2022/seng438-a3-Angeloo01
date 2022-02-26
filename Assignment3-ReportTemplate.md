**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group \#:      |     |
| -------------- | --- |
| Student Names: |     |
|                |     |
|                |     |
|                |     |

(Note that some labs require individual reports while others require one report
for each group. Please see each lab document for details.)

# 1 Introduction


### Range Class
|Method  |Line Coverage  |Branch Coverage|Method Coverage
|---------|--------------|---------------|---------------|
|Range(double, double)|100%  | 100% |  100%  |
|getCentralValue()|100%   |100%  |100%    |
|getLength()|  100% |100%  |100%    |
|getLowerBound()|  100% |100%  |100%    |
|getUpperBound()| 100%  | 100% |  100%  |
|intersects(Range)| 100%  | 100% | 100%   |
|intersects(double, double)| 92.6%  | 75% | 100%   |

### DataUtilities Class
|Method  |Line Coverage  |Branch Coverage|Method Coverage
|---------|--------------|---------------|---------------|
|calculateColumnTotal(Values2D, int) |100% |75% |100% |
|calculateRowTotal(Values2D, int) |100% |75% |100% |
|createNumberArray(double[]) |100% |100% |100% |
|createNumberArray2D(double[][]) |100% |100% |100% |
|getCumulativePercentages(KeyedValues) |100% |75% |100% |
|equal(double[][], double[][]) |70% |58.3% |100% |


For this coverage metric data we used elcEmma plugin for Eclipse. We tried to use CodeCover but it did not run on our version of Eclipse. We found elcEmma to be the easiest to install and use out of the code coverage tool options.

The pros of elcEmma is its simplicity to install and implement into our project. Additionally, it offers multiple code coverage metrics to measure the quality of our test suite. The cons of elcEmma is that it is missing some coverage metrics such as condition coverage. The test coverages we chose allows us to measure how many lines, branches and method calls have been tested. We chose statement coverage because we cannot find faults if lines containing bugs are not executed. Additionally, we chose branch coverage so that we can execute all outcomes of a branch to ensure consistency. Finally, we chose method coverage because the tool we chose did not include condition coverage and this allows us to find faults during method calls. However, getting complete coverage of these metrics does not guarantee bug free software.

# 2 Manual data-flow coverage calculations for X and Y methods
### calculateColumnTotal() from DataUtilities
![cfg for datautils](https://user-images.githubusercontent.com/48339672/155029520-28777654-2969-4e30-9f2b-4f1a9177ee6f.PNG)

|DU Pairs|Tested|
|-----|----------|
|du(1, 2, data)|Yes|
|du(1, 4, data)|Yes|
|du(1, 8, data)|Yes|
|du(1, 8, column)|Yes|
|du(3, 10, total)|Yes|
|du(3, 12, total)|No|
|du(10, 12, total)|Yes|
|du(4, 6, rowCount)|Yes|
|du(5, 6, r)|Yes|
|du(5, 8, r)|Yes|
|du(11, 6, r)|Yes|
|du(11, 8, r)|Yes|
|du(8, 9, n)|Yes|
|du(8, 10, n)|Yes|

DU pair coverage = total DU pairs/ tested DU pairs * 100% = 13/14 *100% = 92.85%

### intersects(double, double) from Range
![cfg for range](https://user-images.githubusercontent.com/48339672/155030440-b40664e2-14ad-40db-9189-bc50719ec22d.PNG)

|DU Pairs|Tested|
|-|-|
|du(1, 2, b0)|Yes|
|du(1, 4, b0)|Yes|
|du(1, 3, b1)|Yes|
|du(1, 4, b1)|Yes|

DU pair coverage = total DU pairs/ tested DU pairs * 100% = 4/4 *100% = 100%



# 3 A detailed description of the testing strategy for the new unit test

Our strategy for increasing the code coverage of our tests is to first create test cases based on the requirements on the Javadocs. We will then test the code coverage with these new test cases with elcEmma. Finally, we will alter these test cases if necessary to increase the code coverage of our test suite. We will target the methods that scored low code coverages measured above.

We choose to create test cases for intersects() from Range and equal() from DataUtilities. 

We will create 1 test case per person and the first to finish will do the a second test case.

# 4 A high level description of five selected test cases you have designed using coverage information, and how they have increased code coverage

Text…

# 5 A detailed report of the coverage achieved of each class and method (a screen shot from the code cover results in green and red color would suffice)

Text…

# 6 Pros and Cons of coverage tools used and Metrics you report

Text…

# 7 A comparison on the advantages and disadvantages of requirements-based test generation and coverage-based test generation.

Text…

# 8 A discussion on how the team work/effort was divided and managed

Text…

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

The main lessons that our group leaned throughout this assignment was the usage of coverage tools in white box testing. In this assignment, we were introduced with testing tools such as JUnit and EclEmma to further improve our understanding with white box testing. In 3.2 of the assignment handout, we were also familiarized with data flow coverage by calculating the DU-pair coverages. In this part, we learned how to use data flow graphs to analyze the methods calculateColumnTotal() from DataUtilities and intersects(double, double) from Range.

A difficulty that we encountered was trying a different code coverage tool instead of EclEmma since EclEmma did not do condition coverage. Initially, we were trying to use CodeCover however it did not run on our version of Eclipse. 


# 10 Comments/feedback on the lab itself

This assignment was helpful in familiarizing ourselves with white box testing through the use of code coverage tools and unit tests. The handout was easy to follow allowing us to understand the usefulness of writing white box testings using EclEmma and JUnit
