setlocal
set JAVA_HOME=%JAVA6_HOME%
call mvn -X -DperformRelease -Psamples,tests,dist clean install >std 2>err
endlocal