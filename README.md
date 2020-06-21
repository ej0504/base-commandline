#Base Commandline Project
## A starting point for simple command line projects.

### Technologies
* Maven, with the shade plugin.
* Guice for Dependency Injection.
* JUnit5 (with parameterized tests) and AssertJ.

### How to build
Run `mvn package` in the base folder.

### How to run
From the base folder, run
`java -jar target/base-commandline-1.0-SNAPSHOT-shaded.jar <INPUT>`.
 
`<INPUT>` will be logged twice at `INFO` level.
