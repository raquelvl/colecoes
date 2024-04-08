package colecoes.exemplos;

import java.util.*;

public class ExemploDeUsoDeConjuntos {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new TreeSet<String>();

        povoaColecao1(set1);
        povoaColecao2(set2);

        if (set1.equals(set2)) {
            System.out.println("Os conjuntos são iguais!");
        } else {
            System.out.println("Os conjuntos são diferentes!");
        }

        System.out.println("Quando a colecao eh um conjunto:");
        tentaAdicionarElementoDuplicado(set1);

        Collection<String> col = new ArrayList<String>();
        povoaColecao1(col);
        System.out.println("Quando a colecao eh uma lista:");
        tentaAdicionarElementoDuplicado(col);
    }

    private static void tentaAdicionarElementoDuplicado(Collection<String> col) {
        if (!col.isEmpty()) {
            System.out.println("Tamanho do conjunto antes de adicionar" + "um elemento duplicado: " + col.size());
            col.add(col.iterator().next());
            System.out.println("Tamanho do conjunto depois de adicionar" + "um elemento duplicado: " + col.size());
        }
    }

    private static void povoaColecao1(Collection<String> colecao) {
        try {
            colecao.add(new String("Raquel Lopes"));
            colecao.add(new String("Marcus Carvalho"));
            colecao.add(new String("Ayla Dantas"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void povoaColecao2(Collection<String> colecao) {
        try {
            colecao.add(new String("Ayla Dantas"));
            colecao.add(new String("Raquel Lopes"));
            colecao.add(new String("Marcus Carvalho"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
