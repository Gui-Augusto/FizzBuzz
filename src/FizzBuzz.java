import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Ate onde os numeros vao?");
        int numeroMaximoDaLista = reader.nextInt();

        List<Integer> listaNumeros = obterNumeros(numeroMaximoDaLista);

        List<Object> listaProcessada = processarLista(listaNumeros);

        for (Object processada : listaProcessada
        ) {
            System.out.print(processada+", ");
        }


    }

    public static List<Integer> obterNumeros(int N) {

        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 1; i <= N; i++) {

            listaNumeros.add(i);

        }

        return listaNumeros;


    }

    public static List<Object> processarLista(List<Integer> listaNumeros) {
        Object aux;
        List<Object> listaProcessada = new ArrayList<>();
        for (int processada : listaNumeros
        ) {
            if (processada % 3 == 0 & processada % 5 == 0) {
                aux = "FizzBuzz";
            } else if (processada % 5 == 0) {
                aux = "Buzz";
            } else if (processada % 3 == 0) {
                aux = "Fizz";
            } else {
                aux = processada;
            }

            listaProcessada.add(aux);

        }

        return listaProcessada;


    }
}


