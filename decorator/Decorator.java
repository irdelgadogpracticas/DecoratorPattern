package decorator;


/**
 *
 * @author Acer
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("CARRO ESTANDAR ");
        Automovil carro = new AutomovilEstandar("Chevrolet");
        carro.iniciar();
        carro.acelerar();
        carro.detenerse();
        System.out.println("CARRO ELECTRICO");
        carro = new AutoElectricoFeature(carro);
        carro.iniciar();
        carro.acelerar();
        carro.detenerse();
        
    }
    
}


