
package taller.poo;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args){
        
        
        Docente d1 = new DocenteTerminoFijo("Administrativo",2000000,8,75000,"Israel Escobar","Ingenieria de Sistema",72727272);
        
        Docente d2 = new DocenteTerminoFijo("Medio Tiempo",1450000,8,0,"Dollys Padilla","Ingenieria de Sistema",32323232);
       
        Docente d3 = new DocenteTerminoFijo("Tiempo Completo",2550000,8,42500,"Douglas Hurtado","Direccion de Investigaciones",929292929);
        
        Docente d4 = new DocenteHoraCatedra(12,35000,"Joel Maza","Tecnologia en Desarrollo de Software",100100100);
       
        JOptionPane.showMessageDialog(null,
                "Docente:"+d1.getNombre()+
                "\nIdentificacion:"+d1.getID()+
                "\nPrograma o Departamento:"+d1.getPrograma()+
                "\nsalario:"+d1.getcalcularsalariomensual() +
                        "\n"+
                        "\n"+
        
                "Docente:"+d2.getNombre()+
                "\nIdentificacion:"+d2.getID()+
                "\nPrograma o Departamento:"+d2.getPrograma()+
                "\nsalario:"+d2.getcalcularsalariomensual()+
                        "\n"+
                        "\n"+
               "Docente:"+d3.getNombre()+
                "\nIdentificacion:"+d3.getID()+
                "\nPrograma o Departamento:"+d3.getPrograma()+
                "\nsalario:"+d3.getcalcularsalariomensual()+
                        "\n"+
                        "\n"+
               "Docente:"+d4.getNombre()+
                "\nIdentificacion:"+d4.getID()+
                "\nPrograma o Departamento:"+d4.getPrograma()+
                "\nsalario:"+d4.getcalcularsalariomensual()
               
        );
        
    }
    
}
