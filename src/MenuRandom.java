import java.io.File;
import java.io.PrintWriter;
import java.util.*;
import java.io.IOException;

public class MenuRandom {

    public void takeVariables()
     throws InterruptedException, IOException {
        Scanner in = new Scanner(System.in);

        //wyszło na to, że musiałem użyc TreeSeta do zapisu bo od razu układa w kolejności
        Set<Integer> numbers = new TreeSet<>();

        System.out.println("Podaj górny zakres liczb do losowania: ");
        int x = in.nextInt();

        System.out.println("Podaj ilość liczb do wylosowania: ");
        int y = in.nextInt();




        Random r = new Random();

        for(int i = 0; i < y; i++) {
            int a = r.nextInt(x) + 1;

            //jeżli mam już w secie liczbę to muszę cofnąć licznik o 1 bo za mało liczb wylosuję
            if (numbers.contains(a)) {
                i--;
                continue;
            }

            numbers.add(a);
            Thread.sleep(1000);// 1sec czasu oczekiwania pomiędzy iteracjami


            System.out.println(a);
        }
        System.out.println("-----------------------------");

        for(int u: numbers) {
            System.out.print(u + " ");
        }



        //sam decydujesz gdzie zapiszesz plik
        System.out.println("\npodaj ścieżkę dostęþu do utworzenia i  zapisu pliku: ");
        String da = in.next();

        File file = new File(da + "plik.txt");

        //sprawdzam czy plik już jest, jeśli nie tworzę go w określonej lokalizacji
        if(!file.exists())
            file.createNewFile();

        // no i zapisuję dane w pliku
        PrintWriter zapis = new PrintWriter(da + "plik.txt");
        for(int u: numbers) {
            zapis.print(u + " ");
        }
        zapis.close();

    }



    }


