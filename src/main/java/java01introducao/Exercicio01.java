package java01introducao;

public class Exercicio01 {

    public static void main(String[] args) {
        //Exercícios:

        //1.  Imprima todos os números de 150 a 300.
        imprimirNumeros150a300();

        //2.  Imprima a soma de 1 até 1000.
        imprimirSoma1ate1000();

        //3.  Imprima todos os múltiplos de 3, entre 1 e 100.
        imprimirMultiposde3ate100();

        //4.  Imprima os fatoriais de 1 a 10.
        imprimirFatoriais1a10();

        //5. Faça um laço que calcule a soma das potencias (de 1 até 10) de 15.
        // Exemplo: 15^1 + 15^2 ... 15^10.
        imprimirSomaPotenciasDe15();

        /*6. No código do exercício anterior, aumente a quantidade de números que terão os fatoriais
        impressos, até 20, 30, 40. Em um determinado momento, além desse cálculo  demorar,
        vai  começar  a mostrar respostas completamente erradas. Por quê?
        Mude de  int  para  long  para ver alguma mudança.*/
        imprimirFatoriaisAte20();

        /*7. Imprima  os  primeiros  números  da  série  de  Fibonacci  até  passar  de  100.
        A  série  de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la,
        o primeiro elemento vale 0, o segundo vale 1, daí por diante, o n-ésimo elemento
        vale o  (n-1)-ésimo elemento somado ao  (n-2)-ésimo elemento (ex: 8 = 5 + 3).*/
        imprimirFibonacci();

    }

    private static void imprimirFibonacci() {

        int fibo = 0;
        int count = 0;
        do {
            fibo = fibonacci(++count);
            System.out.println("Fibo de "+count+" = "+fibo);
        }while (fibo < 100);
        System.out.println("-------------------------");
    }

    private static void imprimirSomaPotenciasDe15() {
        System.out.println("imprimirSomaPotenciasDe15:");

        long somaPotencias = 0;
        for (int i = 1; i <= 10; i++) {
            somaPotencias =+ potencia(15, i);
        }

        System.out.println("Soma das potências de 15: "+ somaPotencias);
        System.out.println("-------------------------");
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int fibo = fibonacci(n - 1) + fibonacci(n - 2);
            return fibo;
        }
    }

    private static void imprimirFatoriaisAte20() {

        System.out.println("imprimirFatoriaisAte20: ");

        int entrada = 20;

        //Trocando para long para não estourar o int
        long fatorial = 0;
        for( int i = 0; i <= entrada; i++ ) {
            if(i <= 1){
                fatorial = 1;
            }else{
                fatorial *= i;
            }
            System.out.println(i + "!: " + fatorial);
        }
        System.out.println("-------------------------");

    }

    //Cálculo de potência
    private static long potencia(int x, int potencia) {

        //Atenção, se não for long em potências de 16 já estoura o limite do INT
        long resultado = 1;

        for(int i = 1; i <= potencia; i++ ) {
            resultado *= x;
        }

        System.out.println("(" + x + ") elevado na "+ potencia +" = " + resultado);

        return resultado;
    }

    private static void imprimirFatoriais1a10() {

        System.out.println("imprimirFatoriais1a10: ");

        int entrada = 10;

        int fatorial = 0;
        for( int i = 0; i <= entrada; i++ ) {
            if(i <= 1){
                fatorial = 1;
            }else{
                fatorial *= i;
            }
            System.out.println(i + "!: " + fatorial);
        }
        System.out.println("-------------------------");

    }

    private static void imprimirMultiposde3ate100() {

        System.out.println("imprimirMultiposde3ate100: ");

        for (int i = 1; i <= 100; i++) {

            boolean isMultiplo = (i % 3 == 0);

            if(isMultiplo){
                System.out.println("Múltiplo de 3: "+ i);
            }
        }
        System.out.println("-------------------------");

    }

    private static void imprimirSoma1ate1000() {

        System.out.println("imprimirSoma1ate1000: ");

        //Atenção para o <= pois se não ficará em 999
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
            System.out.println("i = "+ i + "-> " + soma);
        }
        System.out.println("-------------------------");

    }

    private static void imprimirNumeros150a300() {

        System.out.println("imprimirNumeros150a300: ");
        //Atenção para o <= pois se não ficará em 299
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
    }
}
