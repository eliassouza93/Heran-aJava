public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario (){
        
    }

    public double getBonificacao(){
        return this.salario * 0.1;
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
