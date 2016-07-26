HelloTWU
========

App for library management

Tools:
* git
 * preinstalled in MacOSX
 * if not there follow instructions: http://git-scm.com/book/en/v2/Getting-Started-Installing-Git
* java
 * http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html
* firefox - http://www.mozilla.org/en-US/firefox/organizations/all/
* postgres
 * for Ubuntu - https://help.ubuntu.com/community/PostgreSQL
 * for Mac:
   * download http://postgresapp.com/
   * Then make sure you have the Postgres App Command Line Tools set up. Follow the documentation: http://postgresapp.com/documentation (Command-Line Tools section)

You should do:
* Get a copy of the app code by clicking the 'Download ZIP' button on the righthand side of the github page (https://github.com/johncowie/hellotwu/archive/master.zip).
* Start the Postgres server on your machine, by opening the Postgres app(little blue elephant) located in your Applications folder.
* To setup your environment(create DB and users allowed to access the DB). Execute in the terminal:
  ```./gradlew clean build```

This should set up your machine to run the library management webapp and its tests properly.

To start the Library Management webapp, open up a terminal window and navigate into the TWU_libraryManagement directory.

Run ```./gradlew jettyRun```

Navigate to http://localhost:8080 in a browser. You should see the welcome page.
Once you see the message, go to the terminal and press Control + C to stop the Jetty process.

Run ```./gradlew functionalTest```

This will trigger a functional test that will perform an automated test of the app with firefox.
If everything goes well, you will see a "Build Successful" message in your terminal window after the tests are executed.
# TWU_libraryManagement
