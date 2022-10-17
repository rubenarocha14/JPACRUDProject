# JPACRUDProject

#Description

The purpose of this assignment is to create a database and allow it's data to
be manipulated with CRUD functionalities using JPA. The application I chose was
centered around a golfing app that displays a list of golfers. The user should
be able to create a new golfer, delete and existing one, and update as well.
The end vision for the app is to be able to display a list of golfers who are
within a specified handicap range of the user, as well as a specified distance
from the user. I got create and delete to work just find, however I am having
getting the update to work. I'm honestly not sure what the issue is. My application
opens with the index.jsp which displays the list of current golfers in the system,
and gives the user the option of creating a new golfer, deleting or updating an
existing one. When the user chooses to create a new golfer, the app will take
the user to createProfile.jsp which give the user the form to enter in the golfers
info and submit the info using a button. The next page indicates the update was successful
and provides a button to return to the home page. To delete a golfer, the user
should enter the id associated with the golfer to delete the golfer. I tried a few
different methods to get the update to work, however all to no avail. The first
solution I tried was similar to the delete, where the user would enter an id to update,
however when they clicked the update button, it would take them to an updateProfile.jps
the issue I had with this was the data wouldn't transfer from one page to another. So When
the user got to the updateProfile page and tried to udpdate, there was no value
associated with the page to update. I also tried adding a simple anchor tag to the
updateProfile page where I had updated it to display the current golfers, and the user
could select a golfer to update on that page, however it still didn't take. I wasn't able
to get any css/bootstrap input into the site because I wanted to figure out the
CRUD prior to making it look pretty.

#database
My database consists of a Player with an primary key, non-null, autoincramented
id, non-null first name, non-null last name, optional handicap,
city, state, and image url. All of these database attributes are correlated to the
Player entity. The database was made in MySQL Workbench and verified in the terminal
with sql.

#Lessons Learned
This project felt very similar to the MVCSpring project from last week, however the
update functionality was still the feature I struggled with the most, similarly
to last week's project. I refreshed on materials, however I need to continue
refreshing on jsp scope. Other materials are really starting to click, I was much better
with the structrue of the web page this week, and how everything is connected as far
as controller to jsp etc.

#Technology Used
SpringBoot, Gradle, css, html, SQL, MySQL Workbench, Youtube
