import java.util.Scanner;
import java.util.HashMap;
class CountNumberOfOccurance {
  public static void countnumberofoccurance(long num)
  {
    HashMap<Long,Integer> map=new HashMap<>();
     long remainder;
    while(num>0)
    {
        remainder=num%10;
        if(!map.containsKey(remainder))
            map.put(remainder,1);
        else
            map.put(remainder,map.get(remainder)+1);
        num/=10;
    }
    System.out.println(map);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
    System.out.println("Enter Number =");
    Long number=sc.nextLong();
    CountNumberOfOccurance.countnumberofoccurance(number);
    System.out.println(" Enter your choice : 1 CONTINUE \n 2 EXIT");
            int choice=sc.nextInt();
            if(choice==2)
                break;
    }
    
  }
}
