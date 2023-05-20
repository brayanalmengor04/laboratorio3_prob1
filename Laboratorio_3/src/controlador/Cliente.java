package controlador;

public class Cliente extends Persona {
    private double limiteCredito ;  
    
    public Cliente() {}

    public Cliente(double limiteCredito, String cedula, String nombre, String domicilio) {
        super(cedula, nombre, domicilio);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    
   
}
