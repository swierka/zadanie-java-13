package pl.javastart.Zad1;

public class TextStats {

    //liczenie znakow
    int countSigns(String text) {
        return text.length();
    }

    //liczenie znakow bez spacji
    int countSignsWoBlanks(String text) {
        int characters = 0;
        for (int i = 0, length = text.length(); i < length; i++) {
            if (text.charAt(i) != ' ') {
                characters++;
            }
        }
        return characters;
    }

    //liczenie wyrazow
    int countWords(String text) {
        String[] myString = text.split("[\\s\\-\\.\\'\\?\\,\\_\\@]+");
        return myString.length;
    }

    //czy jest palindromem
    String isPalindrome(String text) {
        if (text.equals(new StringBuilder(text).reverse().toString())) {
            return "Tekst jest palindromem.";
        } else {
            return "Tekst nie jest palindromem.";
        }
    }
}
