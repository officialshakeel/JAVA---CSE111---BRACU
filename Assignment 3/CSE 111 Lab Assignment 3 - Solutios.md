```java


//TASK1 (Finding Palindrome)
import java.util.Scanner;
public class task1{
  public static void main(String[]args){
    Scanner task1 = new Scanner (System.in);
    String user = task1.nextLine();
    String user1 = "";
    int length = user.length()-1;
    for (int var=0; var<user.length();var++){
      user1+=(user.charAt(length));
      length-=1;
    }
    if (user.equalsIgnoreCase(user1)){System.out.println("Palindrome");}
    else {System.out.println("Not a palindrome");}
  }
}

//task2 

import java.util.Scanner;
public class task2{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    String user = sc.nextLine();
    String reversed= "";
    for (int i=0; i<user.length(); i++){
      if (user.charAt(i)>='a' && user.charAt(i)<='z'){
        if (user.codePointAt(i)==97){reversed+=(char)((user.codePointAt(i))+25);}
            else if (user.codePointAt(i)==122){reversed+=(char)((user.codePointAt(i))-25);}
            else {reversed+=(char)((user.codePointAt(i))-1);}
      }
    } System.out.println(reversed);
  }
}

//task 3

import java.util.Scanner;
public class task3{
  public static void main(String[]args){
    Scanner task3= new Scanner (System.in);
    String inp = task3.nextLine();
    int count= 0;
    int count1=0;
   
    for (int i=0; i<inp.length();i++){
      System.out.println("");
      count+=1;
      for (int j=0; j<count+1;j++){
        if (j==count){count1=0; break;}
        else{System.out.print(inp.charAt(count1));
          count1+=1;}
      
      }
        
    }
  }}

//task4

import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean flag = true;

        while (flag) {
            String name = sc.nextLine();
            char arr[] = new char [name.length()];
            
             for (int i=0; i<name.length(); i++){
             arr[i]=name.charAt(i);} 
            
            Arrays.sort(arr);
            int count = 1;
            int duplicate = 1;

            for (int i = 0; i < name.length() - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;} 
                else {
                 if (count > 1) {System.out.printf("%n'%s' has been counted %d times in the word \"%s\".", arr[i], count, name); duplicate++;}
                    count = 1;}}

            if (count > 1) {System.out.printf("%n'%s' has been counted %d times in the word \"%s\".", arr[name.length() - 1], count, name);duplicate++;}

            if (duplicate > 1) {System.out.println("\nPlease enter another name:");} 
            else {System.out.printf("You entered %s.",name);flag = false;}
        }
    }
}


//task5

  import java.util.*;
  public class task5{
    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    String frst = sc.nextLine();
    String lst = sc.nextLine();
    String newstring= frst+lst;
    int sum = 0;
    
    for (int i=0; i<newstring.length(); i++){
      if (newstring.charAt(i)>='a' && newstring.charAt(i)<='z'|| newstring.charAt(i)>='A' && newstring.charAt(i)<='Z'){
      sum+=(int)(newstring.charAt(i));
      }
      else{continue;}
        
    }
    System.out.println(frst+" "+lst);
    System.out.println(sum);
    }
  }

//task6

import java.util.*;
public class task6{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    String user = sc.nextLine();
    String user1 ="";
    for (int i=0; i<user.length() ; i++){
      if (i ==0){user1+=user.charAt(i);}
      else if (user.charAt(i)!=user.charAt(i-1)){user1+=user.charAt(i);}
      else {continue;}
    }
    System.out.println(user1);
  }
}



//ARRAY


//task1

import java.util.Arrays;
import java.util.Scanner;
public class task1{
  public static void main (String []args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("N = ");
  int N = sc.nextInt();
  int [] arr = new int [N];
  int [] arr1 = new int [N-1];
  int count =0;
  
  
  for (int i=0; i<N; i++){
   int num = sc.nextInt();
   arr[i]= num;}
 
  System.out.printf("Input Array: %s%n", Arrays.toString(arr));
  System.out.println("Remove Element = ");
  int remove = sc.nextInt();
  
   for (int i=0; i<N; i++){
   if (arr[i]==remove){count+=1;}}
 
  int arr1_index=0;
  int arr_index=0;
  if (count>0){for (int i =0; i<N; i++){
    if (arr[i]!=remove){arr1[arr1_index]=arr[arr_index]; arr1_index+=1; arr_index+=1;}
    else{arr_index+=1;}}}
  if (count>0){System.out.printf("New Array: %s%n", Arrays.toString(arr1));}
  else {System.out.println("Element not found");}
  
}
  }


//task2

import java.util.*;
public class task2{
  public static void main(String args[]){
  Scanner sc = new Scanner (System.in);
  System.out.println("Array length = ");
  int len = sc.nextInt();
  int arr [] = new int [len];
  int i = 0;
    System.out.printf("Enter %d numbers", len);
    while(i<len){int num = sc.nextInt(); arr[i]=num;i++;}
    i = 0;
    int max = arr[i];
    int min = arr[i];
    int maxloc = 0;
    int minloc = 0;
    for (i=1;i<arr.length;i++){
      if (max<arr[i]){max=arr[i];}
      else if (min>arr[i]){min=arr[i];}
        if (i==arr.length-1){
          for(int j=0; j<arr.length;j++){
            if(arr[j]==max){maxloc=j;}
            else if (arr[j]==min){minloc=j;}} }}

System.out.printf("The largest number %d was found at location %d.%n", max,maxloc);
System.out.printf("The smallest number %d was found at location %d.%n", min,minloc);}}
    
    

//task3

import java.util.*;
public class task3{
  public static void main(String args[]){
  Scanner sc = new Scanner (System.in);
  
  System.out.println("Enter the length of the array:  ");
  
  int len = sc.nextInt();
  int arr [] = new int [len];
  int reverse_index=len-1;
  
  for (int i =0; i<len; i++){
    int num = sc.nextInt();
    arr[i]=num;
    if (i==len-1){for (int j=0; j<arr.length; j++){
      System.out.print(arr[reverse_index]+" ");
    reverse_index-=1;}}}
  }
}

//task4

import java.util.Arrays;
import java.util.Scanner;
public class task4{
  public static void main (String []args){
  Scanner sc = new Scanner(System.in);
  System.out.println("N = ");
  int len = sc.nextInt(); //Taking length for loop
  
  int arr [] = new int [len];
  for (int i=0; i<len ; i++){
  int num = sc.nextInt();
  arr[i]=num;
  }
  
  int count = 0;
  if (len%2!=0){
  for (int i=0; i<(len/2)+1; i++){
    for (int j=0; j<len; j++){
    if (arr[i]==arr[j]){count+=1;}
    if (j==len-1){System.out.printf("%d - %d times%n",arr[i], count);count=0;}}}}
  
  
  else {
  for (int i=0; i<(len/2); i++){
    for (int j=0; j<len; j++){
    if (arr[i]==arr[j]){count+=1;}
    if (j==len-1){System.out.printf("%d - %d times%n",arr[i], count);count=0;}
    }}
  for (int j=len-1 ; j>(len/2);j--){
    int count2 = 1;
    for (int i=0; i<len; i++){
      if (arr[j]==arr[i]){count2+=1;}
      if (i==(len/2)-1){if (count2==1){System.out.printf("%d - %d times%n",arr[j], count2);}
      }}}}}}

//task5

import java.util.*;
public class task5{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    
    int count = 0;
    int checkpoint =0;
    
    System.out.println("N");
    int N = sc.nextInt();
    
    int arr[]= new int[N];
    System.out.print("Please enter the elements of the array:");
    
    for (int i=0; i<N; i++){
    int num = sc.nextInt();
    arr[i]=num;
    if (i>0){if (arr[i-1]==num){count+=1;}}}
    
    int new_arr[]= new int [N-count];
    
    new_arr[checkpoint]=arr[0];
    
    for (int i=1; i<N; i++){
      if (new_arr[checkpoint]!=arr[i]){new_arr[checkpoint+1]=arr[i]; checkpoint++;}
      else {continue;}}
    
    System.out.printf("New Array: %s", Arrays.toString(new_arr));
    System.out.printf("%nRemoved elements : %d", count);

}}


//task6

import java.util.Arrays;
import java.util.Scanner;
public class task12{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Length = ");
    int len = sc.nextInt();
    
    int arr [] = new int [len];
    
    for (int i=0;i<len;i++){
    int num = sc.nextInt();
    arr[i]=num;
    }
    Arrays.sort(arr);
    if (len%2!=0){System.out.printf("The median is %d", (arr[(len/2)]));}
    else {System.out.printf("The median is %d", ((arr[len/2]+arr[(len/2)-1]))/2);}


}}
      
```



