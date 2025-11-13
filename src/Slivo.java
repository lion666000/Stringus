import java.util.Scanner;

public class Slivo {
    static Scanner sc = new Scanner(System.in);

    String slovo;

    public Slivo() {
        System.out.println("Zadejte slovo: ");
        slovo = sc.nextLine();
    }

    public void opacne(){
        String slovo2 = "";
        for (int f = slovo.length()-1; f >= 0; f--) {
            slovo2 = slovo2 + slovo.charAt(f);
        }
        System.out.println(slovo2);
    }

    public void mensi(){
        String slovo2 = "";
        for (int i = 0; i< slovo.length(); i++){
            if (i % 2 == 0){
                String pismeno = slovo.charAt(i) + "";
                slovo2 = slovo2 + pismeno.toUpperCase();
            }
            else{
                String pismeno = slovo.charAt(i) + "";
                slovo2 = slovo2 + pismeno.toLowerCase();
            }
        }
        System.out.println(slovo2);
    }

    public void paladin(){
        String slovo2 = "";
        for (int f = slovo.length()-1; f >= 0; f--) {
            slovo2 = slovo2 + slovo.charAt(f);
        }
        System.out.println(slovo + slovo2);
    }
}
