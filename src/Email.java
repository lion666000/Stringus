import java.util.Scanner;

public class Email {

    private String email;
    private String jmeno;
    private String domena;

    public String getDomena() {
        return domena;
    }

    static Scanner sc = new Scanner(System.in);
    public void funguj(){
        System.out.println("Zadej email");
        email = sc.nextLine();

        jmeno = email.substring(0, email.indexOf("@"));
        System.out.println("Jmeno: " + jmeno);
        domena = email.substring(email.indexOf("@"));
        System.out.println("Domena: " + domena);
    }
}
