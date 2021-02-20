package javaString;
public class LastLetterCount {
public static void main(String args[])
    {
        String str = "many words";
        String suff = "y";
        String suff1="s";
        String word1=null;
        String word2=null;
 
        // Extract words from the sentence
        String words[] = str.split(" ");
 
        // For every word
        for (int i = 0; i < words.length; i++) {
 
            // If it ends with the given suffix
            if (words[i].endsWith(suff))
            {
            	word1=words[i];
            }
            if (words[i].endsWith(suff1))
            {
            	word2=words[i];
            }
        }
 
       
        System.out.println("swapped string: "+word2+" "+word1);
       
        
    }

	}
