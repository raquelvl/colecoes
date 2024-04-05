package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CadastroPessoa {

    private List<String> cadastro = new ArrayList<>();

    public String adiciona(String nome) {
        cadastro.add(nome);
        return nome;
    }

    public boolean remove(String nome) {
        return cadastro.remove(nome);
    }

    public List<String> encontraPessoas(String inicioNome) {
        List<String> encontradas = new ArrayList<>();
        for (String nome : cadastro) {
            if (nome.startsWith(inicioNome))
                encontradas.add(nome);
        }
        return encontradas;
    }

    public String remove(int indice) {
        return cadastro.remove(indice);
    }

    public boolean contem(String nome) {
        return cadastro.contains(nome);
    }

    public String recupera(int indice) {
        return cadastro.get(indice);
    }

    public int recuperaIndice(String nome) {
        return cadastro.indexOf(nome);
    }

    public List<String> ordena() {
        Collections.sort(cadastro);
        return cadastro;
    }

    @Override
    public String toString() {
        String str = "";
        for (String nome : cadastro) {
            str += nome;
            str += "\n";
        }
        return str;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadastro);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CadastroPessoa))
            return false;
        CadastroPessoa other = (CadastroPessoa) obj;
        return Objects.equals(cadastro, other.cadastro);
    }
}
