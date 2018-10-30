/*International Morse Code defines a standard encoding where each letter is mapped to a series of dots
 and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
For example, "cba" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-").
We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation:
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".

Note:

    The length of words will be at most 100.
    Each words[i] will have length in range [1, 12].
    words[i] will only consist of lowercase letters.

*/


import java.util.HashSet;
import java.util.TreeMap;

public class Unique_Morse {

    static public int uniqueMorseRepresentations(String[] words) {
        TreeMap<Integer, String> morse = new TreeMap<>();
        HashSet<String> finalset = new HashSet<>();
        String[] mor = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int j = 0;
        for(int i = 97; i < 123; i++){
            morse.put(i, mor[j]);
            j++;
        }
        for(int k = 0; k < words.length; k++){
            String[] perword = words[k].split("");
            String putter = "";
            for(int m = 0; m < perword.length; m++){
                putter += morse.get((int)perword[m].charAt(0));
            }
            finalset.add(putter);
        }
        System.out.println(morse);
        return finalset.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(args));
    }

}
