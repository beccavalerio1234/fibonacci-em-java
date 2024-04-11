public class Prova {
    public static void main(String[] args) {
        int n = 10; // Número de termos da sequência que você deseja imprimir
        System.out.println("Sequência de Fibonacci com " + n + " termos:");
        printFibonacci(n);
    }
    
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}