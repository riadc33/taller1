
package taller.poo;


public class DocenteHoraCatedra extends Docente {
    
    private int HorasSemanales;
    private float ValorHoras;
    
    public DocenteHoraCatedra(){
        
    }

    
    

    public DocenteHoraCatedra(int HorasSemanales, float ValorHoras, String Nombre, String Programa, long ID) {
        super(Nombre, Programa, ID);
        this.HorasSemanales = HorasSemanales;
        this.ValorHoras = ValorHoras;
    }

    
 public int getHorasSemanales() {
        return HorasSemanales;
    }

    public void setHorasSemanales(int HorasSemanales) {
        this.HorasSemanales = HorasSemanales;
    }

    public float getValorHoras() {
        return ValorHoras;
    }

    public void setValorHoras(float ValorHoras) {
        this.ValorHoras = ValorHoras;
    }
    @Override
    public  double getcalcularsalariomensual(){
        return(HorasSemanales * ValorHoras * 4);
    }
  }
