# Lab5 Questions :

Q1. Write a package which contains a class called abstract class Citizen. Accept following details through
parameterized constructor
1) Name
2) Aadhar no
3) Phone number
4) Age
Citizen class also contains an abstract method called verifyAge() which checks if the person is above 18
years of age or not.
Create a Vaccine class which will use the Citizen package and extend it .It will implement verifyAge()
method .If the person is not eligible for vaccination then throw an exception.

Q2. Create a package that consists of two public classes. First class contains method which takes a list as
input and returns sum of them. Second class contains method which also takes a list as input and returns
minimum number from that array. Now create a main class and import this package and both these
classes. In this main class given a List of numbers find:
ans=sum(arr)/min(arr) ,where sum(arr) returns sum of arr
min(arr) returns min of arr.
Return ans.
Implement appropriate error handling mechanisms to handle any possible exception that you might
encounter.

Q3. Write a java program that demonstrates checked and unchecked exceptions. Implement two methods,
where first method throws 2 unchecked exceptions and second method throws 3 checked exceptions. Also
handle these exceptions using appropriate try-catch and finally block.

Q4. Write a java program which contains 4 methods says first, second, third and fourth. Main method
will call first, first will second, second will third and third will call fourth. In fourth method throw an
ArithmeticException and propagate this exception up to the main method and handle it in main method.

Q5. Finally will always be executed whether exception is handled or not. Even if you return from the
method in the try block, finally block will still be executed. Write a java program which demonstrates this
concept. In finally block throw an exception, which is different from the exception thrown in the try
block. Handle these exceptions appropriately.