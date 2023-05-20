package controlador;

public class Persona {
    protected String cedula ; 
    protected String nombre ;  
    protected String domicilio;  

    public Persona() {
    }

    public Persona(String cedula, String nombre, String domicilio) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
