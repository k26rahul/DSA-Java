public class Test {

  // /**
  // * A_Petr_and_Book
  // */

  // import java.util.Scanner;

  // public class A_Petr_and_Book {
  // public static void main(String[] args) {
  // Scanner scanner = new Scanner(System.in);
  // int n = scanner.nextInt();

  // int[] pages_a_day = new int[7];
  // for (int i = 0; i < 7; i++) {
  // pages_a_day[i] = scanner.nextInt();
  // }

  // int day = 0;
  // int done = 0;

  // while (done < n) {
  // if (day == 7)
  // day = 0;

  // done += pages_a_day[day];
  // day++;
  // }

  // System.out.println(day);
  // scanner.close();
  // }
  // }

  /*
   * Input T
   * Repeat T times:
   * Input n
   * 
   * Create an empty list a
   * Repeat n times:
   * Add the next integer input to list a
   * 
   * Create an empty list new_a
   * For each element x in list a:
   * Add the absolute value of x to list new_a
   * 
   * Initialize a variable sum to 0
   * For each element x in list new_a:
   * Add x to sum
   * 
   * Print sum
   */

  // import java.util.Scanner;
  // import java.util.ArrayList;

  // public class A_Turtle_Puzzle_Rearrange_and_Negate {

  // public static void main(String[] args) {
  // Scanner scanner = new Scanner(System.in);
  // int T = scanner.nextInt();

  // for (int t = 0; t < T; t++) {
  // int n = scanner.nextInt();

  // ArrayList<Integer> a = new ArrayList<>();
  // for (int i = 0; i < n; i++) {
  // a.add(scanner.nextInt());
  // }

  // ArrayList<Integer> new_a = new ArrayList<>();
  // for (int x : a) {
  // new_a.add(Math.abs(x));
  // }

  // int sum = 0;
  // for (int x : new_a) {
  // sum += x;
  // }
  // System.out.println(sum);
  // }

  // scanner.close();
  // }
  // }

}
