package collection_singletons;

import entities.WordData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WordDataCollectionSingleton {
    private static List<WordData> wordDataCollection;
    private static String filename = "resources/en_v1.dic";

    public static List<WordData> getWordDataCollection() {
        if (wordDataCollection == null) {
            wordDataCollection = new ArrayList<>();
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(filename)
                        )
                );
                String line = br.readLine();
                while (line != null) {
                    String [] attrs = line.split(" ");
                    wordDataCollection.add(
                            new WordData(
                                    attrs[0],
                                    Integer.parseInt(attrs[1])
                                    )
                    );
                    line = br.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return wordDataCollection;

    }

}
