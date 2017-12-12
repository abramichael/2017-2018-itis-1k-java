import java.io.IOException;
import java.util.Scanner;

public class Game {


    public void play() {

        boolean playing = true;

        //генерируется слово
        String word = "orthogonality";
        StringBuffer word_mask = new StringBuffer("");
        for (int i = 0; i < word.length(); i++) {
            word_mask.append("*");
        }
        Scanner sc = new Scanner(System.in);
        int status = 0;

        String letters = "zqxjkvbpygfwmucldrhsnioate";
        int letterIndex = letters.length() - 1;

        while (playing) {
            System.out.println("NEW STEP");
            System.out.println("WORD: " + word_mask);
            if (status == 0) {
                char c = sc.nextLine().charAt(0);
                if (word.contains(c + "")) {
                    System.out.println("Correct");
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == c) {
                            word_mask.setCharAt(i, c);
                        }
                    }
                } else {
                    System.out.println("Wrong, now computer goes.");
                    status = 1;
                }

            }
            else if (status == 1) {
                char c = letters.charAt(letterIndex);
                letterIndex--;
                if (word.contains(c + "")) {
                    System.out.println("Correct");
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == c) {
                            word_mask.setCharAt(i, c);
                        }
                    }
                } else {
                    System.out.println("Wrong, now user goes.");
                    status = 0;
                }

            }

        }

    }

    public static void main(String[] args) throws IOException {

        (new Game()).play();
    }
}
