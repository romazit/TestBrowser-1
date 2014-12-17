rem cvs -d :pserver:roman@bambi:2401/rmRepository login
rem cvs -d :pserver:roman@bambi:2401/rmRepository checkout TestBrowser
rem cd TestBrowser
rem c:\Misc\TestBrowser\jre7\bin\java -jar TestBrowser.jar
rem dir
rem cd dist
git pull
java -jar TestBrowser-1.jar
rem cd ..