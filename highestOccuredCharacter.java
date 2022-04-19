//import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class highestOccuredCharacter {

    public static void countOccurance(String word) {
        if(word!="")
        {
            char[] wordArray = word.toCharArray();
            HashMap<Character,Integer> map=new HashMap<>();
            for (char c : wordArray) {
                if(!map.containsKey(c) && c!=' ')
                    map.put(c,1);
                else if(c!=' ')
                    map.put(c,map.get(c)+1);
            }
            System.out.println(map);
            
            int maxValue = (Collections.max(map.values()));
            System.out.println(" Maximum occurance of a character in the given word is =" + maxValue);
            System.out.println("(It can be either a single character or few characters sharing same frequency:)");
            for(java.util.Map.Entry<Character, Integer> entry: map.entrySet())
            {
                if(entry.getValue() == maxValue)
                {
                    System.out.println("Character with maximum occurance is =" + entry.getKey());
                }
            }
        }
        else
        System.out.println("No word entered");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.nextLine();
        countOccurance(word);
        sc.close();
    }

    
}
