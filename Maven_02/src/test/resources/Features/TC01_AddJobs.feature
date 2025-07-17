Feature: i Am Automating ORANGE HRM 

Background: Common re-usable steps

Given User open browser
Then user enters URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01_AddJobs - creating jobs record

And user enters username as "Admin" and password as "admin123" and click login btn
Then go to jobs page
Then user enters jobtitle as "Java214" and job desc as "Java314 desc" and jobnote as "Java31 note"

When user clicks logout
Then close browser

