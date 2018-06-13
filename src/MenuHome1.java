
import java.util.Scanner;

public class MenuHome1 {


    Scanner in = new Scanner(System.in);


    //metoda pobierająca liczbę imion do tablicy z klawiatury
    public int nameQuantity() {
        System.out.println("Podaj liczbę imion do wprowadzenia: ");
        int x = in.nextInt();
        return x;
    }

    //metoda tworzy tablicę stringów
    public String[] names(int y) {
        String[] allNames = new String[y];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < y; i++) {
            System.out.println("podaj " + (i+1) + " imię:");
            allNames[i] = in.nextLine();
        }
            return allNames;
        }



        //metoda znajdująca najdłuższe imię
        public void longname(String[] tab) {


        String longestName = "a";
        String shortesName = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";

        for(int i =0; i < tab.length; i ++ ) {
            System.out.println( tab[i] + "\n");


            if(longestName.length() < tab[i].length()) {
                longestName = tab[i];
            }
            if(shortesName.length() > tab[i].length()) {
                shortesName = tab[i];
            }
        }
            System.out.println("Najdłuższe imię to: ");
            System.out.println(longestName + "\n");
            System.out.println("Najkrótsze imię to: ");
            System.out.println(shortesName + "\n");
        }



        //metoda zliczająca powtarzające się imiona
        public void sameName(String[] tab) {

        int quant[] = new int[tab.length];  //tworzy tablicę, która będzie zapamiętywała ilość powtórzeń imion
        for(int i = 0; i < quant.length; i++) //napełnia tablicę aby wartość pierwotna wystąpień imienia była równa 1
            quant[i] = 1;


        for(int z = 0; z < tab.length; z ++) {
            if(tab[z] == null) continue;   //przeskakuje skasowane czyli zliczone już imię (patrz następny przypis)
            for(int n = z+1; n < tab.length; n ++){
                if(tab[z].equals(tab[n])) {
                    quant[z] +=1;
                    tab[n] = null; //aby zapobiec ponownemu zliczaniu imienia kasuje je
                }
            }
        }
            System.out.println("Powtarzające się imiona: ");
        for(int i = 0; i < quant.length; i ++) {
            if(quant[i] > 1) {
                System.out.println(tab[i] + " " + quant[i]);
            }
        }
    }
}





