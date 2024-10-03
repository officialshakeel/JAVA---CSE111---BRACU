```java

//task1

public class Student1 {
  public String name;
  public String prog;
  public Student (String name, String sub) {
    this.name = name; prog = sub;
  }
  public void updateName(String name){
    this.name = name;
    }
  public String accessName(){
    return name;
  }
  public void updateProgram(String sub) {
    prog=sub;
  }
  public String accessProgram(){
    return prog;
  }

}

//task2

public class Toy {
  public String name;
  public int digit;
  public Toy (String type, int num) {
    name = type; digit = num;
    System.out.println("A new toy has been made!");
  }
  public void updatePrice(int num){
    digit = num;
  }
  public void showPrice(){
    System.out.println("price: "+digit+" Taka");
  }
  public void updateName(String name) {
    System.out.printf("Changing old name: %s\n",this.name);
    this.name = name;
    System.out.println("new name: "+this.name);
  }
}

//task3

public class Parcel {
  public String name;
  public int weight;
  public double fee;
  public Parcel () {
  }
  public Parcel (String name){
    this.name=name;
  }
  public Parcel (String name, int weight){
    this.name=name; this.weight=weight;
  }
  public void printDetails() {
    if (name==null) {
      System.out.println("Set name first");
    }
    else {
      System.out.printf("Name: %s\nTotal Weight: %d\nTotal Fee: %.1f\n", name, weight, fee);
    }
  }
  public void calcFee(String location){
    if (location.equalsIgnoreCase("Dhanmondi")){
      fee= (weight*20.0)+50.0;
    }
    else {fee= (weight*20.0);}
  }
  public void addWeight(int weight) {
    this.weight+=weight;
    System.out.println("Updated Weight: "+this.weight);
  }
}

//task4

public class Shape2D {
 public int val [];
 public double area;
 public String type;
 public Shape2D (int length) {
   val = new int [] {length};
   System.out.println("A Square has been created with length: "+length);
   }
 public Shape2D (int length, int breadth){
   val = new int [] {length, breadth};
   System.out.println("A Rectangle has been created with length: "+length+" and breadth: "+breadth);
   }
 public Shape2D (int height, int base, String type){
   val = new int [] {height, base};
   this.type = type;
   System.out.println("A "+this.type+" has been created with height: "+height+" and base: "+base);
   }
 public Shape2D (int side1, int side2, int side3){
   val = new int [] {side1, side2, side3};
   System.out.printf("A Triangle has been created with the following sides: %d, %d, %d\n", side1, side2, side3);
   }
 public void area(){
   if (val.length==3) {
     double s = (val[0]+val[1]+val[2])/2;
     area = Math.sqrt(s*(s-val[0])*(s-val[1])*(s-val[2]));
     System.out.printf("The area of the Triangle is: %.2f\n", area);
   }
   else if (val.length==2 && type!=null) {
     area = (1/2)*val[0]*val[1];
     System.out.println("The area of the "+type+" is: "+area);
   }
   else if (val.length==2 && type == null) {
     area = val[0]*val[1];
     System.out.println("The area of the Rectangle is: "+area);
   }
   else {
     area = Math.pow(val[0], 2);
     System.out.println("The area of the Square is: "+area);
   }
 }
 
}

//task5

public class Book {
  public String title;
  public String author;
  public int price; 
  
    public Book(String title){
      this.title = title;
    }
    public Book(String title, String author){
      this.title = title; 
      this.author = author;
    }
    public Book(String title, String author, int price){
      this.title = title;
      this.price = price;
      this.author = author;
    }
    public void setDetails (int price) {
      this.price = price;
    }
    public void setDetails (String author, int price) {
      this.price = price;
      this.author = author;
    }
    public void displayDetails(){
      if (price==0 && author==null){
        System.out.println("Title: "+title);
      }
      else if (author==null) {
        System.out.println("Title: "+title+", Price: "+price);
      }
      else if (price==0){
        System.out.println("Title: "+title+", Author: "+author);
      }
      else {
        System.out.println("Title: "+title+", Author: "+author+", Price: "+price);
      }
    }
    
  
  
  
}


//task6

public class Product {
  private int quantity;
  private double price;
  private String name;
  
  public Product() {
  }
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  public int getQuantity() {
    return quantity;
  }
  public double getPrice(){
    return price;
  }
  public void displayInfo(){
    if (name==null) {
      System.out.println("Product Name: Unknown \nPrice: $0.0");
    }
    else {
      System.out.println("Product Name: "+name+" \nPrice: $"+price);
    }
  }
  public void displayInfo(boolean x){
    if (x==true){
      System.out.printf("Product Name: %s\nPrice: $%.1f\nQuantity: %d\n",name,price,quantity);
    }
  }
  
}

//task7

public class Student{
  private int id;
  private double cgpa;
  private String course [];
  
  public Student(int id) {
    this.id = id;
  }
  public Student(int id, double cgpa) {
    this.id = id;
    setCG(cgpa);
  }
  public void setID(int id){
    this.id=id;
  }
  public void setCG(double cg){
    cgpa=cg;
    if (cgpa>0.0 && cgpa<3.0){
    course= new String[3];}
    else if (cgpa>=3.0){course=new String[4];}
  }
  public void addCourse(String course){
    if (cgpa>0.0 && cgpa<3.0){
      for (int i =0; i<3; i++){
        if (this.course[i]==null){
          this.course[i]= course;
          break;
        }
        if (i==2 && this.course[2]!=null) {
          System.out.printf("Failed to add %s \nCG is low. Can't add more than 3 courses.\n",course);
        }}
    }
      else if (cgpa>=3.0){
        for (int i =0; i<4; i++){
          if (this.course[i]==null){
            this.course[i]= course;
            break;
          }
          if (i==3 && this.course[3]!=null) {
            System.out.printf("Failed to add %s\nMaximum 4 courses allowed.\n",course);
          }
        }
      }
      else {System.out.println("Failed to add "+course+"\nSet CG first");}
    }
    public void showAdvisee(){
      if (course[0]!=null){
        System.out.println("Student ID: "+id+", CGPA: "+cgpa);
      System.out.println("Added courses are:");
      for (int i =0;i<course.length;i++){
        if (course[i]!=null){
          System.out.print(course[i]+" ");
        }
      }
              System.out.println();
      }
    else{
      System.out.println("Student ID: "+id+", CGPA: "+cgpa);
      System.out.println("No courses added.");
    }}
    public void rmAllCourse(){
      course = new String [course.length];
    }
    public void addCourse(String [] course) {
      if (course.length==this.course.length){
        this.course = course;
      }
      else if (course.length>this.course.length){
        if (this.course.length==4){
          System.out.printf("Failed to add %s\nMaximum 4 courses allowed.",course[this.course.length]);
          }
        for (int i=0; i<this.course.length;i++){
          this.course[i]=course[i];
          
        }
        System.out.println();
      }
    }
  
  
}

//task8

public class ABCServer{
  public String serverName="Default";
  public int capacity = 10;
  public int members =0;
  public String [] name;
  public String [] designation;
  
  public ABCServer(){
    name = new String [capacity];
    designation = new String [capacity];
  }
  public ABCServer(String x, int y){
    serverName=x;
    capacity =y;
    name = new String [capacity];
    designation = new String [capacity];
  }
  
  public  void addMembers(String x) {
    if (members<capacity){
      name[members]=x;
      designation[members++]="Rising Hero";
      System.out.println("Rising Hero is added");      
    }
    else {
      System.out.println("Sorry, maximum capacity exceeded!");
    }  
  }
  public void addMembers(String x, String y) {
    if (members<capacity){
      name[members]=x;
      designation[members++]=y;
      System.out.println(y+" is added");      
    }
    else {
      System.out.println("Sorry, maximum capacity exceeded!");
    }  
  }  
  public void details(){
    if (members==0){
      System.out.println("Server Name: "+serverName+"\nMember Capacity: "+capacity+"\nTotal Members: 0\nMembers:");
    }
    else {
      System.out.println("Server Name: "+serverName+"\nMember Capacity: "+capacity+"\nTotal Members: "+members+"\nMembers:");
      for (int i=0; i<members; i++){
        System.out.println("Name:Role --> "+name[i]+":"+designation[i]);
      }
    }
  }
  
 }


```
