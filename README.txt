First steps in microservices!

Why do we need microservices?
- Like everything in the programming world, microservices are invented to solve a certain problem.
So a better question would be "What problem do microservices solve?".
- Sometimes some applications are deployed as one single build, as one tightly coupled unit.
This type of applications are called monolithic and use the  monolithic architecture.
These monolithic applications may be easier to deploy, but are extremely challenging to maintain
and build on top of!
- This is the problem that microservices solve. Microservices are like mini application, working together
to create the main application. Each microservice focuses on only one task, and when its functionality is needed
by the client, the microservice is being only then called!
- Microservices architecture breaks down the application into smaller, loosely coupled services.
Each service has its own codebase, database, and deployment unit. This makes microservices easier to
maintain, scale of top and resource efficient!

To learn in detail microservices I encourage you to follow Java Brains tutorial in YouTube.
The course is made in understandable, highly detailed and easy to follow way. The course provides
examples, diagrams and more!

Links to the videos:
Level 1: https://www.youtube.com/playlist?list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas
Level 2: https://www.youtube.com/watch?v=o8RO38KbWvA&list=PLqq-6Pq4lTTbXZY_elyGv7IkKrfkSrX5e
Level 3: https://www.youtube.com/watch?v=upoIwn4rWCo&list=PLqq-6Pq4lTTaoaVoQVfRJPqvNTCjcTvJB

Important:
Note that for all the microservices to work properly they need to exist in separate projects!
I have put them all here (the project microservice) for easier access and review. When they are in
the same project this seems to causing a problem between they run time and communication with one another.
