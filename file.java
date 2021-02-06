import java.util.Scanner;//import java.util.*;
class Sum
{
  int sum1;
  int sum(int a,int b)
  {
    sum1 = a+b;
    return (a+b);
  }
}
class Abcd
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str;char g;
    int m,n;
    m = 10;
    n = 20;
    Sum ob = new Sum();
    int sum = ob.sum(m,n);
    ob.sum1 = ob.sum(m,n);
    System.out.println("Sum:- "+sum);
    System.out.println("Enter name and gender:- ");
    str = sc.nextLine();
    g = sc.next().charAt(0);
    System.out.println("Name:- "+str);
    System.out.println("Gender:- "+g);
    g = str.charAt(2);

  }
}
