package lib;

public class Operators {

  public static void main(String[] args) {
    /* Arithmatic Operator
      +, -, *, /, %, ++, --
     */
    int a = 5;
    int b = 3;

    // int result = a + b;
    // int result = a - b;
    // int result = a % b;
    // a += b++;
    // boolean yn = true
    // yn = (a >= 4);
    // System.out.println(yn);
    // c1 : c2 : c1 && c2 : c1 || c2
    // 0    0       0         0
    // 0    1       0         1
    // 1    0       0         1
    // 1    1       1         1
    //

    if ( (a > b) || (a == 4) ){
      System.out.println("Ok");
    }else{
      System.out.println("not ok");
    }

  }

}
