package colecoes.exemplos;

import java.util.*;

public class ExemploDeUsoDeListas {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        povoaColecao1(list1);
        povoaColecao2(list2);

        if (list1.equals(list2)) {
            System.out.println("As listas são iguais!");
        } else {
            System.out.println("As listas são diferentes!");
        }

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