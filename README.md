# Challenge

## General Facts
While writing this project I was focussing on the backend part. The style I used follows the one introduced by Yegor Bugayenko called Elegant Objects. It follows Best Practices of OOP like immutable classes, programming against interface, fail fast exception handling, single responsibility principle, loose coupling and encapsulation.  
The structure of the code allowed to bring the exception handling part close to the UI intersection so that exception handline could be effectively focussed on one Facade and brought to the UI in a fail fast manner. Having said this the exception handling could use a little more attention and was only drafted due to the limited amount of time. Testing was only done manually and writing proper tests would be a next step in the development process.
The front end was added for sake of completeness and would not have been possible for me to code within 8 hours, but it was fun writing.
The time spent was roughly 2 hours conceptualizing on my way to work and 4 hours implementing the back-end code. 
There is an executable jar-file in the root folder of the project. Run it on a JRE11 and use localhost:8080 to access the application.
By default the second list of words is used "Word, Word, Word, word". To see the app work on the first list of words, a change in the ResourceProvider interface Fake class.  

Happy reviewing
