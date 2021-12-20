import java.util.Scanner;
class Palindrome {
  public static String palindrome(String st)
  {
    char[] array=st.toCharArray();
    int flag=0;
    int i=0,j=st.length()-1;

    while(i!=j && j>1)
    {
        if(array[i]!=array[j])
        {
          flag=1;
          break;
        }
        i++;
        j--;
    }
    if(flag==1)
      return "Not Palindrome";
    else
      return "It Is Palindrome";
  }
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    while(true)
    {
      String st,result;
      System.out.println("Enter Number or string =");
      st=sc.next();
      result=Palindrome.palindrome(st.toLowerCase());
      System.out.println(result);
      System.out.println(" Enter your choice : 1 CONTINUE \n 2 EXIT");
            int choice=sc.nextInt();
            if(choice==2)
                break;
    }
    
  }
}
