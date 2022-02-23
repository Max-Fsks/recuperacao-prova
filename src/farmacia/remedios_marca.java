
package farmacia;


public class remedios_marca extends remedios {
   
    String marca;
    
    public String marca1 (String marca1){
        marca1 = "Neo Quimica";
        System.out.println("marca do remedio 1: "+ marca1);
        
        return marca1;
    }
    
     public String marca2 (String marca2){
        marca2 = "Teuto Brasileiro";
        System.out.println("marca do remedio 2: "+marca2);
        
        return marca2;
    }
     
    public String marca3 (String marca3){
        marca3 = "EMS Pharma";
        
        System.out.println("marca do remedio 3: "+marca3);
       
        return marca3;
    }

    remedios_marca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
