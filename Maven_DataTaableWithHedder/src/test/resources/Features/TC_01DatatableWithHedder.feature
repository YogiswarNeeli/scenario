Feature: i Am Automating ORANGE HRM 

Background: Common re-usable steps

Given User open browser
Then user enters URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01_AddJobs - creating jobs record

And user enters credentials

|USERNAME|PASSWORD|
|Admin|admin123|

Then go to jobs page
Then user enters job details

|JOBTITLE|JOBDESC  |JOBNOTE    |
|Java77|java77 desc|java77 note|
|Java78|java78 desc|java78 note|
|Java79|java79 desc|java79 note|
|Java76|java76 desc|java76 note|

When user clicks logout
Then close browser

