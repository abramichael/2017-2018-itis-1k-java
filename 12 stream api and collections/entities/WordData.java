package entities;

public class WordData {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;

    public WordData(String word, int count) {
        this.word = word;
        this.count = count;
    }
}
