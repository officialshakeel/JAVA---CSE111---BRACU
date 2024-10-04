
//task1

public class Course
{
  public String cName;
  public String code;
  public int credit;


public void createCourse(String cName, String code, int credit)
{
  this.cName = cName;
  this.code = code;
  this.credit = credit;
}

public void updateCourse(String cName, String code, int credit)
{
  this.cName = cName;
  this.code = code;
  this.credit = credit;
}

public void displayCourse()
{
  System.out.printf("Course Name: %s%nCourse Code: %s%nCourse Credit: %d%n", cName, code, credit);
}
}

//task2

public class Dog {
    public String name;
    public String color;
    
    public void changeName(String name)
    {
      this.name = name;
    }
    
    public void changeColor (String color)
    {
      this.color = color;
      
      if (name!=null)
      {
        System.out.println ( name + " is " + color );
      }
      else
      {
        System.out.println ( "This dog is "+ color); 
      }
       
    }
    
    public String bark ()
    {
      if (name !=null && color == null)
      {
        return name+" is barking";        
      }
      
      else if (name !=null && color != null)
      {
        return name + " the " + color + " dog is barking";
      }
      
      else if (name == null && color!= null)
      {
        return color + " dog is barking";
      }
      else
      {
        return "A dog is barking";
      }
      }
    
    }
    

//task3

public class Employee 
{
  public String Name;
  public double Salary = 30000.0;
  public String Designation = "junior";
  
  public void newEmployee (String Name)
  {
    this.Name = Name;    
  }
   public void displayInfo()
   {
     System.out.printf("Employee Name: %s%nEmployee Salary: %.1f Tk%nEmployee Designation: %s%n", Name,Salary,Designation);     
   }
   
   public void calculateTax()
   {
     if (Salary>50000.0)
     {
       System.out.printf( "%s Tax Amount: %.2f Tk%n", Name, Salary*(30/(double)100));       
     }
     
     else if (Salary>30000.0)
     {
      System.out.printf( "%s Tax Amount: %.2f Tk%n", Name, Salary*(10/(double)100));       
     }
     
     else
     {
       System.out.println("No need to pay tax");
     }
       
   }
   
   public void promoteEmployee(String Designation)
   {
     if (Designation == "senior")
     {
       Salary+=25000;
       this.Designation = Designation;
       System.out.println(Name+" has been promoted to senior");
       System.out.printf("New Salary: %.2f% Tk%n", Salary);
     }
     
     else if (Designation == "lead")
     {
       Salary+= 50000;
       this.Designation = Designation;
       System.out.println(Name+" has been promoted to lead");
       System.out.printf("New Salary: %.2f Tk%n", Salary);
     }
     if (Designation == "manager")
     {
       Salary+=75000;
       this.Designation = Designation;
       System.out.println(Name+" has been promoted to manager");
       System.out.printf("New Salary: %.2f Tk%n", Salary);
     }
     
   }
   
}

//task4

public class MoneyTracker
{
  public String Name;
  public double Balance;
  public double added;
  public double spent;
  
  public String info()
  {
    return "Name: " + Name +"\nCurrent Balance: " + Balance;
  }
  
  public void createTracker(String Name)
  {
    this.Name = Name;
    Balance += 1.0;
  }
  
  public void income(int Balance)
  {
    this.Balance+=Balance; 
    added=Balance;
    System.out.println("Balance Updated!");
  }
  
  public void expense (int price)
  {
    if (Balance-price==0)
    {
      Balance-=price;
      spent=price-1;
      System.out.println("You're broke!");
    }
    else if (Balance>price)
    {
      Balance-=price;
      spent=price;
      System.out.println("Balance Updated.");
    }
    else if (Balance<price)
    {
      System.out.println("Not enough Balance.");
    }
  }
  
  public void showHistory()
  {
    System.out.println("Last added: "+ added);
    System.out.println("Last spent: "+ spent);
  }
  
  
  
}

