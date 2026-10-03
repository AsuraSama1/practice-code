import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

        Menu menu = new Menu();
        int opcion;
        Scanner teclado = new Scanner(System.in);


        menu.mostrarMenu();
        opcion = teclado.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingrese el primer numero");
                float a = teclado.nextFloat();
                System.out.println("Ingrese el segundo numero");
                float b = teclado.nextFloat();
                float resultadosuma = Operaciones.sumar(a, b);
                System.out.println("El resultado de la suma es: " + resultadosuma);
                break;

        }

    }
}