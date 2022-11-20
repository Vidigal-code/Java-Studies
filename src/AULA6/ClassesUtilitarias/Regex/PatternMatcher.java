package AULA6.ClassesUtilitarias.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String regex = "[abc]";
        String texto = "asasasvvxbc";
        String texto2 = "";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posição Encontradas");
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }
    }

}
