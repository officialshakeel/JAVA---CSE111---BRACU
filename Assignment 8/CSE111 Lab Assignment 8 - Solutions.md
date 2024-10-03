```java
//task 1
public class Passenger {
  public static int no_of_passenger;
  public static double total_fare;
  public String name;
  public double fare;
  
  public Passenger(String nm, double digits) {
    name=nm;
    fare=digits*20;
    total_fare+=digits*20; 
    no_of_passenger++;
  }
  public void setBaggageWeight(double nmbr){
    fare+=nmbr*10;
    total_fare+=nmbr*10;
  }
  public void setBaggageWeight(int nmbr){
    fare+=nmbr*10;
    total_fare+=nmbr*10;
  }
  public void passengerDetails(){
    System.out.println("Name: "+name);
    System.out.println("Fare: "+fare);
  }
}

//task2

public class Book {
  public static int total_books_sold;
  public static double total_revenue;
  public String name;
  public double disPrice;
  
  public Book(String nm, int dis){
    name=nm;
    disPrice=150.0-(150.0*dis/100.0);
    total_revenue+=disPrice;
    total_books_sold++;
  }
  public void bookDetails(){
    System.out.println("Title: "+name+"\nPrice after Discount: "+disPrice);
  }
  
}

//task 3

public class Student{
  public static int total;
  public static int cse;
  public static int other;
  public String name;
  public double cgpa;
  public String dept;
  private int ID;
  
  public Student(String nm, double cg){
    name=nm;
    cgpa=cg;
    dept="CSE";
    ID= total++; cse++;
  }
    public Student(String nm, double cg, String dprtmnt){
    name=nm;
    cgpa=cg;
    dept=dprtmnt;
    ID= ++total; other++;
  }
  
  public static Student createStudent(String nm, double cg, String dprtmnt){
    return new Student(nm,cg,dprtmnt);
  }
  
  public void individualDetail(){
    System.out.println("ID: "+ID);
    System.out.println("Name: "+name);
    System.out.println("CGPA: "+cgpa);
    System.out.println("Department: "+dept);
  }
  public static void printDetails(){
    System.out.println("Total Student(s): "+total);
    System.out.println("CSE Student(s): "+cse);
    System.out.println("Other Department Student(s): "+other);
  }
  
}

//task4

public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  public String name;
  public String [] books;
  private int count;
  
  public static void bookStatus(){
    System.out.printf("Available Books: \n%s: %d\n%s: %d\n%s: %d\n",book_name[0],book_count[0],book_name[1],book_count[1],book_name[2],book_count[2]);
  }
  public Borrower(String nm){
    name=nm;
    books = new String [3];
  }
  public void borrowBook(String nm){
    for (int i=0; i<3; i++){
      if (book_name[i]==nm){
        if (book_count[i]!=0){
          book_count[i]--;
          if (count<3){
            books[count++]=nm;
            break;
          }
        }
        else{
          System.out.println("This book is not available.");
        }
      }
    }
  }
  public void borrowerDetails(){
    System.out.println("Name: "+name+"\nBooks Borrowed:");
    for (int i=0; i<3; i++){
      if (books[i]!=null){
        System.out.println(books[i]);
      }
    }
  }
  public static int remainingBooks(String x){
    int i;
    for (i=0 ;i<3; i++){
      if (book_name[i]==x){
        break;
      }
    }
    return book_count[i];
  }
  
  
}

//task 5

public class Cargo {
  public static double capacity = 10;
  public static int count = 1;
  private int id;
  public String type;
  public  double weight;
  public boolean flag = false;
  
  public static double capacity(){
    return capacity;
  }
  public Cargo(String x, double y){
    id = count++; type=x; weight=y;
  }
  public void load(){
    if (capacity>weight){
      capacity-=weight;
      System.out.printf("Cargo %d loaded for transport.%n",id);
      flag = true;
    }
    else { 
      System.out.println("Cannot load cargo, exceeds weight capacity.");
    }
  }
  public void unload(){
    if (flag){
      System.out.printf("Cargo %d unloaded.",id);
      capacity+=weight;
      flag = false;
    }
  }
  public void details(){
    System.out.printf("Cargo ID: %d, Contents: %s, Weight: %.1f, Loaded: %b%n", id, type, weight, flag);
  }
  
  
}

//task 6


public class Circle extends Shape {
  public int radius;
  public void area(){
    System.out.printf("Area of Red Circle: %.2f",Math.PI*Math.pow(radius,2));
  }
}


//task 7

public class Dog extends Animal{
    public String name;
    
    public Dog(){
      System.out.println("The dog says hello!");
    }
    public String getName(){
      return name;
    }
    public void updateSound(String s){
      sound=s;
    }
}

```
