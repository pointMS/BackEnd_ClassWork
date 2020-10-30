package ls1006_Map_Anagram;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    private List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nanna", "navi");
    private Anagram anagram = new Anagram(VOC);

    @Test
    public void testAnagram() {
        String word = "anna";
        List<String> expected = Arrays.asList("anna", "naan");
        List<String> actual = anagram.getAnagram(word);
        assertEquals(expected, actual);

        //anagram.getAnagram("anna");
    }
}
