package javamusic;
public class Album {
    String Artista;
    String Cancion;
    String AnioAlbum;
    
   Cliente mi_album;

    public Album(String Artista, String Cancion, String AnioAlbum, Cliente mi_album) {
        this.Artista = Artista;
        this.Cancion = Cancion;
        this.AnioAlbum = AnioAlbum;
        this.mi_album = mi_album;
    }

    Album(String joseJose, String baladas, String canciones_de_oro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public void AdquirirAlbum (Cliente mi_album){
        this.mi_album = mi_album;
        
        
    }
    
    
    
    
    
}