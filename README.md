# edt-rest-api-exercise

This is a simple project that will set up a JERSEY / JAX-RS web service connected to a SQLite database using Apache Common DbUtils. The project should be a starting point for a coding exercise to create a REST API.

# Set up
1. Install Eclipse IDE for Java EE Developers: [Download](https://www.eclipse.org/downloads/eclipse-packages/)
1. Clone this git repository: [https://github.com/caspian154/edt-rest-api-exercise.git](https://github.com/caspian154/edt-rest-api-exercise.git)
    1. Create a branch 
1. Open eclipse EE & create a new workspace
1. Import the project that was cloned: File > Import... > Existing Maven Projects
    1. Root Directory: select the location you cloned the git repository 
    1. check edt-rest-api-exercise
    1. Click Finish
1. Install the tomcat Server
    1. Open the Java EE Perspective: Window > Perspective > Open Perspective > Java EE
    1. Click the Servers tab on the bottom
    1. Click the "No servers are available. click (etc)" link
    1. Select Apache > Tomcat v7.0 Server 
    1. Click Next
    1. Either Browse to a location where Apache Tomcat is or click Download and Install...
    1. Click Finish
1. Add the deployment to the tomcat Server
    1. Right Click Tomcat v7.0 Server at localhost in the servers tab > Add and Remove...
    1. Move edt-rest-api-exercise to the "Configured:" bucket.
    1. Click Finish
1. Start the tomcat Server
    1. Right Click Tomcat v7.0 Server at localhost in the servers tab > Debug

# Additional Resources
- [Github Guides](https://guides.github.com/)
    - Understanding the GitHub Flow and Hello World should get you where you need to be
- [DB Browser for SQLite](http://sqlitebrowser.org/)
- [Apache Commons DbUtils](https://commons.apache.org/proper/commons-dbutils/)
