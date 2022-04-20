import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {   
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    while (base > 0) {
      for (int i = 0; i < base; i++) {
        System.out.print('*');
      }
      System.out.print('\n');
      base--;
    }       
  }
}
