#!/bin/bash


echo "Checking if java can be run from the terminal..."
java -version
if [[ $? -ne 0 ]]; then
	echo "Failure: Make sure JDK binaries are added to PATH."
	read -p "Press any key to continue . . ."
	exit
fi
echo "Setting up CLASSPATH..."
export CLASSPATH=$(pwd)/postgresql-42.2.19.jar:.
echo "Compiling .java files..."
javac *.java
echo "Starting up the Hotel Java client..."
echo "================================================================="
echo "Group 22 Submission, CSI 2132"
echo "Database designed by: Adam Nykorak, Bryson Crooks"
echo "Java Client backend and frontend developed by: Arman Kompany Zare"
java Main
