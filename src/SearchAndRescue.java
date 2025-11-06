import java.util.Scanner;

public class SearchAndRescue {
    String text = "I tied my rope until my rope was tied";


    static Scanner sc = new Scanner(System.in);
    public void search(){
        System.out.println(text);
        System.out.println("Jaké chcete najít slovo ?");
        String find = sc.nextLine();

        String textUprava = text;
        int delkaFind = 0;


        while(textUprava.contains(find)){
            if (textUprava.contains(find)){
                System.out.println("Slovo se nachází na " + (textUprava.indexOf(find)+1+delkaFind) + " - " + (textUprava.indexOf(find) + find.length() + delkaFind) + " znacích");
                String textUpravaSub1 = textUprava.substring(0, textUprava.indexOf(find));
                System.out.println(textUpravaSub1);
                String textUpravaSub2 = textUprava.substring((textUprava.indexOf(find)+(find.length())));
                System.out.println(textUpravaSub2);
                delkaFind = delkaFind + find.length();

                textUprava = textUpravaSub1 + textUpravaSub2;
                System.out.println(textUprava);
            }
            else {
                break;
            }
        }
    }
}
