package tests;

import collection_singletons.WordDataCollectionSingleton;
import entities.WordData;

import java.util.List;

public class NotWordDataTest {

    public static void testCorrectLength() {
        List<WordData> wdc = WordDataCollectionSingleton.getWordDataCollection();
        if (wdc.size() != 27469) {
            throw new AssertionError("Failed!");
        }
    }

    public static void main(String[] args) {
        testCorrectLength();
    }
}
