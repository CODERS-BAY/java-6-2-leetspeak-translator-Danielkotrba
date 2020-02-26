import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("say something and i will say it back to you in Leetspeak!");
        Scanner scan = new Scanner(System.in);

                String word = scan.nextLine();
                    //Lowercase
                if (word.contains("a")) {
                    word = word.replace("a", "@");
                }
                if (word.contains("b")) {
                    word = word.replace("b", "8");
                }
                if (word.contains("c")) {
                    word = word.replace("c", "(");
                }
                if (word.contains("e")) {
                    word = word.replace("e", "3");
                }
                if (word.contains("g")) {
                    word = word.replace("g", "6");
                }
                if (word.contains("h")) {
                    word = word.replace("h", "#");
                }
                if (word.contains("i")) {
                    word = word.replace("i", "!");
                }
                if (word.contains("l")) {
                    word = word.replace("l", "1");
                }
                if (word.contains("o")) {
                    word = word.replace("o", "0");
                }
                if (word.contains("s")) {
                    word = word.replace("s", "$");
                }
                if (word.contains("t")) {
                    word = word.replace("t", "7");
                }
                if (word.contains("z")) {
                    word = word.replace("z", "2");
                }
                    //Uppercase
                if (word.contains("A")) {
                    word = word.replace("A", "@");
                }
                if (word.contains("B")) {
                    word = word.replace("B", "8");
                }
                if (word.contains("C")) {
                    word = word.replace("C", "(");
                }
                if (word.contains("E")) {
                    word = word.replace("E", "3");
                }
                if (word.contains("G")) {
                    word = word.replace("G", "6");
                }
                if (word.contains("H")) {
                    word = word.replace("H", "#");
                }
                if (word.contains("I")) {
                    word = word.replace("I", "!");
                }
                if (word.contains("L")) {
                    word = word.replace("L", "1");
                }
                if (word.contains("O")) {
                    word = word.replace("O", "0");
                }
                if (word.contains("S")) {
                    word = word.replace("S", "$");
                }
                if (word.contains("T")) {
                    word = word.replace("T", "7");
                }
                if (word.contains("Z")) {
                    word = word.replace("Z", "2");
                }
                System.out.println(word);
    }
}
