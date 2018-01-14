rem Packaging the readme/license files with the 32-bit executable
rem The batch file Launch4j.bat must be executed before this batch file is
E:\Apps\Cmder\bin\7za.exe a -sfx7z.sfx C:\Users\franc\Documents\GitHub\Oncoupe\bin\win\x32\Oncoupe-0.1.0-alpha-win32.exe C:\Users\franc\Documents\GitHub\Oncoupe\README.pdf C:\Users\franc\Documents\GitHub\Oncoupe\LICENSE C:\Users\franc\Documents\GitHub\Oncoupe\bin\win\x32\Oncoupe.exe
del C:\Users\franc\Documents\GitHub\Oncoupe\bin\win\x32\Oncoupe.exe

rem Packaging the 64-bit JRE version 1.8.0_152 and the readme/license files with the 32-bit executable requiring a 64-bit os
rem The batch file Launch4j.bat must be executed before this batch file is
E:\Apps\Cmder\bin\7za.exe a -sfx7z.sfx C:\Users\franc\Documents\GitHub\Oncoupe\bin\win\x64\Oncoupe-0.1.0-alpha-win64.exe C:\Users\franc\Documents\GitHub\Oncoupe\README.pdf C:\Users\franc\Documents\GitHub\Oncoupe\LICENSE "C:\Program Files\Java\jdk1.8.0_152\jre" C:\Users\franc\Documents\GitHub\Oncoupe\bin\win\x64\Oncoupe.exe
del C:\Users\franc\Documents\GitHub\Oncoupe\bin\win\x64\Oncoupe.exe

rem Packaging the readme/license files with the Java ARchive
rem The batch file Launch4j.bat must be executed before this batch file is
E:\Apps\Cmder\bin\7za.exe a -sfx7z.sfx C:\Users\franc\Documents\GitHub\Oncoupe\bin\jvm\Oncoupe-0.1.0-alpha-jar.exe C:\Users\franc\Documents\GitHub\Oncoupe\README.pdf C:\Users\franc\Documents\GitHub\Oncoupe\LICENSE C:\Users\franc\Documents\GitHub\Oncoupe\out\artifacts\Oncoupe\Oncoupe.jar