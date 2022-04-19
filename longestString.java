import java.util.Scanner;

class longestString{

    public static String findLongestString(String arr[])
    {
        int maxLength=arr[0].length();
        String maxString=arr[0];
        for (String st : arr) {
            if(maxLength<st.length())
            {
                maxLength=st.length();
                maxString=st;
            }
        }
        return maxString;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String longString="";
        System.out.println("Enter number of elements yo want in the array =");
        int size=sc.nextInt();
        sc.nextLine();
        String[] arrayOfStrings=new String[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
            arrayOfStrings[i]=sc.nextLine();

        longString = findLongestString(arrayOfStrings);
        System.out.println("Longest string is = " + longString);
       sc.close();
    }
}