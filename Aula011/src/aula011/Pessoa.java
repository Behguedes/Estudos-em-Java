package aula011;
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //Metodos
    public void fazerAniversario() {
        this.idade++;
    }
    
    //Metodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //to String

    @Override
    public String toString() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
