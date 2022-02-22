
package farmacia;
import java.util.Scanner;

public class remedios_marca {
    Scanner ler = new Scanner(System.in); 
    String marca;
    
    public remedios_marca(double valor, String marca){
        System.out.println("qual a marca do remedio: ");
        marca = ler.next();
        
        System.out.println("qual o preco do remedio "+marca+":");
        valor = ler.nextDouble();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
