public class motor {
    double potencia;

    public motor(double potencia) {
        this.potencia = potencia;
    }
}
class carro {
    String modelo;
    String marca;
    int ano;
    motor motor;

    public carro(String modelo, String marca, int ano,  motor motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.motor = motor;
    }
    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Potência do Motor: " + motor.potencia);
    }
    public void exibirPotenciaM(){
        System.out.println("Potencia do Motor: " + motor.potencia);
    }
}
