@echo off
SET TARGET_APPLICATION_DIRECTORY=%1
SET FILENAME=%2
SET LOG_DIRECTORY=%TARGET_APPLICATION_DIRECTORY%
CD %TARGET_APPLICATION_DIRECTORY%

SET LOGFILE=%LOG_DIRECTORY%\runJAR_LogFile.log
@echo on
@echo start execution of runJAR bat file > %LOGFILE%
@echo ----------------------------------- >> %LOGFILE%
@echo TARGET_APPLICATION_DIRECTORY=%TARGET_APPLICATION_DIRECTORY% >> %LOGFILE%
@echo FILENAME=%FILENAME% >> %LOGFILE%
@echo ----------------------------------- >> %LOGFILE%
java -jar %FILENAME% >> %LOGFILE%
@echo end >> %LOGFILE%