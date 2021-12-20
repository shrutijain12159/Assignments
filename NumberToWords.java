import java.util.*;
class NumberToWords {
 
 public static String pairconversion(int n,int count)
 {
     String result="";
     Map<Integer,String> onedigit=new HashMap<Integer,String>(){{
       put(1,"one");       put(2,"two");       put(3,"three");
       put(4,"four");       put(5,"five");       put(6,"six");
       put(7,"seven");       put(8,"eight");       put(9,"nine");
       put(0,"");}};
      
      Map<Integer,String> twodigit=new HashMap<Integer,String>(){{
       put(11,"eleven");       put(12,"twelve");       put(13,"thirteen");       put(14,"fourteen");       put(15,"fifteen");       put(16,"sixteen");       put(17,"seventeen");       put(18,"eightteen");
       put(19,"nineteen");       put(10,"ten");}};
       
       Map<Integer,String> aftertwenty=new HashMap<Integer,String>(){{       put(2,"twenty");       put(3,"thirty");
       put(4,"fourty");       put(5,"fifty");       put(6,"sixty");
       put(7,"seventy");       put(8,"eighty");
       put(9,"ninety");       put(0,"");}};
       
       
       Map<Integer,String> position=new HashMap<Integer,String>(){{
       put(1,"");       put(2,"thousand");       put(3,"million");
       put(4,"billion");       put(5,"trillion");       put(6,"quadrillion");       put(7,"quintillion");
       put(8,"sextillion");}};
       
        if(n==0)
        {
            
            return result;
        }
        
        else
        {
            int temp=n;
           if(n>99)
            {
                
                int firstdigit=0;
                while(n!=0)
                {
                    firstdigit=n%10;
                    n/=10;
                }
                result=result+ onedigit.get(firstdigit) + " hundred " ;
            }
            
            n=temp;
            int x=n%100;
            int y;
            if(x>=10 && x<=19)
                result=result+ twodigit.get(n%100) +" ";
            else if(x>=20)
            {
                y=x%10;
                x=x/10;
                result=result + aftertwenty.get(x) +" " + onedigit.get(y)  ;
            }
            else
            {
                result=result + onedigit.get(x);
            }
            return result + " " + position.get(count) +" ";
        }

 }
 public static void numbertowords(long num)
 {
    String result="";
    int noofsets=0;
    long temp=num;
    long remainder;
    while(num!=0)
    {
      remainder=num%1000;
      noofsets++;
      //System.out.println(remainder + " "+noofsets);
      result=pairconversion((int)remainder,noofsets) + result;
      num=num/1000;
    }
    System.out.println(" Number is = "+ temp +"\n Result is = " + result);
    
  }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        while(true)
        {
            System.out.println(" Enter number = ");
            long num=sc.nextLong();
            NumberToWords.numbertowords(num);
            System.out.println(" Enter your choice : 1 CONTINUE \n 2 EXIT");
            int choice=sc.nextInt();
            if(choice==2)
                break;
        }
        
    }
}