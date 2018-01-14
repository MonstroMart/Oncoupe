rem Building the 32-bit executable requiring a JRE version 1.8.0+ to be installed (either 32-bit or 64-bit but will run a 32-bit JRE first if available)
rem This executable is built using Launch4j (http://launch4j.sourceforge.net/) and the configuration file Oncoupe32.xml
rem To build a new executable on another workstation than mine be sure that the Launch4j configuration file Oncoupe32.xml is properly set for your environment
"C:\Program Files (x86)\Launch4j\Launch4j.exe" C:\Users\franc\Documents\GitHub\Oncoupe\Oncoupe32.xml

rem Building the 32-bit executable requiring a 64-bit os and a 64-bit JRE version 1.8.0_152 to be bundled with it
rem This executable is built using Launch4j (http://launch4j.sourceforge.net/) and the configuration file Oncoupe64.xml
rem To build a new executable on another workstation than mine be sure that the Launch4j configuration file Oncoupe64.xml is properly set for your environment
"C:\Program Files (x86)\Launch4j\Launch4j.exe" C:\Users\franc\Documents\GitHub\Oncoupe\Oncoupe64.xml