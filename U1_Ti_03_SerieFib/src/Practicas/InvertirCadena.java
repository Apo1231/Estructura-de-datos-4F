package Practicas;

public class InvertirCadena {
    static String resultado = "";

    public static void invertirRecursiva(String s) {
        if (s.length() == 0) {
            System.out.println("Cadena invertida: " + resultado);
            return;
        }
        resultado = resultado + s.charAt(s.length() - 1);
        invertirRecursiva(s.substring(0, s.length() - 1));
    }}

