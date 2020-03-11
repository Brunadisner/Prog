public class exer3{
  public static void main(String args[]){


    int cont = 0;
    int n = 0;
    int j = 2;

    while(n<=15){
      cont = 0;
      for(int i = 2; i < j; i++){
        if (( j % i) == 0) {
          cont++;
        }
      }

      if ( cont==0 ){
        System.out.println("eh primo "+j);
        n++;


    }
    j++;

    }
  }

}
