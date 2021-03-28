package entidade;

public class Peso {

  private final double MERCURIO = 0.37;
  private final double VENUS = 0.88;
  private final double MARTE = 0.38;
  private final double JUPITER = 2.64;
  private final double SATURNO = 1.15;
  private final double URANO = 1.17;
  private String planeta;
  private double pesoTerra;
  private double pesoPlaneta;

  public Peso() {}

  private double getMERCURIO() {
    return MERCURIO;
  }

  private double getVENUS() {
    return VENUS;
  }

  private double getMARTE() {
    return MARTE;
  }

  private double getJUPITER() {
    return JUPITER;
  }

  private double getSATURNO() {
    return SATURNO;
  }

  private double getURANO() {
    return URANO;
  }

  public String getPlaneta() {
    return planeta;
  }

  public void setPlaneta(String planeta) {
    this.planeta = planeta;
  }

  public double getPesoTerra() {
    return pesoTerra;
  }

  public void setPesoTerra(double pesoTerra) {
    this.pesoTerra = pesoTerra;
  }

  public double getPesoPlaneta() {
    return pesoPlaneta;
  }

  public void setPesoPlaneta(double pesoPlaneta) {
    this.pesoPlaneta = pesoPlaneta;
  }

  public void pesar(int escolha) {

    double g = 0;

    switch (escolha) {
      case 1:
      this.setPlaneta("MERCÚRIO");
        g = this.getMERCURIO();
        break;
      case 2:
        g = this.getVENUS();
        this.setPlaneta("VÊNUS");
        break;
      case 3:
        g = this.getMARTE();
        this.setPlaneta("MARTE");
        break;
      case 4:
        g = this.getJUPITER();
        this.setPlaneta("JÚPITER");
        break;
      case 5:
        g = this.getSATURNO();
        this.setPlaneta("SATURNO");
        break;
      case 6:
        g = this.getURANO();
        this.setPlaneta("URANO");
        break;
    }

   this.setPesoPlaneta((this.getPesoTerra() / 10) * g);
  }
  
  public String toString(){
    return"\nSeu Peso em "+this.getPlaneta()+" é "+ String.format("%.2f",this.getPesoPlaneta())+" kg";
    
  }
}
