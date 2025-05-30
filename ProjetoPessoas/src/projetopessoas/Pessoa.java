package projetopessoas;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    // Metodo
    public void fazerAniversario() {
        this.idade++;
    }
    
    // Metodos Especiais
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
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
    
    
}
