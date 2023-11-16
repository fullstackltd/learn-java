import java.util.Scanner;

import lib.MathUtils;
import lib.Person;

public class Application {

  public static void show(String msg){
    System.out.println(msg);
  }
  public static void main(String[] args) {
    
    // Scanner scanner = new Scanner(System.in);

    Person naim = null; 
    naim = new Person(1, "Abu Naim", 30, "M");

    System.out.println(naim);

    // Person fatema = new Person();
    // fatema.setName("Fatema Jahra");
    // System.out.println(naim.getName());

    // System.out.println("Enter whole number for a: ");
    // int a = scanner.nextInt();

    // System.out.println("Enter whole number for b: ");
    // int b = scanner.nextInt();

    // if (a == b){
    //   System.out.println("eaual");
    // }else{
    //   System.out.println("Not equal");
    // }
  }
}
