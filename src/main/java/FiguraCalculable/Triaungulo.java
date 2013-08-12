package FiguraCalculable;

/**
 * Created with IntelliJ IDEA.
 * User: CristianCardona
 * Date: 5/08/13
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */
public class Triaungulo extends Figura
{

    private double base, altura, lado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return lado + lado + lado;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double area() {
        return (base * altura)/2;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
