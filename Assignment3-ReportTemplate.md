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

### DataUtilities: equal(double[][], double[][])
|Test Case|Purpose|improve line coverage|improve branch coverage|improve method coverage|
|-|-|-|-|-|
|firstNullArray|test with two null arrays|yes|yes|same|
|secondNullArray|test with the first parameter as null|yes|yes|same|
|secondNullArray2|test with the second parameter as null|yes|yes|same|
|unequalSizedArrays|test with unequal sized arrays|yes|yes|same|

### Range: intersects(double, double)
|Test Case|Purpose|improve line coverage|improve branch coverage|improve method coverage|
|-|-|-|-|-|
|falseEqualBounds|test with unequal sized arrays|same|yes|same|


# 5 A detailed report of the coverage achieved of each class and method (a screen shot from the code cover results in green and red color would suffice)

Text…

# 6 Pros and Cons of coverage tools used and Metrics you report
|Test Tools|Pros|Cons|Metrics Reported|
|-|-|-|-|
|EclEmma|Pre-installed in Eclipse. Chose EclEmma for its simplicity to install and implement into our project. Easy to run and report line, instruction, branch and method coverage for the test suite| Does not report condition coverage for the methods in the test suite|Reported line coverage, branch coverage and method coverage as a substitute for condition coverage|




# 7 A comparison on the advantages and disadvantages of requirements-based test generation and coverage-based test generation.

Requirements based test generation is built upon black box testing, where the source code of the program being tested is unknown, thus testing is done based on the requirements of the program. Coverage based test generation is a type of white box testing, where tests are built upon the knowledge of the source code. Coverage based testing allows the test engineers to know how much of the code the test covers, and if the test take care of all possibilities the program may face. In requirements based engineering, certain scenarios may be missed, as the engineers cant possibly know what parts of the code that was missed, however some code may be negligible to the requirements of the system thus less effort in testing. Coverage based testing allows for all parts of the code to be tested and to make sure all scenarios are taken care of, however more time is taken for large programs, as there is more code to parse through when testing.

# 8 A discussion on how the team work/effort was divided and managed

Team work was divided equally, as all team members worked together one each part of the lab. Each member of the team went through the familirization of eclemma, and were responsiblle on checking the coverage of the tests. As a team we went through the coverage statistics and determined which methods and requirements we needed to further test. Once the plan was created, members worked on creating unit tests until coverage was improved as much as possible, with an equal workload distributed to each. Finally, the lab report writeup, was split equally between members. Throughout the lab, each member was responsible for keeping each other accountable, and make sure that the work was done in time.

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

Text…

# 10 Comments/feedback on the lab itself

Text…
