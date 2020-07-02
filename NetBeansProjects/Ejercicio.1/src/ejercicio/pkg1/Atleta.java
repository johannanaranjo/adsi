
package ejercicio.pkg1;

import java.util.logging.Logger;

/**
 * @author Johanna Naranjo para el sena
 */
public class Atleta {
    // Declaracion de variables 
    
    String Nombre;
    String Nacionalidad;
    double tiempo;  
    //constructores
    public Atleta(String Nombre, String Nacionalidad, double tiempo) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.tiempo = tiempo;
    }
    //Metodos 
    public String getNombre() {
        return Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
 
}

