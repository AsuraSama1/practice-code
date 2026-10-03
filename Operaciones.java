public class Operaciones {

    public float sumar;
    public float restar;
    public float multiplicar;
    public float dividir;

    public Operaciones(float sumar, float restar, float multiplicar, float dividir){
        this.sumar = sumar;
        this.restar = restar;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }

    public static float sumar(float a, float b){
        return a + b;
    }

}