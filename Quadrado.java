public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    


    @Override
    public double obterArea() {   
        lado = getLado() * getLado();
        return lado * lado;   
    }


    @Override
    public double obterVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("nao tem objetos com volume, eles são 2d");
    }



    public double getLado() {
        return lado;
    }



    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
