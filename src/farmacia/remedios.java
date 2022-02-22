
package farmacia;
import java.util.Scanner;

public class remedios {
    Scanner ler = new Scanner(System.in);
    String nome;
    double valor;

    public remedios (String nome, double valor){
        for(int n =1; n < 3;n++){
    
        System.out.println("qual valor do "+n+" remedio generico: ");
       }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
