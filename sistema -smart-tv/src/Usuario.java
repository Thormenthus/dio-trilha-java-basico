public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal está sintonizado? " + smartTv.canal);
        System.out.println("Qual o volume atual da tv? " + smartTv.volume);

        smartTv.diminuirVolume();

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        smartTv.mudarCanal(21);
        smartTv.mudarCanal(10);

        smartTv.ligar();
        System.out.println("Chamando o método ligar -> Tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Chamando o método desligar -> Tv está ligada? " + smartTv.ligada);

    }
}
