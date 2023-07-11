public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("VocÊ mudou para o canal: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Você subiu para o canal: " + canal);
    }

    public void diminuirCanal() {
        if (canal == 0) {
            System.out.println("Você está no canal 0 e não pode voltar mais canais.");
        } else {
            canal--;
            System.out.println("Você voltou para o canal: " + canal);
        }
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        if (volume == 0) {
            System.out.println("A televisão está no mudo.");
        } else {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}