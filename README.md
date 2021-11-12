# DfEFinalProject
<br />
<br />
Create a project using Agile project management <br />
<br />
Create an application back-end that can interact with a local or cloud based database.<br />
<br />
Scope <br />
-Use Multiple Branches to to ensure version control <br />
-Manage a Jira project board with full expansion on stories and criteria <br />
-functional 'back-end' that meets requirements <br />
-A relational database used to persist data <br />
-A build of the application using an integrated build tool <br />
-A series of API calls to ensure CRUD functionality <br /> 
-Fully designed test suits fo the application <br />
<br />
<br />
Why am I doing this? <br />
<br />
This is a project to put into practice what I have learned through the QA Academy Software Skills Course.<br />
By creating a small app that is capable of interacting with a Database while adhering to the practices of DevOps <br />
provides an introduction to industry fundamental principles.<br />
<br />
How I expected the challenge to go<br />
<br />
Given the simplicity of the minimum viable product I was confident in my ability to write the app.<br />
The biggest concern I had was adhering to best practice principles as I progressed.<br />
Being new to Jira the project management was daunting. Planning the whole project without knowing the practices was difficult.<br />
<br />
What Went Well<br />
<br />
Creating the actual API went well. <br />
Despite a moment of confusion when testing features using an ArrayList as soon as the Database functionality was introduced the Testing proceeded smoothly. Achieving an overall coverage of 98.4%.<br />
I was able to successfully use all the elements of the project I am familiar with effectively.<br />
<br />
What Didn't Go As Planned<br />
<br />
I found Jira particularly difficult to use and get used to.<br />
Having created too many Epics I did not realise until late into the creation of the API that the board was set up poorly.<br />
Beyond that I found Sub-tasks difficult to manage as they are not clearly accessible when making tasks and stories.<br />
After finishing the API i realised that SQL integration would not work as the credentials to log in to SQL servers would not make it possible for the API to function with SQL locally for the user.<br />
Instead I enabled functionality for an in memory Database using H2 included in Spring Boot<br />
A problem I did not expect to encounter was that by using the Spring Boot IDE instead of Eclipse with the Spring Add-on I did not have the add-on that allowed me to track Coverage of test code and had to add ECL Emma to my IDE.<br />
When compiling my code into a .jar file maven created 2 .jar's. I chose the larger file and encountered an issue where the .jar couldnt find main. It was in fact the smaller .jar that worked without issue.
<br />
Possible Improvements<br />
<br />
I wanted to add more functionality to the API. Namely adding a search by function that could call upon all entries that match e.g. find all dwarves.<br />
A way to close the database link to SQL, It is however unnecessary as the final .jar uses H2.<br />
Potentially a way to allow users to make this work with their own SQL needing to input their own username/password.<br />
Alongside the SQL functionality a way to close the connection to the database would be nice to add.<br />
<br />
<br />
Functionality Screenshots<br />
<br />

