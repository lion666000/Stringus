import java.util.Scanner;

public class Mezernik {
    String text;

    static Scanner sc = new Scanner(System.in);
    public void pocitadlo(){
        System.out.println("Zadejte text");
        text =  sc.nextLine();
        String textBezMezery = text;

        while (textBezMezery.contains(" ")){
            int trim = textBezMezery.indexOf(" ");
            String textBezMezerySub1 = textBezMezery.substring(0, trim);
            String textBezMezerySub2 = textBezMezery.substring(trim+1);
            textBezMezery = textBezMezerySub1 +  textBezMezerySub2;
            System.out.println(textBezMezery);
        }

        System.out.println("Počet znaků: " + text.length() + ", a z toho " + (text.length() - textBezMezery.length()) + " mezer");

    }
}
