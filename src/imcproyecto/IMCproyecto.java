package imcproyecto;

/**
 *
 * @author Federico Bornachera
 */
public class IMCproyecto {
    
    public IMCproyecto(){
 
    }

    public double resultadoIMC(double peso, double estatura){
        double resultado = peso/Math.pow(estatura,2);
        return resultado;
        
    }
    
    public String obsIMC(double IMC){
    
        String diagnostico = "";
        if (IMC<15){
            diagnostico = "Delgadez muy severa";
        }else if(IMC <=15.9){
            diagnostico = "Delgadez severa";
        }else if(IMC <=18.4){
            diagnostico = "Delgadez";
        }else if(IMC <=24.9){
            diagnostico = "Peso saludable";
        }else if(IMC <=30){
            diagnostico = "Sobrepeso";
        }else if(IMC <=40){
            diagnostico = "Obesidad Severa";
        }else{
            diagnostico = "Obesidad Morvida y !Perturvadora¡";
        }
        
        return diagnostico;
        
    }
    
}
