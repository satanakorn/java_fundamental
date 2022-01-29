import java.util.Scanner;

public class circle {
  public static Double PI = 3.14;
  //method main for call getvalue() 
  public static void main (String []args){
    System.out.println("----------welcome to calculatoe circle area----------");
    getvalue();
  }

  public static Double area(Double r){
    return PI * r *r;
  }
//method for calculate circumference
  public static Double circumference(Double r){
    return 2 * PI * r;
  }

//method calculate surface
  public static Double surface(Double r){
    return 4 * PI *r *r ;
  }

//method get value and display
  public static void getvalue(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius : ");
    Double r = sc.nextDouble();

    System.out.println("circle area = "+ area(r));
    System.out.println("circumference area = "+ circumference(r));
    System.out.println("surface area = "+ surface(r));

  }
}