import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println(
                "Seleccione la operacion: \n 1) Suma \n 2) Resta \n 3) Multiplicar \n 4) Dividir");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:{
                System.out.println("por favor ingrese el primer numero");
                int n1 = scanner.nextInt();
                System.out.println("por favor ingrese el segundo numero");
                int n2 = scanner.nextInt();
                int resultado = n1 + n2;
                System.out.println("el resultado de la suma entre "+n1+" Y "+n2+" es "+resultado);
                break;}
            case 2:{
                System.out.println("por favor ingrese el primer numero");
                int n1 = scanner.nextInt();
                System.out.println("por favor ingrese el segundo numero");
                int n2 = scanner.nextInt();
                int resultado = n1 - n2;
                System.out.println("el resultado de la resta entre "+n1+" Y "+n2+" es "+resultado);
                break;}
            case 3:{
                System.out.println("por favor ingrese el primer numero");
                int n1 = scanner.nextInt();
                System.out.println("por favor ingrese el segundo numero");
                int n2 = scanner.nextInt();
                int resultado = n1 * n2;
                System.out.println("el resultado de la multiplicacion entre "+n1+" Y "+n2+" es "+resultado);
                break;}
            case 4:{
                System.out.println("por favor ingrese el primer numero");
                int n1 = scanner.nextInt();
                System.out.println("por favor ingrese el segundo numero");
                int n2 = scanner.nextInt();
                int resultado = n1 / n2;
                System.out.println("el resultado de la division entre "+n1+" Y "+n2+" es "+resultado);
                break;}
            default:
                break;
        }

    }
}
