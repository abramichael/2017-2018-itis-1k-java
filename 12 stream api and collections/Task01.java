import collection_singletons.WordDataCollectionSingleton;
import entities.WordData;

import java.util.List;

public class Task01 {
    public static String getWordWithMaxUsageLoopStyle() {
        List<WordData> wdc = WordDataCollectionSingleton.getWordDataCollection();
        if (wdc.size() == 0)
            return null;
        int max = wdc.get(0).getCount();
        String word = wdc.get(0).getWord();
        for (WordData wordData: wdc) {
            if (wordData.getCount() > max) {
                max = wordData.getCount();
                word = wordData.getWord();
                System.out.println(word + ": " + max);
            }
        }
        return word;
    }

    public static String getWordWithMaxUsageStreamAPIStyle() {
        String word = WordDataCollectionSingleton.getWordDataCollection()
                .stream()
                .reduce((wd1, wd2) ->
                            {return wd1.getCount() > wd2.getCount() ? wd1 : wd2;})
                .orElse(new WordData("", 0))
                .getWord();
        return word;
    }

    public static void main(String[] args) {
        System.out.println(getWordWithMaxUsageLoopStyle());
        System.out.println(getWordWithMaxUsageStreamAPIStyle());
    }

}
