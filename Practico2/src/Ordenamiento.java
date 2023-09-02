import java.util.Random;
import java.util.Scanner;
public class Ordenamiento {
    private int maximo;
    private long intiempo=-1;
    private long shelltiempo=-1;
    private long quicktiempo=-1;
    public void setIntiempo(long intiempo){
        this.intiempo=intiempo;
    }
    public long getIntiempo(){
        return intiempo;
    }
    public void setShelltiempo(long shelltiempo){
        this.shelltiempo=shelltiempo;
    }
    public long getShelltiempo(){
        return shelltiempo;
    }
    public void setQuicktiempo(long quicktiempo){
        this.quicktiempo=quicktiempo;
    }
    public long getQuicktiempo(){
        return quicktiempo;
    }
    public void setMaximo(int maximo){
        this.maximo=maximo;
    }
    public int getMaximo(){
        return maximo;
    }
    public void ordenamientInsersion(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean volver = false;
        do {
            System.out.println("Elija un tipo de dato.\n");
            System.out.println("1)Enteros.\n");
            System.out.println("2)Double.\n");
            System.out.println("3)Char.\n");
            System.out.println("4)Volver al menu.\n");
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                     int[] array = new int[maximo];
                     for(int i=0;i<maximo;i++){
                            array[i]=random.nextInt(100000);
                     }
                     long startTime = System.nanoTime();
                     for(int i=1;i<array.length;i++){//El primer for comienza desde el segundo elemento del arreglo
                        int current = array[i];//Guarda ese elemento en current
                        int j;
                        // Mover los elementos mayores que el elemento actual hacia adelante
                        for(j = i-1;j >= 0 && array[j] > current; j--){//El segundo for, comienza del elemento anterior a 1, y en j guarda el elemento, luego los compara
                            array[j+1]=array[j];//si se cumple la condicion, guarda el arreglo a la derecha
                        }
                        array[j+1] = current;
                    }
                    long endTime = System.nanoTime();
                    long tiempo = (endTime - startTime) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempo+" ms");
                    setIntiempo(tiempo);
                    imprimir(array);
                    volver = true;
                    break;
                case 2:
                     double[] arrayDouble = new double[maximo];
                     for(int i=0;i<maximo;i++){
                            arrayDouble[i]=random.nextDouble();
                     }
                     long startTimed = System.nanoTime();
                     for(int i=1;i<arrayDouble.length;i++){//El primer for comienza desde el segundo elemento del arreglo
                        double current = arrayDouble[i];//Guarda ese elemento en current
                        int j;
                        // Mover los elementos mayores que el elemento actual hacia adelante
                        for(j = i-1;j >= 0 && arrayDouble[j] > current; j--){//El segundo for, comienza del elemento anterior a 1, y en j guarda el elemento, luego los compara
                            arrayDouble[j+1]=arrayDouble[j];//si se cumple la condicion, guarda el arreglo a la derecha
                        }
                        arrayDouble[j+1] = current;
                    }
                    long endTimed = System.nanoTime();
                    long tiempod = (endTimed - startTimed) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempod+" ms");
                    setIntiempo(tiempod);
                    imprimirDouble(arrayDouble);
                    volver = true;
                    break;
                case 3:
                     char[] arrayChar = new char[maximo];
                     for(int i=0;i<maximo;i++){
                            arrayChar[i]=(char) (random.nextInt(90-65)+65);
                     }
                     long startTimec = System.nanoTime();
                     for(int i=1;i<arrayChar.length;i++){//El primer for comienza desde el segundo elemento del arreglo
                        char current = arrayChar[i];//Guarda ese elemento en current
                        int j;
                        // Mover los elementos mayores que el elemento actual hacia adelante
                        for(j = i-1;j >= 0 && arrayChar[j] > current; j--){//El segundo for, comienza del elemento anterior a 1, y en j guarda el elemento, luego los compara
                            arrayChar[j+1]=arrayChar[j];//si se cumple la condicion, guarda el arreglo a la derecha
                        }
                        arrayChar[j+1] = current;
                    }
                    long endTimec = System.nanoTime();
                    long tiempoc = (endTimec - startTimec) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempoc+" ms");
                    setIntiempo(tiempoc);
                    imprimirChar(arrayChar);
                    volver = true;
                    break;
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Argunmento no valido.\n");
                    break;
            }
        }while (!volver);
    }
    
    public void imprimir(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void imprimirDouble(double a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void imprimirChar(char a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
    }
    
    }
    public void ordenamientoShellSort(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean volver = false;
        do {
            System.out.println("Elija un tipo de dato.\n");
            System.out.println("1)Enteros.\n");
            System.out.println("2)Double.\n");
            System.out.println("3)Char.\n");
            System.out.println("4)Volver al menu.\n");
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                     int[] array = new int[maximo];
                     for(int i=0;i<maximo;i++){
                            array[i]=random.nextInt(100000);
                     }
                     long startTime = System.nanoTime();
                     int n = array.length;
                     // Inicializamos el tamaño del salto
                     int gap = n / 2;
                     // Realizamos el algoritmo de Shell Sort
                    while (gap > 0) {
                        for (int i = gap; i < n; i++) {
                            int temp = array[i];
                            int j = i;
                             // Insertamos el elemento en la posición correcta
                            while (j >= gap && array[j - gap] > temp) {
                                array[j] = array[j - gap];
                                j -= gap;
                            }
                            array[j] = temp;
                        }
                        // Reducimos el tamaño del salto
                        gap /= 2;
                    }
                    long endTime = System.nanoTime();
                    long tiempo = (endTime - startTime) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempo+" ms");
                    setShelltiempo(tiempo);
                    imprimir(array);
                    volver = true;
                    break;
                case 2:
                    double[] arrayDouble = new double[maximo];
                    for(int i=0;i<maximo;i++){
                        arrayDouble[i]=random.nextDouble();
                    }
                    long startTimed = System.nanoTime();
                    int nd = arrayDouble.length;
                     // Inicializamos el tamaño del salto
                    int gapd = nd / 2;
                     // Realizamos el algoritmo de Shell Sort
                    while (gapd > 0) {
                        for (int i = gapd; i < nd; i++) {
                            double tempd = arrayDouble[i];
                            int j = i;
                             // Insertamos el elemento en la posición correcta
                            while (j >= gapd && arrayDouble[j - gapd] > tempd) {
                                arrayDouble[j] = arrayDouble[j - gapd];
                                j -= gapd;
                            }
                            arrayDouble[j] = tempd;
                        }
                        // Reducimos el tamaño del salto
                        gapd /= 2;
                    }
                    long endTimed = System.nanoTime();
                    long tiempod = (endTimed - startTimed) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempod+" ms");
                    setShelltiempo(tiempod);
                    imprimirDouble(arrayDouble);
                    volver = true;
                    break;
                case 3:
                    char[] arrayChar = new char[maximo];
                    for(int i=0;i<maximo;i++){
                        arrayChar[i]=(char) (random.nextInt(90-65)+65);
                    }
                    long startTimec = System.nanoTime();
                     int nc = arrayChar.length;
                     // Inicializamos el tamaño del salto
                     int gapc = nc / 2;
                     // Realizamos el algoritmo de Shell Sort
                    while (gapc > 0) {
                        for (int i = gapc; i < nc; i++) {
                            char tempc = arrayChar[i];
                            int j = i;
                             // Insertamos el elemento en la posición correcta
                            while (j >= gapc && arrayChar[j - gapc] > tempc) {
                                arrayChar[j] = arrayChar[j - gapc];
                                j -= gapc;
                            }
                            arrayChar[j] = tempc;
                        }
                        // Reducimos el tamaño del salto
                        gapc /= 2;
                    }
                    long endTimec = System.nanoTime();
                    long tiempoc = (endTimec - startTimec) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempoc+" ms");
                    setShelltiempo(tiempoc);
                    imprimirChar(arrayChar);
                    volver = true;
                    break;
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Argunmento no valido.\n");
                    break;
            }
        }while (!volver);
    }
    
    public void ordenamientoQuickSort(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean volver = false;
        do {
            System.out.println("Elija un tipo de dato.\n");
            System.out.println("1)Enteros.\n");
            System.out.println("2)Double.\n");
            System.out.println("3)Char.\n");
            System.out.println("4)Volver al menu.\n");
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    int[] array = new int[maximo];
                    for(int i=0;i<maximo;i++){
                        array[i]=random.nextInt(100000);
                    }
                    long startTime = System.nanoTime();
                    
                    int low = 0;
                    int high = array.length - 1;
                    quickSortInt(array, low, high); 
                    
                    long endTime = System.nanoTime();
                    long tiempo = (endTime - startTime) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempo+" ms");
                    setQuicktiempo(tiempo);
                    imprimir(array);
                    volver = true;
                    break;
                case 2:
                     double[] arrayDouble = new double[maximo];
                     for(int i=0;i<maximo;i++){
                            arrayDouble[i]=random.nextDouble();
                     }
                    long startTimed = System.nanoTime();
                    
                    int lowd = 0;
                    int highd = arrayDouble.length - 1;
                    quickSortDouble(arrayDouble, lowd, highd);
                    
                    long endTimed = System.nanoTime();
                    long tiempod = (endTimed - startTimed) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempod+" ms");
                    setQuicktiempo(tiempod);
                    imprimirDouble(arrayDouble);
                    volver = true;
                    break;
                case 3:
                    char[] arrayChar = new char[maximo];
                    for(int i=0;i<maximo;i++){
                        arrayChar[i]=(char) (random.nextInt(90-65)+65);
                    }
                    long startTimec = System.nanoTime();
                    
                    int lowc = 0;
                    int highc = arrayChar.length - 1;
                    quickSortChar(arrayChar, lowc, highc);
                    
                    long endTimec = System.nanoTime();
                    long tiempoc = (endTimec - startTimec) / 1000000;
                    System.out.println("Tiempo capturado: "+tiempoc+" ms");
                    setQuicktiempo(tiempoc);
                    imprimirChar(arrayChar);
                    volver = true;
                    break;
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Argunmento no valido.\n");
                    break;
            }
        }while (!volver);
    }
    public static void quickSortInt(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionInt(arr, low, high);
            quickSortInt(arr, low, pivotIndex - 1);
            quickSortInt(arr, pivotIndex + 1, high);
        }
    }
    public static void quickSortDouble(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionDouble(arr, low, high);
            quickSortDouble(arr, low, pivotIndex - 1);
            quickSortDouble(arr, pivotIndex + 1, high);
        }
    }
    public static void quickSortChar(char[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionChar(arr, low, high);
            quickSortChar(arr, low, pivotIndex - 1);
            quickSortChar(arr, pivotIndex + 1, high);
        }
    }
    public static int partitionInt(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static int partitionDouble(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static int partitionChar(char[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
