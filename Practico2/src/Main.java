import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Ordenamiento orde = new Ordenamiento();
    boolean salida = false;
    System.out.println("Ordenamiento de arreglos aleatorios.\n");
    try{
        System.out.println("Elija un maximo para el/los arreglo/s(100|1000|10000).\n");
         orde.setMaximo(Integer.parseInt(scanner.nextLine()));
        if(orde.getMaximo()!=100&&orde.getMaximo()!=1000&&orde.getMaximo()!=10000){
            throw new IllegalArgumentException("Valor no valido");
        }
    }catch(IllegalArgumentException e){
        e.getMessage();
    }
     System.out.println("Elija un metodo de ordenamiento.\n");
    do {
        System.out.println("1)Ordenamiento Insercion.\n");
        System.out.println("2)Ordenamiento ShellSort.\n");
        System.out.println("3)Ordenamiento QuickSort.\n");
        System.out.println("4)Comparar tiempos entre los ordenamientos usados(solo un tipo de dato por ordenamiento).\n");
        System.out.println("5)Salir.\n");
        int op = Integer.parseInt(scanner.nextLine());
        switch(op){
            case 1:
                orde.ordenamientInsersion();
                break;
            case 2:
                orde.ordenamientoShellSort();
                break;
            case 3:
                orde.ordenamientoQuickSort();
                break;
            case 4:
                long inti=orde.getIntiempo();
                long shti=orde.getShelltiempo();
                long quti=orde.getQuicktiempo();
                try{
                    if(inti==-1&&shti==-1||inti==-1&&quti==-1||shti==-1&&quti==-1){
                        throw new IllegalArgumentException("No se han cargado minimo 2 matrices");
                    }
                    if(inti!=-1){
                        System.out.println("Tiempo capturado con Iserccion: "+inti+" ms");
                    }
                    if(shti!=-1){
                        System.out.println("Tiempo capturado con Shellsort: "+shti+" ms");
                    }
                    if(quti!=-1){
                        System.out.println("Tiempo capturado con QuickSort: "+quti+" ms");
                    }
                }catch(IllegalArgumentException e){
                    e.getMessage();
                }
                break;
            case 5:
                salida = true;
                break;
            default:
                System.out.println("Opcion no valida.\n");
                break;
        }
    } while (!salida);
    
}
    
}
