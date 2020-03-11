public class exer3{
  public static void main(String args[]){


    int cont = 0;

    for(int j = 1; j <= 15; j++){
      for(int i = 1; i <= j; i++){
        if (( j % i) == 0) {
          cont = cont +1;
        }
      }

      if ( cont==2 ){
        System.out.println("eh primo"+j);


    }

    }
  }

}
