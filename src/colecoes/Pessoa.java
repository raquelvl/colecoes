package colecoes;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;

        return getCpf() != null ? getCpf().equals(pessoa.getCpf()) : pessoa.getCpf() == null;
    }

    @Override
    public int hashCode() {
        return getCpf() != null ? getCpf().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.getNome().compareTo(outraPessoa.getNome());
    }
}
