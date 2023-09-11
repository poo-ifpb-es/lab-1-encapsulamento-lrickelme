public class Circulo {
    float raio;
    float area;
    float circunferencia;
    float pi = 3.14159f;
    
    public Circulo(float raio){
        this.raio = raio;
        
    }

    public float getRaio(){
        return this.raio;
    }

    public float getCircunferencia(){
        return (2 * pi * raio);
    }

    public float getArea(){
        return (pi * this.raio*this.raio);
    }

    public void setRaio(float raio){
        this.raio = raio;
    }

    

    

    

}
