```java
//task1

//a) No

//b) ->

public class UniversityTester
{
  public static void main(String[]args)
  {
    University u1 = new University();
    University u2 = new University();
    
     System.out.println(u1);
     System.out.println(u2);
    
   u1.name = "Imperial College London";
   u1.country = "England";
   u2.name = "Brac University";
   u2.country = "Bangladesh";
     System.out.println(u2.name);
     System.out.println(u2.country);
     System.out.println(u1.name);
     System.out.println(u1.country);
   
  }
}

//task 2

public class Test2{
    public static void main(String [] args){
    Circle c1 = new Circle ();
    System.out.println("Radius of the circle is "+c1.radius);
    System.out.println("The area of the circle is "+3.1416*Math.pow(c1.radius, 2));
    System.out.println("The circumference of the circle is "+2*Math.PI*c1.radius);


    }
}


//task3

public class Student 
{
  public String name = "Bob";
  public int id =1;
}


//task4

public class Vehicle 
{
  public String type = "Car";
  public int wheels = 2;
  public String color = "White";
}

//task5

public class Tournament 
{
 public String name;
 public String sportsType;
 public int numberOfTeams;
 public String []teams;
}

//task6

public class ImaginaryNumber
{
 public int realPart=0;
 public int imaginaryPart=0;
 public void printNumber(){System.out.println(realPart+" + "+imaginaryPart+"i");}
}

//task7

public class Cat
{
  public String color = "White";
    public String action = "sitting";
  public void printCat()
  {
    System.out.println(color+ " cat is "+action);
  
  }


}


//task8

public class Bird 
{
  public String name;
  public int height = 0;
  public void flyUp(int fix)
  {
    height+=fix;
    System.out.println(name+ " has flown up "+ fix+ " feet.");
  }
  public void flyDown(int compare){
    if (compare==1)
    {
      System.out.println(name+ " has flown down "+ compare + " feet and landed.");
    }
    
    else if (height==compare)
    {
      System.out.println(name+ " has flown down "+ compare + " feet and landed.");
    }
    else if (compare>height)
    {
      System.out.println(name+ " cannot fly down "+ compare+ " feet.");
    }
    else if (height>compare)
    {
      System.out.println(name+ " has flown down "+ compare + " feet.");
    }
}
  public void makeNoise()
  {
    if (name.equalsIgnoreCase("Parrot"))
    {
      System.out.println("Squawk");
    }
     else if (name.equalsIgnoreCase("Eagle"))
     {
        System.out.println("Squee");
     }
                
  }
}

//task9

import java.util.*;
public class CellPhone
{
 public String model;
 
 public int store = 0;
 
 public String [] arr = new String [3];
 
 public void storeContact(String contact)
 {
   if (store<3)
   {
     arr[store]=contact;
     store+=1;
     System.out.println("Contact Stored");

   }
   else 
   {
     System.out.println("Memory full. New contact can't be stored.");
   }
 }
 
 public void printDetails()
 {
   if (store==0)
   {
     System.out.println("Phone Model unknown");
     System.out.println("Contact stored "+ store);
   }
   else
   {
     System.out.printf("%nPhone Model %s", model);
   }
   if (store==1){
   System.out.printf("%n Contacts Stored %d%n Stored contacts: %n %s %n", store, arr[0]);
 }
   if (store==2){
   System.out.printf("%n Contacts Stored %d%n Stored contacts: %n %s %n %s %n", store, arr[0], arr[1]);
 }
   if (store==3){
   System.out.printf("%n Contacts Stored %d%n Stored contacts: %n %s %n %s %n %s %n", store, arr[0], arr[1], arr [2]);
 }

 }}



```
