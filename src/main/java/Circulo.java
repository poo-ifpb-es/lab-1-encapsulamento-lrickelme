public class Circulo {
    float raio;
    float area;
    float circunferencia;
    float pi = 3.14159f;
    
    public Circulo(float raio){
        this.raio = raio;
        this.area = area;
        this.circunferencia = circunferencia;
        this.pi = pi;
    }

    public void setRaio(float raio){
        this.raio = raio;
    }

    public float getRaio(){
        return this.raio;
    }

    public void setArea(float area){
        this.circunferencia = area;
    }

    public float getArea(){
        return this.area;
    }
    public void setCircunferencia(float circunferencia){
        this.circunferencia = circunferencia;
    }

    public float getCircunferencia(){
        return this.circunferencia;
    }

}
