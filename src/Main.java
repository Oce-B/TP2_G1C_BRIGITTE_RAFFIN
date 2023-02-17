import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    min();


    }

        public static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le premier nombre");
        int premierNombre = scanner.nextInt();
        System.out.println("Veuillez entrer un second Nombre");
        int secondNombre = scanner.nextInt();

        if (premierNombre<secondNombre){
            System.out.print(secondNombre);
        } else if (secondNombre==premierNombre){
            System.out.println("Ils sont égaux");
        }
        else{
            System.out.print(premierNombre);
        }
        }


    public static void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le premier nombre");
        int premierNombre = scanner.nextInt();
        System.out.println("Veuillez entrer un second Nombre");
        int secondNombre = scanner.nextInt();

        if (premierNombre>secondNombre){
            System.out.print(secondNombre);
        } else if (secondNombre==premierNombre){
            System.out.println("Ils sont égaux");
        }
        else{
            System.out.print(premierNombre);
        }
    }

        public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un entier");
        int nombre = scanner.nextInt();

        if (nombre%2==0){
            System.out.println("Ce nombre est pair");
            System.out.print(nombre);
        }
        else {
            System.out.println("Ce nombre est impair");
            System.out.print(nombre);
        }
        }

    public static void discriminant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c?");
        int c = scanner.nextInt();


        int delta = (int) (Math.pow(b,2) - 4 * a *c);

        if (delta < 0) {
            System.out.println("Ce polynome n'a pas de valeur réelle.");
        }
        else if (delta == 0) {
            double x0 = (-b)/2*a;
            System.out.println("La racine double de ce polynome est");
            System.out.print(x0);
        }
        else {
            double x1 = (-b + Math.pow(delta,1/2)) /2*a;
            double x2 =  (-b - Math.pow(delta,1/2)) /2*a;
            System.out.println("Les racines réelles de ce polynome sont");
            System.out.print(x1);
            System.out.print(x2);
        }
    }
}