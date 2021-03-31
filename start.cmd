@ECHO OFF
echo Checking if java can be run from CMD...
java -version
if errorlevel 9009 (
    echo Failure: Make sure JDK binaries are added to PATH.
    pause
    exit /b %errorlevel%
)
echo Setting up CLASSPATH...
set CLASSPATH=%cd%\postgresql-42.2.19.jar;.
echo Compiling .java files...
javac *.java
echo Starting up the Hotel Java client...
echo =================================================================
echo Group 22 Submission, CSI 2132
echo Database designed by: Adam Nykorak, Bryson Crooks
echo Java Client backend and frontend developed by: Arman Kompany Zare
java Main
