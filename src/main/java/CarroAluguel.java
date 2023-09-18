class CarroIndisponivelException extends Exception{
    public CarroIndisponivelException(){
        super("O carro está indisponível.");
    }
}

class CarroDisponivelException extends Exception{
    public CarroDisponivelException(){
        super("O carro está disponível.");
    }
}

class CarroNaoPagoException extends Exception{
    public CarroNaoPagoException(){
        super("O carro não foi pago.");
    }
}

public class CarroAluguel {
    private float valorPorKm;
    private int distancia;
    private boolean disponivel = true;
    private boolean sinistro = false;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    public float getValorPorKm() {
        return valorPorKm;
    }
    public void setValorPorKm(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }
    public int getDistanciaPercorrida() {
        return distancia;
    }
    public void setDistanciaPercorrida(int distancia) {
        this.distancia = distancia;
    }

    void setSinistro (boolean s){
        this.sinistro = s;
    }

    boolean isDisponivel(){
        return this.disponivel;
    }

    boolean hasSinistro(){
        return this.sinistro;
    }

    float getDebito(){
        return this.valorPorKm * this.distancia * (this.sinistro ? 1.6f : 1f);
    }
    
    void alugar() throws CarroIndisponivelException{
        if(this.disponivel){
            this.disponivel = false;
        }
        else throw new CarroIndisponivelException();
    }
    
    void devolver() throws CarroDisponivelException, CarroNaoPagoException{
        if (this.disponivel){
            throw new CarroDisponivelException();
        } 
        if (this.getDebito() != 0){
            throw new CarroNaoPagoException();
        }
        this.sinistro = false;
        this.disponivel = true;
        this.distancia = 0;
    }

    void pagar() throws CarroDisponivelException{
        if(this.disponivel){
            throw new CarroDisponivelException();
        }
        this.distancia = 0;
    }
}
