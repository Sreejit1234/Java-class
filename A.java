import java.util.*;
class A{
  void m(){System.out.println("Hello m");}
  void n(){
    this.m();
    System.out.println("Hello n");

}
}
class testthis
{
  public static void main(String args[]){
  A a= new A();
  a.n();
  }
}
