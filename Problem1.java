public class Problem1 {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 2; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        System.out.println("The number is: " + i);
        sum += i;
      }
    }
    System.out.println("The sum is: " + sum);
  }  
}