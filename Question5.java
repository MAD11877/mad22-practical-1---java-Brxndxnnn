import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {   
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    
    int highest = 0;
    
    for (int i = 0; i < count; i++) {
      Scanner inp = new Scanner(System.in);
      int no = inp.nextInt();      
      if(no > highest){
        highest = no;
      } else{
        ;
      }
    }
    System.out.print(highest);
  }
}
