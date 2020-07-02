
package ejercicio.pkg1;

/**
 * @author Johanna Naranjo
 */

 import javax.swing.JOptionPane;

public class Principal {

         // Declaracion de variables
       
        public static Atleta atletas[] = new Atleta[10]; 
        public static int posicion = 0;
        public static void main (String[] args) {
           
           mostrarMenuPrincipal();
         
}
        // Menú principal
        public static void mostrarMenuPrincipal(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null," Competencia \n" +
            "1. Registrar Atleta \n" + "2. Datos del campeon \n" + "3. Atletas por país \n" +
            "4. Tiempo promedio de todos los atletas \n" + "5. Salir"));
        Consulta competencia = new Consulta();
        switch (opcion){
            
            case 1: 
                    registrarAtleta();
                    break;
            case 2:
                    JOptionPane.showMessageDialog(null,competencia.consultarDatosCampeon());
                    mostrarMenuPrincipal();
                    break;
            case 3:
                    String Nacionalidad = JOptionPane.showInputDialog(null,"Buscar por Nacionalidad");
                    JOptionPane.showMessageDialog(null,competencia.consultarAtletasPais(Nacionalidad));
                    mostrarMenuPrincipal();
                    break;
            case 4:
                    JOptionPane.showMessageDialog(null,competencia.consultarAtletasPromedio());
                    mostrarMenuPrincipal();
                    break;
            case 5:
                   System.exit(0);
                  
                    break;
            default:
                    mostrarMenuPrincipal();
                       
        }       
    }
//registro de atletas 
 public static void registrarAtleta() {
     int num = posicion + 1;
     String Nombre  = JOptionPane.showInputDialog(null,"Ingrese Nombre del Atleta # " + num+ " :");
     String Nacionalidad = JOptionPane.showInputDialog(null,"Ingrese Nacionalidad ");
     Double Tiempo  = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Tiempo: "));
    
     atletas  [posicion ] = new Atleta (Nombre,Nacionalidad,Tiempo);
    
     
    JOptionPane.showMessageDialog(null," El Atleta " +Nombre+ " de " +Nacionalidad+ " Fue registrado con exito ");
    
posicion++;

mostrarMenuPrincipal();
     
 }


 }
    
