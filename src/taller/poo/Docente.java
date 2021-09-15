
package taller.poo;


public abstract class Docente {
    private String Nombre;
    private String Programa;
    private long ID;
    
public Docente(){
    
}

    public Docente(String Nombre, String Programa, long ID) {
        this.Nombre = Nombre;
        this.Programa = Programa;
        this.ID = ID;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
        
    public abstract double getcalcularsalariomensual();
    
  }

