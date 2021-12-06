import java.io.*;
import java.util.Scanner;
class vowelsconsonant
{
  public static void main(String[] args)
  {
    String str;
    Scanner a = new Scanner(System.in);
    str = a.nextLine();
    int vowels=0;
    int consonant=0;
    int i;
    for(i=0;i<str.length();i++)
    {
      char ch = str.charAt(i);
                //ch = Character.toLowerCase(ch);
     
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                {
                  vowels++;
                }
      			else if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') )
                {
        			consonant++;
                }
    			else
                {
                  i++;
                }
    }
    System.out.println("Number of Vowels: "+ vowels);
    System.out.println("Number of Consonants: "+ consonant);
  }
}
