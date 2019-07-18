package decorator;

public class AutoElectricoFeature extends AutomovilDecorador{
  

  public AutoElectricoFeature(Automovil auto){
    super(auto);
  }

    @Override
    public void acelerar() {
        System.out.println("Iniciando medidor de velocidad electrico");
        getAuto().acelerar();
    }

    @Override
    public void detenerse() {
        System.out.println("Activando freno electrico");
        getAuto().detenerse();
    }

    @Override
    public void iniciar() {
        System.out.println("Activando inicio electrico");
        getAuto().iniciar();
    }


}