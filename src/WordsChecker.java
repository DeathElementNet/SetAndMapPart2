import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    private Set<String> words;

    public WordsChecker(String txt) {
        this.words = new HashSet<>(
                List.of(
                        txt.split("\\P{IsAlphabetic}+")
                )
        );
    }

    public boolean hasWord(String word) {
        return words.contains(word);

    }
}