//task5

public class MagicItem
{
  public String name;
  public int level;
  public String item1;
  public String item2;
  public String item3;
  public int count;
  
  public void newCharacter(String name)
  {
    this.name = name;
  }
  
  public void displayInfo()
  {
    System.out.printf("Character Name: %s%nEnergy Level: %d%nItem 1: %s%nItem 2: %s%nItem 3: %s%n", name, level, item1, item2, item3);    
  }
  
  public void findItem (String item) 
  {
    if (item1==null)
    {
      item1=item;
      
      System.out.println( name+" found a "+item);
    }
    else if (item2==null)
    {
      item2=item;
      
      System.out.println(name+" found a "+item);
    }
    else if (item3==null)
    {
      item3=item;
        
      System.out.println(name+" found a "+item);
    }
    else 
    {
      System.out.println("All item slots occupied.");
    }}
    
    public void useItem(String use)
    {
      if (item1==use || item2==use || item3==use)
      {
             if (use=="Potion")
      {
        if (item1==use)
      { level+=50;
        item1=null;
        System.out.println (name+" used a Potion");
        System.out.println ("Energy Level after using item: "+ level);
        }
      else if (item2==use)
      {
        level+=50;
        item2=null;
        System.out.println (name+" used a Potion");
        System.out.println ("Energy Level after using item: "+ level);
        }
      else if (item3==use)
      {
        level+=50;
        item3=null;
        System.out.println (name+" used a Potion");
        System.out.println ("Energy Level after using item: "+ level);
        }
      }
      
      else if (use=="Amulet")
      {
        if (item1==use)
      {
        level+=150;
        item1=null;
        System.out.println (name+" used a Amulet");
        System.out.println ("Energy Level after using item: "+ level);
        }
      else if (item2==use)
      {
        level+=150;
        item2=null;
        System.out.println (name+" used a Amulet");
        System.out.println ("Energy Level after using item: "+ level);
        }
      else if (item3==use)
      {
        level+=150;
        item3=null;
        System.out.println (name+" used a Amulet");
        System.out.println ("Energy Level after using item: "+ level);
        }
      }
      
      else if (use=="Elixir")
      {
        if (item1==use)
      { level+=100;
        item1=null;
        System.out.println (name+" used a Elixir");
        System.out.println ("Energy Level after using item: "+ level);
        }
      else if (item2==use)
      {
        level+=100;
        item2=null;
        System.out.println (name+" used a Elixir");
        System.out.println ("Energy Level after using item: "+ level);
        }
      else if (item3==use)
      {
        level+=100;
        item3=null;
        System.out.println (name+" used a Elixir");
        System.out.println ("Energy Level after using item: "+ level);
        }
      }
      }
      
      else 
      {
        System.out.println("Item not in inventory");
      }
    }
  }

//task6

public class Cart 
{
  public String [] item = new String [3];
  public double [] price = new double [3];
  public int count;
  public int cart_no;
  public int discount;
  public double sum;
  
  public void create_cart(int num)
  {
    cart_no=num;    
  }
  
  public void addItem ( String item, double price)
  {
    if (count<3)
    {
      this.item[count] = item;
      this.price[count] = price;
      
      count+=1;
      
      System.out.println(item+" added to cart "+cart_no+".");
      System.out.println("You have "+count+" item(s) in your cart now.");
    }
    
    else if (count==3)
    {
      System.out.println ("You already have 3 items on your cart");
    }
  }
  
  public void giveDiscount (int discount)
  {
    this.discount = discount;
  }
  
