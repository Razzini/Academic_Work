import java.io.*;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("expressao.txt"));
 
  while (br.ready()) {
   String cadeia = br.readLine();

   if (cadeia.length() > 100) {
    System.out.println("Numero de caracteres maior que 100");
   } else {
    Pattern patternLetras = Pattern.compile("0*(110)*1{1}0+");
    
    Matcher match = patternLetras.matcher(cadeia);

    if (cadeia.equals("0110") || cadeia.equals("01101")) {
        System.out.println("A cadeia " + cadeia + " não é valida");
        cadeia = br.readLine();
        if(cadeia == null){
            return;
        }
    } //Solução 1
    if (match.find()) {
     System.out.println("A cadeia " + cadeia + " é valida");
    } else {
     System.out.println("A cadeia " + cadeia + " não é valida");
    }
   }

  }
  br.close();
 }
}