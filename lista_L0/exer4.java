public class exer4{
  public static void main(String args[]){


    int cont = 0;
    int j = 100;

    while(j<=200){
      cont = 0;
      for(int i = 2; i < j; i++){
        if (( j % i) == 0) {
          cont++;
        }
      }

      if ( cont==0 ){
        System.out.println("eh primo "+j);

    }
    j++;

    }
  }

}
