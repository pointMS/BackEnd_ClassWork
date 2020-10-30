package ls1006_Map_Anagram;

import java.util.*;

//{“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”
public class Anagram {
    //public static List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nanna", "navi");
    private Map<String, List<String>> map;

    public Anagram(List<String> voc) { //constructor
        map = buildMap(voc);
    }

    public List<String> getAnagram(String word) {
        String sortedWord = sortWord(word);
        return map.get(sortedWord);
    }

    private Map<String, List<String>> buildMap(List<String> voc) {
        Map<String, List<String>> res = new HashMap<>();
        for (String w : voc) {
            String sortedWord = sortWord(w);
            List<String> list = res.get(sortedWord);
            if (list == null) {
                list = new ArrayList<>();
                list.add(w);
                res.put(sortedWord, list);
            } else {
                list.add(w);
            }
        }
        return res;
    }

    private String sortWord(String word) { // to sort letters in the word
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
