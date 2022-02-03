import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age = askForAge();
        int income = askForIncome();
        String name = askForname();
        boolean tributes = solveIfTributes();

        /*boolean tribute = age > 16 && income < 1000;

        if (tribute) {
            System.out.println("et toca tributar");
        } else{
            System.out.println("no has de tributar");
    }*/


}

    private static boolean solveIfTributes(int age, int income) {
        boolean tribute = age > 16 && income < 1000;

        if (tribute) {
            System.out.println("et toca tributar");
        } else{
            System.out.println("no has de tributar");
        }
    }

    private static String askForname() {
        System.out.println("entra el teu nom ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    private static int askForIncome() {
        System.out.println("entra els ingresos: ");
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        return income;
    }

        private static int askForAge() {
        System.out.println("entra l'edat :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }
}



