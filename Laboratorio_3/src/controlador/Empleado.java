package controlador;

public class Empleado extends Persona{
     
    private int horasTrabajadas ; 
    private double salarioFinal;
    private double salarioXhora;

    public Empleado() {
    }

    public Empleado(int horasTrabajadas,double salarioxhora ,String cedula, String nombre, String domicilio) {
        super(cedula, nombre, domicilio);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioFinal =0; 
        this.salarioXhora =salarioxhora;
    }

    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioFinal() {
        return this.salarioFinal;
    }

    public double getSalarioXhora() {
        return this.salarioXhora;
    }

    public void setSalarioXhora(double salarioXhora) {
        this.salarioXhora = salarioXhora;
    }
    
    public void salarioFinal (){
        this.salarioFinal = this.salarioXhora*this.horasTrabajadas;
    }
    
}
