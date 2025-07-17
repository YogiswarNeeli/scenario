Feature: I am automating orangeHRM application

Background: Common re-usable steps
Given user launch browser
Then enters URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario Outline: TC01_AddSkills Record - creating skills record

And user enters username as "Admin" and password as "admin123" clicks login 

Then go to skills page 

Then user enters skillname as <SKILLNAME> and skill description as <SKILLDESC>

When clicks logout 

Then Close the browser


Examples: 
|SKILLNAME|SKILLDESC|
|"Java45"|"Java45 desc"|
|"Java46"|"Java46 desc"|
|"Java47"|"Java47 desc"|