  public void cartDetails()
  {
    sum=0.0;
    System.out.printf("%nYour cart c(%d) :%n",cart_no);
    
    for (int i =0; i<3; i++)
    {
      if (item[i]!=null)
      {
        System.out.println (item[i]+" - "+price[i]);
        sum+=price[i];
      }
      else 
      {
        continue;
      }
    }
    
    System.out.println("Discount Applied: "+(double)discount+"%");
    if (discount!=0)
    {
      sum -= sum*(discount/100.0);
      System.out.println("Total price: "+sum);
    }
    else
    {
      System.out.println("Total price: "+sum);
    }
  }
}

//task7

public class Reader 
{
  public String name;
  public int capacity;
  public String books [] = new String [capacity];
  public int count;
  public String newBooks[];
  
  public void createReader(String name, int capacity)
  {
    this.name = name;
    this.capacity = capacity;
    this.books = new String [capacity];
  }
  
  public void addBook(String books)
  {
    if (this.books[(this.books.length)-1]!=null)
    {
     System.out.println("No more space for new book");
    }
    else
    {
     for (int i =0; i<this.books.length; i++)
      if (this.books[i]==null)
      {
       this.books[i]=books;
       break;
      }
      else
      {
       continue;
      }
    }
  }
  
  public void readerInfo()
  {
    count =0;
    System.out.println ("Name: "+ name);
    System.out.println("Capacity: "+capacity);
    System.out.println("Books: ");
    for (int i = 0; i<books.length; i++)
      {
        if (books[i]!=null)
        {
          System.out.println("Book "+(++count)+":"+books[i]);
        }
      }
    if (count==0)
    {
      System.out.println("No books added yet");
    }
  }
  
  public void increaseCapacity(int capacity)
  {
    count =0;
    this.capacity=capacity;
    String newBooks[] = new String [capacity];
    
   for (int i=0; i<capacity; i++)
   {
     if (count<books.length)
     {
       if (books[count]!=null)
       {
         newBooks[i]=books[count++];
       }
     }
     else
     {
       break;
     }
   }
   books = newBooks;
    System.out.println(name+"'s capacity increased to "+capacity);
  }
}

//task8

public class UberApp
{
  public String name, number;
  public int age, count;
  public double distance, fare;
  public String location [] = new String [3];
  
public void createProfile(String name, int age, String number)
{
  this.name = name;
  this.age = age;
  this.number = number;
  this.count=3;
}

public void showProfile()
{
  System.out.printf("Hello! This is your Profile:%nFull Name: %s%nAge: %d%nPhone Number: %s%n",name,age,number);
}

public int remainingRides() 
{
  return count;
}

public void bookRide(String location, double distance)
{
  if (count==0)
  {
    System.out.println(name+", please update your plan to premium or wait till next month!");
  }
  else 
  {
    for (int i=0; i<count; i++)
    {
      if (this.location[i]==null)
      {
        this.location[i]= location;
        count-=1;
        break;
      }
    }
    fare=30*distance;
    System.out.println(name+" has booked a ride!\nDestination: "+location+"\nFare: "+fare+" Taka");
  }}
  
public void changeLocation(String location, double distance)
{
  if (count==2)
  {
    this.location[0]=location;
  }
  
  else if (count==1)
  {
    this.location[1]=location;
  }
  else if (count==0)
  {
    this.location[2] = location; 
  }
  fare=((30*distance)+(distance*30)*(20/100.0));
    System.out.println(name+" has changed the destination of his current ride to "+location+"\nNew fare after adding 20% change fees: "+fare+" Taka");
  }
public void ridingHistory()
{
  if (count==0)
  {
    System.out.println(name+", you have visited "+location[count]+", "+location[count+1]+", "+location[count+2]+" this month.");
  }
  else if (count==1)
  {
    System.out.println(name+", you have visited "+location[count*0]+", "+location[count]+" this month.");
  }
  else if (count==2)
  {
    System.out.println(name+", you have visited "+location[count]+" this month.");
  }
  else if (count==3)
  {
    System.out.println(name+", you haven't visited anywhere this month.");
  }
}

public void resetMonth()
{
  count=3;
  String location [] = new String [count];
}
}
