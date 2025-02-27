package ejemplo;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    
    // Atributos de la clase (propiedades)
    String nombre;
    String apellido;
    String dni;
    String telefono;
    LocalDate fechaNacimiento;
    
    // Constructores
    public Persona() {
        
    }

    public Persona(String nombre, String apellido, String dni, String telefono, LocalDate fechaNacimiento) {
        super(); //hace referencai al padre de esta clase (herencias)
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // toString()
    
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
                + ", fechaNacimiento=" + fechaNacimiento + "]";
    }
    public boolean esMayorEdad() {      
        //LocalDate edad = LocalDate.now()-this.fechaNacimiento;  // No se puede
        //Duration edad = Duration.between(this.fechaNacimiento, LocalDate.now());  // Si quiero segundos o minutos
        Period edad = Period.between(this.fechaNacimiento, LocalDate.now());  // Quiero años, meses o días
        int anyos = Math.abs(edad.getYears());
        if(anyos>=18)
            return true;
        else
            return false;
        
    }
}