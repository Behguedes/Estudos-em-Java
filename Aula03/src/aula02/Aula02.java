package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // cria o objeto, a classe tem q ir na frente e depois tambem
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
