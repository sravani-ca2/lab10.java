import java.util.*;
class Demo
{
static int a=10;
static
{
System.out.println("static block");
}
Demo()
{
a++;
}
static void display()
{
System.out.println("static method");
System.out.println(a);
}
}
class staticDemo
{
public static void main(String args[])
{
//System.out.println(Demo.a);
Demo ob1=new Demo();
//System.out.println("main method");
//System.out.println(Demo.a);
Demo ob2=new Demo();
Demo ob3=new Demo();
Demo ob4=new Demo();
Demo display();
}
}
 