import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean outOfIndex;
        boolean restartProgram = false;
        Scanner sc = new Scanner(System.in);
        MathOperation mathOp = new MathOperation();
        do{
            System.out.println("Calculadora de operaciones basicas");
            System.out.print("Inserta el primer numero a analizar:");
            mathOp.setNum(sc.nextInt());

            System.out.print("Inserta el segundo numero a analizar:");
            mathOp.setNum2(sc.nextInt());

            System.out.println(" a continuacion inserta un numero para seleccionar la operacion matematica de la " +
                    "siguiente lista");

            System.out.println(" 1.-Suma \n 2.- Resta \n 3.- Multiplicacion \n 4.- Division \n 5.- Modulo");
            System.out.print("Ingresa el numero:");
            do{
                outOfIndex = true;
                switch(sc.nextInt()){
                    case 1:
                        System.out.println(mathOp.addition());
                        break;
                    case 2:
                        System.out.println(mathOp.subtraction());
                        break;
                    case 3:
                        System.out.println(mathOp.multiplication());
                        break;
                    case 4:
                        System.out.println(mathOp.division());
                        break;
                    case 5:
                        System.out.println(mathOp.module());
                        break;
                    default:
                        System.out.println("Inserta un numero dentro del rango de 1 a 5");
                        outOfIndex = false;
                }
            }while(!outOfIndex);
            System.out.print("Si quieres volver a usar el programa escribe 1 o cualquier otra cosa para salir:");
            if (sc.nextInt() == 1){
                restartProgram = true;
            }
            else{
                restartProgram = false;
            }
        }while(restartProgram);


    }

}


