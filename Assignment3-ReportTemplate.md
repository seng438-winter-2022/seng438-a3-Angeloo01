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

Text…

# 3 A detailed description of the testing strategy for the new unit test

Text…

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

Text…

# 10 Comments/feedback on the lab itself

Text…
