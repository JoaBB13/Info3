import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   Recursividades recu = new Recursividades();
   
   boolean salida = false;
       do {
           System.out.println("Elija una opcion\n");
           System.out.println("1)Factorial de un numero.\n");
           System.out.println("2)Sumatoria de un numero.\n");
           System.out.println("3)Potencia de un numero.\n");
           System.out.println("4)Realizar conteo regresivo desde un numero.\n");
           System.out.println("5)Multiplicar dos numeros.\n");
           System.out.println("6)Imprimir arreglo.\n");
           System.out.println("7)Transformar numero entero a binario.\n");
           System.out.println("8)Salir.\n");
           System.out.println("Aclaracion: Los numeros no pueden ser negativos.\n");
           int op = Integer.parseInt(scanner.nextLine());
           switch(op){
               case 1:
                   try{
                        System.out.println("Ingrese el numero que desea calcular factorial.\n");
                        recu.setNum1(Integer.parseInt(scanner.nextLine()));
                        if(recu.getNum1()<0){
                            throw new IllegalArgumentException("Error: Numero negativo");
                        }
                        recu.calcularFactorial();
                        }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                        }
                   break;
               case 2:
                   try{
                        System.out.println("Ingrese el numero que desea calcular sumatoria.\n");
                        recu.setNum1(Integer.parseInt(scanner.nextLine()));
                        if(recu.getNum1()<0){
                            throw new IllegalArgumentException("Error: Numero negativo");
                        }
                        recu.calcularSumatoria();   
                   }catch(IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 3:
                   try{
                       System.out.println("Ingrese el numero: .\n");
                        recu.setNum1(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Ingrese la potencia que desea elevar.\n");
                        recu.setNum2(Integer.parseInt(scanner.nextLine()));
                        if(recu.getNum1()<0||recu.getNum2()<0){
                            throw new IllegalArgumentException("Error: Numero negativo");
                        }
                        recu.calcularPotencia();
                   }catch(IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 4:
                   try{
                      System.out.println("Ingrese un numero.\n");
                        recu.setNum1(Integer.parseInt(scanner.nextLine()));
                        if(recu.getNum1()<0){
                            throw new IllegalArgumentException("Error: Numero negativo");
                        }
                        recu.calcularConteo(); 
                   }catch(IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 5:
                   try{
                       System.out.println("Ingrese un numero.\n");
                        recu.setNum1(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Ingrese el numero por el que lo quiere multiplicar\n");
                        recu.setNum2(Integer.parseInt(scanner.nextLine()));
                        if(recu.getNum1()<0||recu.getNum2()<0){
                            throw new IllegalArgumentException("Error: Numero negativo");
                        }
                        recu.calcularMultiplicacion();
                   }catch(IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 6:
                   try{
                       System.out.println("Ingrese largo del arreglo.\n");
                        recu.setLargo(Integer.parseInt(scanner.nextLine()));
                        if(recu.getLargo()<0){
                            throw new IllegalArgumentException("Error: Numero negativo");
                        }
                        recu.imprimirArreglo();
                   }catch(IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 7:
                   try{
                       System.out.println("Ingrese el numero que desea transformar a binario.\n");
                        recu.setNum1(Integer.parseInt(scanner.nextLine()));
                        if(recu.getNum1()<0){
                            throw new IllegalArgumentException("Error: Numero negativo");
                        }
                        recu.imprimirBinario();
                   }catch(IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 8:
                   salida = true;
                   break;
               default:
                   System.out.println("No se ingreso una opcion valida.\n");
                   break;
           }
       } while (!salida);
       System.out.println("Gracias, que tenga un buen dia.\n");
 }
}