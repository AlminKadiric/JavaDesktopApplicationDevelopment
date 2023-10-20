package regexdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        //regeX izraz

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                String regexInput = scanner.nextLine();
                Pattern pattern = Pattern.compile(regexInput);
                System.out.println("Unesite tekst koji zelite testirati.");
                String text = scanner.nextLine();
                Matcher matcher = pattern.matcher(text);
                boolean foundIt = false;
                while (matcher.find()) {

                    String dioTekstaKojiPratiPattern = matcher.group();
                    int startIndex = matcher.start();
                    int endIndex = matcher.end();
                    System.out.format("Pronasao sam tekst %s na startnoj poziciji %d koji zavrsava na poziciji %d%n",dioTekstaKojiPratiPattern,startIndex,endIndex);
                    foundIt=true;


                }
                if(!foundIt){
                    System.out.format("Nema dijela teksta koji zadovaljava uslov. %n");
                }


            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }




    }
}
