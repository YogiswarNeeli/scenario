
@


Feature: I am automating orangeHRM application
Background: Common re-usable steps
Given user launch browser
Then enters URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

@Regression
Scenario: TC01_ParallelExecution - creating skills record
And user enters username as "Admin" and password as "admin123" clicks login 
Then go to skills page 
Then user enters skillname as "Selenium34" and skill description as "Selenium34 desc"

@sanity @smoke
Scenario: TC02_ParallelExecution - creating Jobs record 
And user enters username as "Admin" and password as "admin123" and click login btn
Then go to jobs page
Then user enters jobtitle as "Java21" and job desc as "Java31 desc" and jobnote as "Java31 note"

@smoke @Regression
Scenario: TC03_ParallelExecution - creating Nationality record
And user enters username as "Admin" and password as "admin123" clicks login 
Then go to Nationality page 
Then user enters Nationalityname as "Yogiswar"


When clicks logout 

Then Close the browser