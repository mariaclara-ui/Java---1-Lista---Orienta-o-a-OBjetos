package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_10;

public class att_10_termometro {
    public double tempeCelcios;
    public double Fahrenheit;
    public double Kelvin;

    void ConvertendoFahrenheit(){
        Fahrenheit=(tempeCelcios*1.8)+32;
        System.out.println("A temperatura convertida para fahrenheit será "+Fahrenheit);
    }
    void ConvertendoKelvin(){
        Kelvin = tempeCelcios + 273;
        System.out.println("A temperatura convertida para kelvin será "+Kelvin);
    }
}
