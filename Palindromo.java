import java.util.Scanner;

public class Palindromo {
    public static boolean esPalindromo(String cadena){
        cadena= cadena.replaceAll(" ", "").toLowerCase();
        String reverso = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(reverso);
    }
    public static void main(String[] args){
        System.out.println( "ingrsa una palabra para ver si es un palindromo:");
        Scanner scanner = new Scanner(System.in);
        String palabrau= scanner.nextLine();

        if (esPalindromo(palabrau)){
            System.out.println(STR."\{palabrau}, es un palindromo");
        }else{
            System.out.println(STR."\{palabrau}, no es un palindromo");
        }
    }
}
