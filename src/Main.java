import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("say something and i will say it back to you in Leetspeak!");
        Scanner scan = new Scanner(System.in);

                String word = scan.nextLine();
                    //Lowercase
                    word = word.replace("a", "@");
                    word = word.replace("b", "8");
                    word = word.replace("c", "(");
                    word = word.replace("e", "3");
                    word = word.replace("g", "6");
                    word = word.replace("h", "#");
                    word = word.replace("i", "!");
                    word = word.replace("l", "1");
                    word = word.replace("o", "0");
                    word = word.replace("s", "$");
                    word = word.replace("t", "7");
                    word = word.replace("z", "2");
                    //Uppercase
                    word = word.replace("A", "@");
                    word = word.replace("B", "8");
                    word = word.replace("C", "(");
                    word = word.replace("E", "3");
                    word = word.replace("G", "6");
                    word = word.replace("H", "#");
                    word = word.replace("I", "!");
                    word = word.replace("L", "1");
                    word = word.replace("O", "0");
                    word = word.replace("S", "$");
                    word = word.replace("T", "7");
                    word = word.replace("Z", "2");
                System.out.println(word);
    }
}
