package AULA6.ClassesUtilitarias.ResourceBundle;

import java.util.Locale;

public class ResourceBundle {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.moorning"));
    }
}
