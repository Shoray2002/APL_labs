Q1. Java Thread life Cycle
Create Java program demonstrating thread states. Create three threads and name them as
sachin, virat and sehwag. Using java.lang.Thread.class demonstrate life cycle of the thread, i.e.
1) New 
2) Active 
3) Runnable 
4) Running 
5) Blocked/Waiting.

Q2. Java Thread Methods
Create Java program that implements 3 threads using Thread class. Name them as Sania,
Maria, Serena. Give them different priority and demonstrate the use of following methods:
1) run()
2) start()
3) sleep() -Sania sleeps for 100ms,Maria for 200ms,Serena for 300ms
4) join()
5) getpriority()
6) yield()
7) suspend
8) Resume

Q3. Start vs run
Implement the above program using runnable interface. Also, see what happens when you call
run method directly without calling start. And set equal priority to all threads. Write a program
that demonstrates this and print your explanation in the terminal for what is happening when you
call run() directly.

Q4. Daemon Thread
“Daemon Thread are threads who sole purpose is to serve other threads. When it is no longer
serving anyone it dies.”
Create a java program that implements 3 threads. Make one of them as daemon thread and
demonstrate the truth of the above statement.

Q5. Thread Poll/ThreadGroup
Create a Java program that implements three thread classes in different packages. In the main
methods create instances of it and put it in a ThreadGroup. Demonstrate any 7 methods
available in Java Thread Group Class.

Q6. Java Shutdown Hook
“The shutdown hook can be used to perform cleanup resource or save the state when JVM
shuts down normally or abruptly.”

Write a java program that demonstrates how java shutdown hook works by create 3 anonymous
thread classes .Create an instance of runnable and add the threads classes created earlier into
the shutdown hook. Demonstrate that the above statement is true.

Q7. Garbage Collection and Runtime class
Write a java program that demonstrates the use of java runtime class to following operations
1) Open notepad
2) Create a new file called mythread.java
Also, implement demonstrate garbage collection in java. (Hint: think of differencing and
finalize() method);