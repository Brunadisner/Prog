public class Data{
  public int dia;
  public int mes;
  public int hora;
  public int minuto;
  public int segundo;


  public void imprimi(){
    System.out.println("Dia: "+ this.dia);
    System.out.println("Mes: "+ this.mes);
    System.out.println("Hora: "+ this.hora);
    System.out.println("Minuto: "+ this.minuto);
    System.out.println("Segundo: "+ this.segundo);
  }

  public void imprimi_hora(){
    if (this.hora <= 12){
      System.out.println("AM");
    }
    if (this.hora > 12){
      System.out.println("PM");

    }
  }
}
