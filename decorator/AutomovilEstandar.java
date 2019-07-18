package decorator;

public class AutomovilEstandar implements Automovil {

  private String nombre;

  public AutomovilEstandar(String auto){
    this.nombre = auto;
  }

    @Override
    public void acelerar() {
        System.out.println("Ascelerando");
    }

    @Override
    public void detenerse() {
        System.out.println("Frenando");
    }

    @Override
    public void iniciar() {
        System.out.println("Encendiendo");
    }


}