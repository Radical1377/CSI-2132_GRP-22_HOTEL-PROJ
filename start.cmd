@ECHO OFF

ECHO "$$\   $$\  $$$$$$\ $$$$$$$$\ $$$$$$$$\ $$\                                          " 
ECHO "$$ |  $$ |$$  __$$\\__$$  __|$$  _____|$$ |                                         " 
ECHO "$$ |  $$ |$$ /  $$ |  $$ |   $$ |      $$ |                                         " 
ECHO "$$$$$$$$ |$$ |  $$ |  $$ |   $$$$$\    $$ |                                         " 
ECHO "$$  __$$ |$$ |  $$ |  $$ |   $$  __|   $$ |                                         " 
ECHO "$$ |  $$ |$$ |  $$ |  $$ |   $$ |      $$ |                                         " 
ECHO "$$ |  $$ | $$$$$$  |  $$ |   $$$$$$$$\ $$$$$$$$\                                    " 
ECHO "\__|  \__| \______/   \__|   \________|\________|                                   " 
ECHO "                                                                                    " 
ECHO "                                                                                    " 
ECHO "                                                                                    " 
ECHO "$$$$$$$\  $$$$$$$\         $$$$$$\  $$\       $$$$$$\ $$$$$$$$\ $$\   $$\ $$$$$$$$\ " 
ECHO "$$  __$$\ $$  __$$\       $$  __$$\ $$ |      \_$$  _|$$  _____|$$$\  $$ |\__$$  __|"
ECHO "$$ |  $$ |$$ |  $$ |      $$ /  \__|$$ |        $$ |  $$ |      $$$$\ $$ |   $$ |   " 
ECHO "$$ |  $$ |$$$$$$$\ |      $$ |      $$ |        $$ |  $$$$$\    $$ $$\$$ |   $$ |   " 
ECHO "$$ |  $$ |$$  __$$\       $$ |      $$ |        $$ |  $$  __|   $$ \$$$$ |   $$ |   " 
ECHO "$$ |  $$ |$$ |  $$ |      $$ |  $$\ $$ |        $$ |  $$ |      $$ |\$$$ |   $$ |   " 
ECHO "$$$$$$$  |$$$$$$$  |      \$$$$$$  |$$$$$$$$\ $$$$$$\ $$$$$$$$\ $$ | \$$ |   $$ |   " 
ECHO "\_______/ \_______/        \______/ \________|\______|\________|\__|  \__|   \__|   " 
                                                                                    
                                                                                    
                                                                                    

ECHO ============================================================================
ECHO Group 22 Submission, CSI 2132
ECHO Database Designed and Populated by: Adam Nykorak, Bryson Crooks
ECHO Java Client Backend, Frontend and Launcher Developed by: Arman Kompany Zare
ECHO ============================================================================

IF NOT EXIST jdk-16\ (
   	ECHO [!] Java not detected on PATH!
	ECHO [+] Downloading and Installing JDK . . .
	CURL -# -o jdk.zip -L -b oraclelicense=accept-securebackup-cookie https://download.oracle.com/otn-pub/java/jdk/16.0.1+9/7147401fd7354114ac51ef3e1328291f/jdk-16.0.1_windows-x64_bin.zip
   	ECHO [+] Extracting JDK . . .
	TAR -xf jdk.zip
	DEL jdk.zip
)
SET PATH=%CD%\jdk-16.0.1\bin;%PATH%

ECHO [+] Setting up CLASSPATH . . .
SET CLASSPATH=%cd%\postgresql-42.2.19.jar;.
ECHO [+] Compiling .java files . . .
JAVAC *.java > NUL 2> NUL
ECHO [+] Starting up the Hotel Java client . . .
JAVA Main > NUL 2> NUL
TIMEOUT 10
