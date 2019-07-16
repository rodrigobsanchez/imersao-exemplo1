package java02wrapper;

public class WrapperExercicios {

    public static void main(String[] args) {
        System.out.println(converterParaMinuscula(Character.valueOf('A')));
        System.out.println(cortaTextoEm140Caracteres("The most direct way to create 1 string is to write: String greeting = Hello world! ; In this case, \"Hello world!\" is a string literal—a series of characters in your code that is enclosed in double quotes. Whenever it encounters a string literal in your code, the compiler creates a String object with its value—in this case, Hello world!. As with any other object, you can create String objects by using the new keyword and a constructor. The String class has thirteen constructors that allow you to provide the initial value of the string using different sources, such as an array of characters:"));
    }

    /*
        1 - Crie uma função que recebe uma classe Character (pressupondo que seja uma letra maiúscula) e converta a mesma para minúscula.
        Tabela unicode: http://1.bp.blogspot.com/-9kye1H082C8/VJN2bSDZa0I/AAAAAAAACE8/4PKbKxkgibY/s1600/tabela_ascii_completa.gif
     */
    private static Character converterParaMinuscula(Character letraMaiuscula) {
        return Character.valueOf((char)((char)letraMaiuscula+32));
    }

    /*
    2 - Crie uma função que corta o texto passado em 140 caracteres.
    Caso ultrapasse utilize reticências.
    Explore os métodos length(), .substring() e concat() da String para facilitar o trabalho
     */
    private static String cortaTextoEm140Caracteres(String texto) {
        if(texto.length() > 140){
            return texto.substring(0, 136).concat("...");
        }else{
            return texto;
        }
    }

}
