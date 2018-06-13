public class MainHome1 {
    public static void main(String[] args) {

        MenuHome1 object = new MenuHome1();


        //pobieram z klawiatury liczbę imion
        int z = object.nameQuantity();

        //wypełnia tablicę imionami
        String myNames[] = object.names(z);

        //wyszukuję i wypisuję najdłuższe i najkrtósze imię
        object.longname(myNames);
        }
    }



