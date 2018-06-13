import java.util.Scanner;

public class MenuHome2 {

    public boolean returnName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = in.nextLine();


        for(int i =0; i < imie.length(); i ++) {
            for(int j = i + 1; j < imie.length(); j++) {
                if(imie.charAt(i) == imie.charAt(j)) {
                    System.out.print(imie + " ");
                    return true;
                }
            }
        }
        System.out.print(imie + " ");
        return false;



    }

}
