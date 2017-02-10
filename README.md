# BuildProject
If we need to run from the command prompt Use the below command in prompt.
mvn clean install -Dskip.unit.tests=false -DTest_NG_XML=src/test/resources/buildCheckOutTest.xml -Dwebdriver.chrome.driver=C:\AllInOne\SeleniumDrivers\chrome\chromedriver.exe

Need to give hard coded path of chrome dirver location .


