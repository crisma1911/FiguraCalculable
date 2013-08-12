package FiguraCalculable;

/**
 * Created with IntelliJ IDEA.
 * User: CristianCardona
 * Date: 5/08/13
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */
public class Cuadrado extends Figura
{
    private double lado;


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double area() {
        return lado*lado;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
