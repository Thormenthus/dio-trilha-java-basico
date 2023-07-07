public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "Java";

        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + "1" + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // OPERADOR TERNÁRIO

        int a, b;
        a = 20;
        b = 20;

        String resultado = a == b ? "Verdadeiro" : "Falso";
        // if(a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "Falso";
        System.out.println(resultado);
    }
}
