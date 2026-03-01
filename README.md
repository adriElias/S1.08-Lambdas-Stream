# Java Lambdas & Streams – Level 1

Educational Java project to practice **lambda expressions**, **Streams API** (Java 8+), and **functional interfaces**.

## Objective

- Write concise, declarative code using lambdas and streams
- Transform, filter, and sort collections elegantly
- Use built-in functional interfaces (`Predicate`, `Function`, `Consumer`, etc.)
- Create custom functional interfaces and use them with lambdas
- Replace traditional loops with modern functional style

## Exercises Covered

1. Filter strings containing 'o'
2. Filter strings containing 'o' **and** longer than 5 characters
3. Print months list using lambda
4. Print months list using **method reference**
5. Custom functional interface returning π (3.1415)
6. Sort list of mixed strings/numbers by string length (short → long)
7. Reverse sort by string length (long → short)
8. Custom functional interface `reverse()` that reverses a String via lambda

## Project Structure
```text
lambdasStreams/
├── pom.xml
└── src/
├── main/java/
│   └── Main.java
├── test/java/
│   └── MainTest.java 

```
## How to Run

```bash
# Maven
mvn test
```

### Example Output
```text
Exercise 1: Strings with 'o'
hello, world, java, bootcamp

Exercise 2: Strings with 'o' and length > 5
hello, world, bootcamp

Exercise 3: Months with lambda
January, February, March, ...

Exercise 4: Months with method reference
January, February, March, ...

Exercise 5: Pi value via functional interface
3.1415

Exercise 6: Sorted by length (short → long)
a, bb, ccc, hello world

Exercise 7: Reverse sorted by length
hello world, ccc, bb, a

Exercise 8: String reversed via lambda
dlroW olleH ← hello World
```