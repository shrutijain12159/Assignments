import java.util.HashMap;
import java.util.Scanner;
public class WordFrequency
{
    public static void countfrequency(String st)
    {
        //System.out.println(st);
        String[] array=st.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for (String word : array) 
        {
            if(!map.containsKey(word))
                 map.put(word,1);
            else
                 map.put(word,map.get(word)+1);
        }
        System.out.println("Word frequencies list -" +map);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter collection of words:");
        String words=sc.nextLine();
        WordFrequency.countfrequency(words);
    }
}