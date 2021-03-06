package javamusic;
import java.util.ArrayList;
import java.util.List;
public class Artista {
    String NombreArtista;
    String Genero;
    String AlbumArtista;
    
    List<Album> albumsa; // playlist especial
   
    public void Artist (String NombreArtista){
        albumsa = new ArrayList<Album>();
        this.NombreArtista = NombreArtista;
    }
    
    
    
}
