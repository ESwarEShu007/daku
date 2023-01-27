import java.util.*;
class palindrome
{
public static void main(String args [])

{
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println(" enter a number to check wheather it is palindrome  or not ");
int a=sc.nextInt();
int palindrome=a;



while(a>0)
{
int r=a%10;
sum=(sum*10)+r;
System.out.println(sum);
a=a/10;
}
if(palindrome==sum)
{
System.out.println("it is a palindrome number");
}
else
{
System.out.println("it is a non palindrome number");


}
}
}