public class exer1{
  public static void main(String args[]){

    int n = 1;
    int i = 1;
    System.out.println(n+ " Java atrapalha muita gente");
    while(n<=5){
      System.out.print((n+1) + " Java ");

      for ( i=0;i<=n; i++){
        System.out.print("atrapalham ");
      }
      System.out.println("muita gente ");
      n++;
    }

  }
}
