// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println("Enter the another number");
    int m = sc.nextInt();

    if(n==m){
      System.out.println("Both are equal");
    }else{
      if(n > m){
        System.out.println("n is greater");
      }else{
        System.out.println("m is greater");
      }
    }  
    
    sc.close();

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}