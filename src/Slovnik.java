public class Slovnik {
    String veta = " Hawk tuah   khaby lame mechanism accident";

    public void funguj(){
        String veta2 = veta;

        while (veta2.contains(" ")){
            veta2 = veta2.trim();

            String slovo = veta2.substring(0, veta2.indexOf(" "));
            System.out.println(slovo + " , délka: " + (slovo.length()));

            if (veta2.length()>(veta2.substring(veta2.indexOf(slovo)+slovo.length()).length())){
                veta2 = veta2.substring(veta2.indexOf(slovo)+slovo.length());
            }
            else {
                veta2 = "";
            }
        }


    }
}
