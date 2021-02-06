import java.util.Scanner;//import java.util.*;
public class Abcd
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str;char g;
    System.out.println("Enter name and gender:- ");
    str = sc.nextLine();
    g = sc.next().charAt(4);
    System.out.println("Name:- "+str);
    System.out.println("Gender:- "+g);
    g = str.charAt(2);

  }
}
