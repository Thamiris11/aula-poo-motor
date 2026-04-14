public class Main {
    public static void main(String[] args) {

        motor mo = new motor(250);

        carro car = new carro("Volkswagen","Gol", 2021, mo );

        car.exibirInfo();

    }
}