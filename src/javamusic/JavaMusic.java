package javamusic;

public class JavaMusic {
    public static void main(String[] args) {
       
        //Creando el cliente
    Cliente Cliente1 = new Cliente("Jose Ramon", "08012001543","9865-4909");
    System.out.println(Cliente1.Hola());
    
    
   //Creamos el artista
   
   Album Artista1 = new Album("JoseJose" , "Baladas" , "Canciones de oro");
   Album Artista2 = new Album("Camilo Sesto" , "Baladas" , "Amor Amor");
    
    Cliente1.nuevacancion (Artista1);
    Cliente1.nuevacancion (Artista2);
    
    System.out.println("Imprimiendo Info Album");
    System.out.println(Artista1.mi_album.IDCliente+"/n");
    
    
    
    }
    

}