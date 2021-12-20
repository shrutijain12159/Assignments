import java.util.Scanner;
public class PerfectNumber {
  public  void perfectnumber(int end)
  {
    int i,j,sum;
    System.out.print("Perfect numbers between 1 to " + end + " are = \n ");
    for(i=1;i<=end;i++)
    {
      sum=0;
      for(j=1;j<=i/2;j++)
      {
        if(i%j==0)
          sum+=j;
      }
      if(sum==i)
        System.out.print(i + "  ");
    }
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      System.out.println("Enter End Range =");
      int num=sc.nextInt();
      PerfectNumber obj=new PerfectNumber();
      obj.perfectnumber(num);
      System.out.println(" \n Enter your choice : 1 CONTINUE \n 2 EXIT");
            int choice=sc.nextInt();
            if(choice==2)
                break;
    }
    
  }
}
