```java
////Task1A
import java.util.*;
public class tsk1{
public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
    int strt = 2;
    while (strt<=50){
      if (strt==50){
        System.out.print(strt);}
      else{
        System.out.print(strt+" ,");}
      strt+=4;
    }
    
}
}

// Task1b
import java.util.*;
public class tsk1{
public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  int strt =1;
  int count =1;
  while (strt<=120){
    if (strt==120){
    System.out.print(strt);}
    else {System.out.print(strt+" ,");}
    count+=1;
    strt+=count;
  }
}}

//task2
import java.util.*;
public class tsk2{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
for (int s= 2; s<=20; s+=2 ){
  if (s==20){
    System.out.print(s+" ,");
    for (int j=20; j>=2; j-=2){
      if (j==20){
        continue;}
      else if (j==2){
        System.out.print(j);}
      else{
        System.out.print(j+" ,");}}}
  else{System.out.print(s+" ,");}
  }
}
}

//task3
import java.util.*;
public class tsk3{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int sum = 0;
    int min = 0;
    int max = 0;
    double count =0;
    
    for (int var=1; var<=10 ; var++){
      int strt= sc.nextInt();
      sum+=strt;
      count+=1;
      if (var>1){
        if (max<strt){
          max=strt;
        }
        else if (min>strt){
          min = strt;
        }
      }
      else{max=strt; min = strt;}
    }
    System.out.println("Sum = "+ sum) ;
      System.out.println("Minimum = " + min);
        System.out.println("Maximum = "+ max) ;
        System.out.println("Average = "+ (sum/count));
 }
}

//task4
import java.util.*;
public class tsk4{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int sum = 0;
    int min = 0;
    int max = 0;
    double odd =0;
    
    for (int var=1; var<=10 ; var++){
      int strt= sc.nextInt();
      if (strt%2!=0 && strt>0){
        odd+=1;
         sum+=strt;
         if (odd>1){
        if (max<strt){
          max=strt;
        }
        else if (min>strt){
          min = strt;
        }
      }
         else if (odd==1){max=strt; min = strt;}}
    else {continue;}}

    
    if (odd>0){System.out.println("Sum = "+ sum) ;
      System.out.println("Minimum = " + min);
        System.out.println("Maximum = "+ max) ;
        System.out.println("Average = "+ (sum/odd));}
    else {System.out.println("No odd positive numbers found");}

}
}

//task5
import java.util.*;
public class tsk5{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int sum = 0;
    int min = 0;
    int max = 0;
    double count =0;
    int zero =0;
    
    while(true){
      int strt= sc.nextInt();
      if (strt==0 && zero!=2){zero+=1; continue;}
      else{
      if (zero!=3 && strt!=0){
      zero=0;
      count+=1;
      sum+=strt;
      if (count>1){
        if (max<strt){
          max=strt;
        }
        else if (min>strt){
          min = strt;
        }
      }
      else{max=strt; min = strt;}
      }
      else{ break;}}}
        
    if (sum>0){
      System.out.printf("Sum = %d%nMinimum = %d%nMaximum = %d%nAverage = %f",sum, min, max,(sum/count));}
    else {System.out.print("No numbers found");}
 }
}

//task6
import java.util.*;
public class tsk6{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int weight = 0;
    double nw =0;
    int count1 =1;
    int count2 =1;
    
    for (int s=1; s<=5; s++){
      System.out.println("num"+count1+" = ");
      double num1= sc.nextDouble();
      System.out.println("weight"+count2+" = ");
      int weight1= sc.nextInt();
      weight+=weight1;
      nw+=(num1*weight1);
      count1+=1;
      count2+=1;
      
    }
    System.out.println("Weighted Average = "+ nw/weight);
  }
}

//task7

//part a
import java.util.*;
public class tsk7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int initial = 1;
        int store = 0;

        for (int val = 1; val <= num; val++) {
            if (initial == 1) {
                System.out.print(initial+" ");
                store += initial;
                initial+=store;
                continue;
            }else if (store==1){
              System.out.print(store+" ");
              System.out.print(initial+" ");
              store+=initial;
              continue;
         }else if (store>initial && store < num) {
                System.out.print(store+" ");
                initial += store;
                continue;
            } else if (initial>store && initial < num) {
                System.out.print(initial+" ");
                store += initial;
                continue;
            }
        }
    }
}


//part-b
import java.util.*;
public class tsk7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int initial = 1;
        int store = 0;
        int sum=0;

        for (int val = 1; val <= num; val++) {
            if (initial == 1) {
                System.out.print(initial+" ");
                sum+=initial;
                store += initial;
                initial+=store;
                continue;
            }else if (store==1){
              System.out.print(store+" ");
               sum+=store;
              System.out.print(initial+" ");
               sum+=initial;
              store+=initial;
              continue;
         }else if (store>initial && store < num) {
                System.out.print(store+" ");
                 sum+=store;
                initial += store;
                continue;
            } else if (initial>store && initial < num) {
                System.out.print(initial+" ");
                 sum+=initial;
                store += initial;
                continue;
            }
            else if (val==num){
              System.out.print("\nSum = "+ sum);}
        }
    }
}




//task8

import java.util.*;
public class tsk8{
  public static void main (String[]args){
    Scanner tsk8 = new Scanner(System.in);
    int first = tsk8.nextInt();
    int last = tsk8.nextInt();
    int count = 2;
    int compare =0;
    int prime1 =0;
    
    if (first<last){
     for (int num=first; num<=last; num++){
      for ( int var =1; var <= num; var++){
        if (num%var==0){compare+=1;}
        if (var==num){
          if (compare>count){compare=0;}
          else{prime1+=1; compare=0;}}}}
     System.out.printf("There are %d prime numbers between %d and %d.",prime1,first,last );}
    else{for (int num=last; num<=first; num++){
      for ( int var =1; var <= num; var++){
        if (num%var==0){compare+=1;}
        if (var==num){
          if (compare>count){compare=0;}
          else{prime1+=1; compare=0;}
        }
      }
    }System.out.printf("There are %d prime numbers between %d and %d.",prime1,last,first );}
  }
}

//task9 

import java.util.*;
public class tsk9{
  public static void main(String[]args){
    Scanner tsk9 = new Scanner (System.in);
    int num = tsk9.nextInt();
    int sum = 0;
    for (int var = 0; var <=num; var++){
    num/=10;
    sum+=1;}
    System.out.print(sum+" digits");
  }
}


//TASK9A ALTERNATIVE_WAY



import java.util.*;
public class tsk9{
  public static void main (String[]args){
    Scanner tsk9 = new Scanner (System.in);
    int input = tsk9.nextInt();
    int sum = 0;
    for (int count = 1; count <= Integer.toString(input).length(); count++ ){
      sum+=1;
    }
    System.out.print(sum+" digits");
  }
}

//TASK9B

import java.util.*;
public class tsk9{
  public static void main(String[]args){
    Scanner tsk9 = new Scanner (System.in);
    int num = tsk9.nextInt();
    int sum = 0;
    for (int var = 0; var <=num; var++){
    int length = (Integer.toString(num).length())-1;
    double power = Math.pow(10, length);
    int len = (int) Math.round(power);
    sum=(num/len)*7;
        System.out.print(sum+ " ");
            num=num%(len);
    sum=0;}
  }
}

//task10
import java.util.*;
public class tsk10{
  public static void main (String[]args){
    Scanner tsk10 = new Scanner(System.in);
    int user = tsk10.nextInt();
    int five00 =0;
    int hundred = 0;
    int fifty =0;
    int ten =0;
    int one=0;
    
    while (user>=500){user-=500; five00+=1;}
    while (user>=100){user-=100; hundred+=1;}
    while (user>=50){user-=50; fifty+=1;}
    while (user>=10){user-=10; ten+=1;}
    while (user>=1){user-=1; one+=1;}

    if (five00>0){System.out.printf("%d 500's note",five00);}
    if (hundred>0){System.out.printf("%n%d 100's note",hundred);}
    if (fifty>0){System.out.printf("%n%d 50's note",fifty);}
    if (ten>0){System.out.printf("%n%d 10's note",ten);}
    if (one>0){System.out.printf("%n%d 1's note",one);}
   
  }
}

//task11-a

import java.util.*;
public class tsk11{
  public static void main (String[]args){
    Scanner tsk11 = new Scanner (System.in);
    
    int user =nextInt();
    
    for (int count=1; count<= user; count++){
      System.out.println();
        for (int count1=1; count1<=user; count1++){
        System.out.print("*");
      }
    }
  }
}

//task11-b
import java.util.*;
public class tsk11{
  public static void main (String[]args){
    Scanner tsk11 = new Scanner (System.in);
    
    int user =tsk11.nextInt();
    int user1=0;
    
    for (int count=1; count<= user; count++){
      System.out.println();
      user1+=1;
        for (int count1=1; count1<=user1; count1++){
        System.out.print("*");
      }
    }
  }
}

















```
