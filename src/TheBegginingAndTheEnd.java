import java.util.Scanner;

public class TheBegginingAndTheEnd {
    String word;

    static Scanner sc = new Scanner(System.in);
    public void finder(){
        System.out.println("Zadej slovo:");
        word = sc.nextLine();
        char firstLetter = word.charAt(0);
        char secondLetter = word.charAt(word.length()-1);

        System.out.println("Začáteční písmeno: " + firstLetter + ", Poslední písmeno: " + secondLetter);
    }
}
