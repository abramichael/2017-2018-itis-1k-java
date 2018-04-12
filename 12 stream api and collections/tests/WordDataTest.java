package tests;

import collection_singletons.WordDataCollectionSingleton;
import entities.WordData;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WordDataTest {
    @Test
    public void testCorrectLength() {
        List<WordData> wdc = WordDataCollectionSingleton.getWordDataCollection();
        Assert.assertEquals(27469, wdc.size());
    }
}
