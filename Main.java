import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);

    int countDown;

    
    System.out.println("Enter a number to count down or up from:");
    countDown = s.nextInt();
    System.out.println("Blast Off in...");
    
    
    if (countDown >= 0)
    {
      while (countDown > 0)
      {
       System.out.println(countDown);
        countDown--;       
      }
    }
    else if (countDown < 0)
    {
      while (countDown < 0)
     {
        System.out.println(countDown);
        countDown++;
     }
    }
      

    if (countDown == 0)
    {
      System.out.println(countDown);
      System.out.println("Blast Off!");
    }
  }
}