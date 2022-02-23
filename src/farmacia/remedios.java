package farmacia;

public class remedios {

    String nome;
    double valor;

    public String nome(String nome1) {
        nome1 = "Aspirina";
        System.out.println("nome do remedio generico 1: " + nome1);
        return null;

       

    }

    public String nome2(String nome2) {
        nome2 = "atomoxetina";

        System.out.println("nome do remedio generico 1: " + nome2);

        return nome2;

    }

    public String nome3(String nome3) {
        nome3 = "captopril";
        System.out.println("digite o nome do remedio generico 3: ");

        return nome3;
    }

    public double preco1(double preco1) {
        preco1 = 80.00;
        System.out.println("preco do remedio 1: " + preco1);

        return preco1;
    }

    public double preco2(double preco2) {
        preco2 = 100.00;
        System.out.println("preco do remedio 2: " + preco2);
        return 0;
        

        
    }

    public double preco3(double preco3) {
        preco3 = 120.00;
        System.out.println("preco do remedio 3: " + preco3);

        return preco3;
    }

    remedios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
