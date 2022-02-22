
package farmacia;


public class remedios_marca extends remedios {
    private String marca; 

    public remedios_marca(String nome, double valor, String marca) {
        super(nome, valor);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
