package AulaExercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {

    /**
     * Exercício: use a classe a seguir para fazer a leitura do arquivo.
     * 1 - Crie um HashSet com o nome e ordene.
     * 2 - Crie uma classe Pessoa com os campos id e nome. Crie uma pessoa para cada linha do arquivo.
     *     Ordene as pessoas pelo nome.
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Pessoa> list = new ArrayList<Pessoa>();
        Scanner sc = new Scanner(getInputFile());


        while (sc.hasNextLine()) {

            String linha = sc.nextLine();
            String[] partes = linha.split(",");

            String id = partes[0];
            String nome = partes[1];
            Pessoa p = new Pessoa(id, nome);
            list.add(p);
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getId().equals("id")){
                    // removing the headers from the file.
                    list.remove(i);
                }
            }
//            System.out.println(id);
//            System.out.println(nome);
        }
        sc.close();

        System.out.println(list.size());
        Collections.sort(list);

        System.out.println(list);
    }



    //Conteúdo de https://paste.ee/p/nSLSB
    // Coloque na pasta /resources/
    private static File getInputFile() {
        // Ou return new File(SuaClasse.class.getClassLoader().getResource("input_1.csv").toURI());
        return new File("src/main/resources/input_1.csv");
    }
}