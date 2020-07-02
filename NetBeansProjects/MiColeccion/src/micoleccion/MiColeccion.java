
package micoleccion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johanna Naranjo
 */
public class MiColeccion {
    ArrayList<Integer> Coleccion = new ArrayList<Integer>();
 
    public MiColeccion() {
    }
    // insertar al final cuando agregue aumentara a la derecha
    public void insertarAlFinal(int valor){  
        Coleccion.add(valor);
    }
    // insertar al principio se agrega cero para aumentar a la izquierda
    public void insertarAlPrincipio(int valor){
        Coleccion.add(0,valor);
    }
    //Método que nos permite añadir una colección al final o en un punto en concreto de un ArrayList. addAll
    public void agregarAlFinal(ArrayList lista){  
        Coleccion.addAll(lista);
    }
    //Imprimir o mostrar  coleccion
    public void mostrarContenido() {  
        System.out.println(Coleccion);
    }
    //Eliminar int posicion se ingresa metodo remove
    public void eliminar(int posicion){  
        Coleccion.remove(posicion);
    }
    //metodo set valor agregar entero posicion valor
     public void setValor(int posicion, int valor){  
        Coleccion.add(posicion, valor);
    }
    //metodo set valor agregar entero posicion valor
     public int getValor(int posicion){  
         int valor = Coleccion.get(posicion);
            return valor;
    }
    //metodo para sumar
     public int getSumatoria(){         
         int sumatoria = 0;
         for (int i = 0; i<Coleccion.size(); i++){
         sumatoria = sumatoria + Coleccion.get(i);
         }
         return sumatoria;
    }
    //metodo para sacar promedio
       public double getPromedio(){         
         double promedio = 0;
         for (int i = 0; i<Coleccion.size(); i++){
         promedio = promedio + Coleccion.get(i);
         }
         promedio = promedio / Coleccion.size();
         return  promedio;
    }
    // contar elementos
       public int cuentaElementos(){
           return Coleccion.size();
       }
    // cuentaCeros
       public int cuentaCeros(){
        int ceros = 0;
         for (int i = 0; i<Coleccion.size(); i++){
             if (Coleccion.get(i) == 0){
                 ceros++;
             }
         }    
        return ceros;
       }
    // metodo para sumar pares
       public int sumaPares(){
        int pares = 0;
         for (int i = 0; i<Coleccion.size(); i++){
             if (Coleccion.get(i) % 2 == 0){
                 pares = pares + Coleccion.get(i);
             }
         }    
        return pares;
       }
    // metodo para   contar repeticiones
        public int cuentaRepeticiones(int numero){
         int cantidad = 0;
            for (int i = 0; i<Coleccion.size(); i++){
             if (Coleccion.get(i) == numero){
                 cantidad++;
             }
         }    
        return cantidad;
       }
    // metodo reemplazarValor
        public void reemplazarValor(int antiguoValor, int nuevoValor){
          int cantidad = 0;
            for (int i = 0; i<Coleccion.size(); i++){
             if (Coleccion.get(i) == antiguoValor){
                 Coleccion.set (i, nuevoValor); 
             }
         }    
       }
    // metodo remplazar todo  reemplazarTodo
        public void reemplazarTodo(List a){
          Coleccion.clear();
          Coleccion.addAll(a);
        }
   // metodo para invertir 
        public ArrayList invertir(){
            ArrayList lista1 = new ArrayList();
              for (int i = (Coleccion.size()-1); i>=0; i--){
                lista1.add(Coleccion.get(i));
        }
        return lista1;
        }
// metodo para mostrar el mayor  getMayor
   public int getMayor(){
         int mayor = Coleccion.get(0);
            for (int i = 0; i<Coleccion.size(); i++){
             if (Coleccion.get(i)> mayor ){
                 mayor = Coleccion.get(i);
             }
         }    
        return mayor;
       }
   // metodo menor
     public int getMenor(){
         int menor = Coleccion.get(0);
            for (int i = 0; i<Coleccion.size(); i++){
             if (Coleccion.get(i)< menor ){
                 menor = Coleccion.get(i);
             }
         }    
        return menor;
       }
    // metodo  getPrimeros
      public ArrayList getPrimeros(int cantidad){
            ArrayList lista1 = new ArrayList();
            if(cantidad < Coleccion.size()){
              for (int i = 0; i < cantidad; i++){
                lista1.add(Coleccion.get(i));
            } 
              } 
            else {
                System.out.println("supera el arreglo");
                }
        return lista1;
        }
    // metodo getUltimos    
      public ArrayList getUltimos  (int cantidad){
            ArrayList lista1 = new ArrayList();
            if(cantidad < Coleccion.size()){
              for (int i = 0; i < cantidad; i++){
                lista1.add(Coleccion.get(Coleccion.size()-cantidad+1));
            } 
              } 
            else {
                System.out.println("supera el arreglo");
                }
        return lista1;
        }
    // metodo esPalindrome
      public boolean esPalindrome(){
        boolean estado = true;  
        for (int i = 0; i < (Coleccion.size()/2); i++){
          if (Coleccion.get(i) != Coleccion.get(Coleccion.size() - i -1) ){
              estado = false;
          }
        }       
        return estado;
      }
    // medoto buscar
       public boolean buscar(int numero){
        boolean estado = false;  
        for (int i = 0; i < Coleccion.size(); i++){
          if (Coleccion.get(i) == numero ){
              estado = true;
          }
        }       
        return estado;
      }
}  

