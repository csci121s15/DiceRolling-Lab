# CSCI 121: Computer Science II
## Dice Rolling Lab

### Overview

In this lab you will write a class of your own and use it along with an existing class to run Monte Carlo simulations.

As with last week's lab, all the code you submit will be in the `src/` directory, and the answers to the lab questions will be in a markdown file called `Answers.md`. Fork this repository and clone the forked repository to your local machine to get started.

### Rolling Dice

The Monte Carlo simulation in this lab is quite simple. You will write a program to roll two dice repeatedly and keep track of how many times each roll (the sum of the upward facing values of the two dice) occurs. Before you begin, answer the following question:

>**Question 1:** The probability of rolling a certain number is the number of possible rolls that can sum to that number divided by the total number of possible rolls. What is the probability of rolling a 7? What is the probability of rolling a 2?

### Creating a Histogram

In the `src/` directory there is a file called `Die.java` from last week's lab. Use this class to roll dice for the simulations.

In lab last semester we created a `Histogram` class in Python to keep track of the frequency of the most significant digits of a set of numbers. Here we will create a `Histogram` class in Java to keep track of how many times each roll occurs. As you did in your Python class, your Java class should keep track of the counts in an array of ints.

The interface for your class should have the following methods:

* `tally(int roll)`: A mutator which increments the appropriate element of the array.
* `getCount(int roll)`: A query which returns the number of occurrences of the given roll.
* `getRatio(int roll)`: A query which returns a double representing the ratio of the number of rolls which resulted in the given roll to the total number of rolls.
* `print()`: A method which prints a line for each possible roll. Each line should contain the roll value, the number of occurences of that roll, and the frequency ratio for that roll.
* `prettyPrint()`: A method which prints the histogram graphically using text, so the distribution of values is more clear. Here is an example of `prettyPrint()` output after 100 rolls:

```
2:  *********************
3:  ***************
4:  *********************
5:  **************************************************
6:  ******************************
7:  ************************************************
8:  ************************************
9:  ***************************
10: ************************
11: ***************
12: ************
```

### Running Simulations

Start by simulating 100 dice rolls and tallying the results. After each simulation, print and pretty print the histogram. Run the simulation 5 times and answer the following question:

>**Question 2:** Comment on the variation of values among the simulation runs. Is 100 rolls sufficient to determine the relative frequency of all the possible rolls?

Increase the number of rolls to 5,000 and run the simulation 5 more times.

>**Question 3:** How did increasing the number of simulations affect the results?

Ideally the frequency ratios for each roll result should be the same as the probabilities you calculated in Question 1. The more rolls you perform per simulation the closer you should get to the actual probabilities. Answer the following question by running simulations with increasing numbers of rolls.

>**Question 4:** How many rolls per simulation does it take before you can accurately predict the probability of rolling a 7 to 3 significant digits five times in a row? How about for the probability of rolling a 2?

### Submission

Use `git status` to make sure you've added all the appropriate files to the repository, commit using `git commit -a`, push your changes back to GitHub, and create a pull request.