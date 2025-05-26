package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2]; // cria um vetor (variavel) com 3 valores
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POo para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 300, p[0]);
        
        System.out.println(l[0].detalhes());
        
    }
    
}
