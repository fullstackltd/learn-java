public class Application {

  public static void main(String[] args) {

    int arr[] = { 10, 20, 30, 40 };

    // arr -> 0x123 (3*4B = 12B)

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("End of program");
  }
}
