package AulaExercicio;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String id;
    private String nome;



    public Pessoa(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public int compare(Pessoa o1, Pessoa o2) {
//        if(o1.getNome())
//        return 0;
//    }

    public Comparator<Pessoa> reversed() {
        return null;
    }

    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.getNome());
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

