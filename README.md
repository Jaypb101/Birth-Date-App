# Birth Date App

A Java program that determines the day of the week on which a person was born based on their birth date.

## Description

This program asks the user to enter their birth date as a month, day, and year.

Using the entered date, the program calculates the corresponding day of the week and displays the complete birth date with the month written out.

## Example

```text
Birth Date by J. Briones

Enter your birth date month day year? 7 15 2004

You were born on Thursday, July 15, 2004.
```

## Project Structure

```text
src/
└── birthdate/
    └── BirthDateApp.java
```

## How It Works

The program:

* Reads the user's birth month, day, and year.
* Uses `getDayOfTheWeek()` to calculate the day of the week.
* Uses `getMonthName()` to convert the numerical month into its name.
* Displays the complete birth date and corresponding day of the week.

## Concepts Used

* Java methods
* User input with `Scanner`
* Arrays
* Integer arithmetic
* Variables and data types
* Array indexing
* Console input and output

## Requirements

* Java Development Kit (JDK)

## Running the Program

Compile the program:

```text
javac -d bin src/birthdate/BirthDateApp.java
```

Run the program:

```text
java -cp bin birthdate.BirthDateApp
```

## Author

Jayden Briones

## Course

CS 1400 - Homework 4
