import java.util.*;
class primenumber
{
public static void main(String args [])

{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println(" enter a number to check wheather it is prime or not ");
int a=sc.nextInt();



for(int i=1;i<a;++i)
{

if(a%i==0)
count++;
}
if(count==2)
{
System.out.println("it is a prime");
}
else
{
System.out.println("it is a non prime");



}
}
}