
package taller.poo;


public class DocenteTerminoFijo extends  Docente {
     private String tipo;
    private double SueldoMensual;
    private double Descuento;
    private double DescuentoAdicional;

    public DocenteTerminoFijo() {
        
    }

    public DocenteTerminoFijo(String tipo, double SueldoMensual, double Descuento, double DescuentoAdicional, String Nombre, String Programa, long ID) {
        super(Nombre, Programa, ID);
        this.tipo = tipo;
        this.SueldoMensual = SueldoMensual;
        this.Descuento = Descuento;
        this.DescuentoAdicional = DescuentoAdicional;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSueldoMensual() {
        return SueldoMensual;
    }

    public void setSueldoMensual(double SueldoMensual) {
        this.SueldoMensual = SueldoMensual;
    }

    public double getDescuento() {
        return Descuento;
    }
    

    public void setDescuento(float Descuento) {
        this.Descuento = Descuento;
    }
    public double getDescuentoAdicional() {
        return DescuentoAdicional;
    }
    @Override
    public double getcalcularsalariomensual(){
        return(SueldoMensual-(SueldoMensual*(Descuento/100))-DescuentoAdicional);
    }

    
 }

   
 

    
    
    
    
    
    

