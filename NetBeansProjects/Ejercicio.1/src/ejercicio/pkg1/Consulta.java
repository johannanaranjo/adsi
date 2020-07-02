package ejercicio.pkg1;

import static ejercicio.pkg1.Principal.atletas;
import static ejercicio.pkg1.Principal.posicion;    
import java.security.Principal;
import javax.swing.JOptionPane;

public class Consulta {
    
        // Consulta del campeon
    public String consultarDatosCampeon(){
       
        String datosCampeon = "";
        int campeon=0;
        
        if (Principal.posicion<=0){
            datosCampeon = "No ahi atletas registrados";
        }else{
            double menor = Principal.atletas [0].getTiempo ();
            for (int i=0; i<Principal.posicion; i++ ){
                if (Principal.atletas [i].getTiempo()<menor){
                    campeon = i;
                    menor = Principal.atletas  [i].getTiempo ();
                }
            }
            datosCampeon  = ("Atleta campeon\n         " +
                    "\nNombre  " + Principal.atletas [campeon].getNombre()+
                    "\nNacionalidad  " +  Principal.atletas [campeon].getNacionalidad()+
                    "\nMejor Tiempo " +  Principal.atletas [campeon].getTiempo ());
        }
            return datosCampeon;      
        }
   
        // consulta de menor tiempo
    public String consultarTiemposAtleta(){ 

        String listaAtletas = "";

        if (posicion > 0) {
            for (int i = 0; i< atletas.length ; i++) {
                if (i+1<= posicion){
                  listaAtletas += + i+1+" ." + atletas [i].getNombre()+
                    "de " +  atletas [i].getNacionalidad()+
                    "\nTiempo: " +  atletas [i].getTiempo();
                  listaAtletas = " \n                \n";
                }
            }
        }else{ 
            listaAtletas = "No ahi atletas registrados";
        }
            return listaAtletas;
    }
    


        // consultar nacionalidad
    public String consultarAtletasPais (String Nacionalidad){

    String  listaAtletas = "";
    
        if (posicion > 0) {
           for (int i = 0; i < posicion ; i++) {
               
               if (atletas[i].getNacionalidad() != null){
                   if (atletas[i].getNacionalidad().equals(Nacionalidad)){   
                        listaAtletas = listaAtletas + (i + 1) + " . " +  Principal.atletas[i].getNombre()+
                        " de " +  Nacionalidad + "\n  Tiempo: " +  Principal.atletas [i].getTiempo()+"\n";
                   }
                }
           }
        }
        if (listaAtletas.equals(""))  {   
            listaAtletas = "No se encontraron atletas de " + Nacionalidad;       
        }
        return listaAtletas;
    } 
    
    
            // promedio 
    public String consultarAtletasPromedio (){

    double Promedio = 0;
    String tiempoAtletas = "";
    
        if (posicion > 0) {
           for (int i = 0; i < posicion ; i++) {  
                Promedio = Promedio + Principal.atletas [i].getTiempo();
            }
        }
        
            tiempoAtletas = "El promedio de tiempo en los atletas es de " + (Promedio / 2);       
        
        return tiempoAtletas;
    } 
}       



