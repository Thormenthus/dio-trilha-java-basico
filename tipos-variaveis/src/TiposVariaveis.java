public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //estudar a classe String que representa texto na aplicação.

        String meuNome = "Flávio Eduardo";
        
        double salarioMinimo = 1300;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14;
        //double VALOR_DE_PI = 3.14;
        
        //VALOR_DE_PI = 10.15;

        System.out.println("Valor de PI é igual a: " + VALOR_DE_PI);
        System.out.println(meuNome);


    }
}
