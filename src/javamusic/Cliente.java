package javamusic;
import java.util.ArrayList;   
import java.util.List;
   
public class Cliente {
   String NombreCliente; 
   String IDCliente;
   String Telefono;
 
List <Album> albums;

    public Cliente(String NombreCliente, String IDCliente, String Telefono) {
      
        this.NombreCliente = NombreCliente;
        this.IDCliente = IDCliente;
        this.Telefono = Telefono;
        this.albums = new ArrayList<Album>();
    }

   public String Hola(){
       String saludo = "Hola! Mi nombre es "+ this.NombreCliente + " mi ID es " +this.IDCliente + " y estoy correctamente suscrito." + "/n" ;
       return saludo;
   }
   
    public void nuevacancion (Album nuevacancion){
       nuevacancion.mi_album = this;
       this.albums.add(nuevacancion) ;
       
   }
   
     public void MiAlbum(Cliente mi_album){
      this.mi_album = mi_album;
               }
    }
   
  
   
   
   
   
   
   

