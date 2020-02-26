import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] argc)throws Exception{
        String[] tab = fromTxtToTab();
        int i = 0;
        while(tab.length > i && czyPolpierwsza(tab[i])==false) {
            i++;
        }
        if(i<tab.length) {
            int max = Integer.parseInt(tab[i], 2);
            int min = Integer.parseInt(tab[i], 2);
            for (i++; i < tab.length; i++) {
                int dzieisietna = Integer.parseInt(tab[i], 2);
                if (czyPolpierwsza(tab[i]) == true) {
                    if (dzieisietna > max)
                        max = dzieisietna;
                    if (dzieisietna < min)
                        min = dzieisietna;
                }
            }
            System.out.println(min + " " + max);
        }else
            System.out.print("Nie ma liczb polpierwszych");

    }
    public static String[] fromTxtToTab()throws Exception{
        Scanner scanner = new Scanner(new File("C://Users//Spinarak//Desktop//dane//63//ciagi.txt"));
        String[]tab = new String[1000];
        for(int i = 0; i< 1000;i++){
            tab[i] = scanner.next();
        }
        return tab;
    }
    public static boolean czyDwucykliczny(String ciag){
        if(ciag.length() % 2 != 0)
            return false;
        int polowa = ciag.length()/2;
        return ciag.substring(0, polowa).equals(ciag.substring(polowa, ciag.length()));
        /*for(int i=0; i<polowa; i++) {
            if (ciag.charAt(i) != ciag.charAt(polowa + i))
                return false;
        }
        return true;*/
    }
    public static boolean czyDwieJedynki(String ciag){
        for(int i=0; i+1<ciag.length(); i++){
            if(ciag.charAt(i) == '1' && ciag.charAt(i+1) == '1'){
                return true;
            }
        }
        return false;
    }
    public static boolean czyPolpierwsza(String ciag){
        int dziesietna = 0;
        int dzielnik = 2;
        int ileDzielnikow = 0;
        dziesietna = Integer.parseInt(ciag,2);
        while(dziesietna > 1){
            if(dziesietna % dzielnik != 0)
                dzielnik += 1;
            else {
                dziesietna = dziesietna / dzielnik;
                ileDzielnikow += 1;
                if(ileDzielnikow > 2)
                    break;
            }
        }
        return ileDzielnikow == 2;
    }

}//dokonczyc
