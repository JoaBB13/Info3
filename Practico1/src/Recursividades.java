import java.util.Random;
public class Recursividades {
private int num1;
private int num2;
private int largo;
public void setNum1(int num1){
    this.num1=num1;
}
public int getNum1(){
    return num1;
}
public void setNum2(int num2){
    this.num2=num2;
}
public int getNum2(){
    return num2;
}
public void setLargo(int largo) {
    this.largo = largo;
}
public int getLargo() {
    return largo;
}

public void calcularFactorial(){
    //Escribe una función recursiva que calcule el factorial de un número entero positivo n.
    //Por ejemplo, 4! es 1x2x3x4=24.
    System.out.println("El factorial de "+num1+" es "+factorial(num1));
}
public static int factorial(int num1){
    if(num1 <= 1){
        return 1;
    }else{
        return num1 * factorial(num1 - 1);
    }
}

public void calcularSumatoria(){
    //Escribe una función recursiva que calcule la suma de los primeros n enteros
    //positivos. Por ejemplo, n=4 es 1+2+3+4=10.
    System.out.println("La sumatoria de "+num1+" es "+sumatoria(num1));
}
public static int sumatoria(int num1){
    if(num1<=1){
        return num1;
    }else{
        return num1 + sumatoria(num1-1);
    }
}

public void calcularPotencia(){
    //Escribe una función recursiva que calcule la potencia de un número base elevado a
    //un exponente. Por ejemplo, 2^3=2*2*2=8
    System.out.println("El numero "+num1+" eleveado a la "+num2+" es "+potencia(num1,num2));
}
public static int potencia(int num1, int num2){
    if(num2 == 0){
        return 1;//base
    }else{
        return num1 * potencia(num1,num2-1);
    }
 }

public void calcularConteo(){
    //Escribe una función recursiva que imprima un conteo regresivo desde un número n
    //hasta 1. Por ejemplo, n=4 es 4,3,2,1.
    System.out.println(conteo(num1));
}
public static int conteo(int num1){
    if(num1==1){
        System.out.println(num1);
        return num1;
    }else{
        System.out.println(num1 + " ");
        return conteo(num1-1);
    }
}

public void calcularMultiplicacion(){
    //Escriba un método recursivo que calcule el producto de dos números enteros
    //usando sumas sucesivas. Por ejemplo, 2x4=2+2+2+2=8
    System.out.println("La multiplicacion de "+num1+" por "+num2+" es:"+multiplicar(num1,num2));
}
public static int multiplicar(int n1,int n2){
    if(n1==0||n2==0){
        return 0;
    }else{
        return n1 + multiplicar(n1,n2-1);
    }
}

public void imprimirArreglo(){
    //Escriba un método recursivo que imprima los elementos de un arreglo en orden
    //inverso.
    Random random = new Random();
    System.out.println("Generando numeros aleatorios.\n");
    int array[] = new int[largo];//siempre se crea asi
    for (int i = 0; i < largo; i++) {
        array[i]=random.nextInt(100 - 1 + 1);
    }
    System.out.println("Inprimiendo con for.....");
    for(int ar: array){
        System.out.println(ar);
    }
    System.out.println("Imprimiendo de forma recursiva a la inversa....");
    imprimir(array,largo-1);
}
public static void imprimir(int[] a,int l){
    if(l>=0){
        System.out.println(a[l]+" ");
        imprimir(a, l-1);
    }
}

public void imprimirBinario(){
    //Escriba un método recursivo que devuelva el número de unos en la representación
    //binaria de N. Use el hecho de que es igual al número de unos en la representación
    //binaria de N/2, más 1 si N es impar.
    System.out.println("La forma binaria de"+num1+"es:");
    int cant=transformarABinario(num1);
    System.out.println("La cantidad de 1 es: "+cant);
}
public static int transformarABinario(int n){
    if(n<=1){
        System.out.println(n+"");
        return n;
    }else{
        int resto=n%2;
        int contador=transformarABinario(n/2);
        if(n%2==1){
            contador++;
        }
        System.out.println(resto);
        return contador;
    }
}
}