package helloworld;
import java.util.*;
public class abhishek {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
 System.out.println("It's a simple calculator ");
 double a=s.nextDouble();
 double b=s.nextDouble();
 String operation=s.next();
 if(operation.equals("+"))
 {
 System.out.println(a+b);
 }
 else if(operation.equals("-"))
 {
 System.out.println(a-b);
 }
 else if(operation.equals("*"))
 {
 System.out.println(a*b);
 }
 else if(operation.equals("/"))
 {
 System.out.println(a/b);
 }
 else
 {
 System.out.println("Question is wrong");
 }
}
}
