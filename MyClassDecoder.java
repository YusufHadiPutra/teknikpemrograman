import java.util.Scanner; // import the Scanner class 

public class MyClassDecoder {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    String coba;
    
    // Enter username and press Enter
    System.out.println("Masukkan Kata :");
    userName = myObj.nextLine();   
    coba = userName.replaceAll("[aeiou]","");
       
    System.out.println("Hasilnya adalah : " + coba);
  }
}