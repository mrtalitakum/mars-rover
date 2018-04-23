Mars Rover Challenge
====================

Assumptions
-----

Assumptions are that the system is being developed for people who are well trained to use it. They are aware of strict steps to input commands for the Mars Rover to execute.

Environment Setup
-----------------

```
Gradle, JAVA
```

Build
-----

```
./gradlew build
```

Usage
-----

After build the project, run it by executing the generated JAR file.

```
java -jar build/libs/mars-rover-challenge-0.0.1-SNAPSHOT.jar
```

Based on the challenge, The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.

Input sample:

```
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM
```

Output:

```
1 3 N
5 1 E
```