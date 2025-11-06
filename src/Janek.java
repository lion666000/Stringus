public class Janek {
    String name; // jAn zROKycaN

    public void preved(){
        name = "jAn zROKycaN";
        System.out.println("Převádění: " + name);

        String nameFixed = name.toLowerCase();

        System.out.println(nameFixed + " + " + nameFixed.length());

        String nameFixedSub1 = nameFixed.substring(0, 1).toUpperCase();
        String nameFixedSub2 = nameFixed.substring(1, 4);
        String nameFixedSub3 = nameFixed.substring(4, 5).toUpperCase();
        String nameFixedSub4 = nameFixed.substring(5);

        nameFixed = nameFixedSub1 + nameFixedSub2 + nameFixedSub3 + nameFixedSub4;

        System.out.println("Opravený string: " + nameFixed);
    }
}
