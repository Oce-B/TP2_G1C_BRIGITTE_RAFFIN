import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    discriminant();


    }
        public static void parite(int[] args){

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