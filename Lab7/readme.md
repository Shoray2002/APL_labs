Q1. ”Synchronization in Java is the capability to control the access of multiple threads to any
shared resource.”

Write a java program demonstrating thread synchronization using

    1)Synchronization method
    2)Synchronization block

Q2. Write a java program to demonstrate the use of static synchronized method.
Create a 3 threads say t1, t2 and t3 respectively and make use of static synchronization.

Q3. ” Deadlock in Java is a part of multithreading. Deadlock can occur in a situation when a
thread is waiting for an object lock, that is acquired by another thread and second thread
is waiting for an object lock that is acquired by first thread. “

Implement a java program that goes into deadlock by creating 4 threads t1, t2, t3 and t4. You
should make use put print statements at appropriate positions to make it evident that your
program has entered deadlock.

Q4.Inter-thread communication or Co-operation is all about allowing synchronized threads to
communicate with each other.
Write a java program using three threads t1, t2 and t3 using Thread classes in separate files.
Make use of them in your main class. Using the demonstrate the working of

    1)wait()
    2)notify()
    3)notifyAll()

Q5. The 3 methods provided by the Thread class for interrupting a thread
• public void interrupt()
• public static Boolean interrupted()
• public Boolean isInterrupted()
Write a java program that demonstrates the use of above three methods. Create four threads t1,
t2, t3 and t4 and demonstrate. Also, handle the exception, when interrupt is called when threads
when sleep() or wait() are already called on them.