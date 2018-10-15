import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        String [] names = new String[5];
        int count = 0;


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<= names.length -1; i++){
            System.out.println("Podaj imię");
            String name = scanner.nextLine();
            String person = new String(name);
            names [count] = person;
            count++;
        }

        for ( int i=names.length-1; i >=0; i--){
            System.out.println("Cześć " + names[i]);
        }
    }
}
