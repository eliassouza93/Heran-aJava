public class FuncionarioTeste {
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0;



    public  double getBonificacao(){
        if(this.tipo == 0){//funcionario comum
            return this.salario *0.1;

        }else if (this.tipo == 1){
            return this.salario *0.2;

        }else{
            return this.salario + 6000.0;
        
        }

        
    }
    public int getTipo(){
        return tipo;
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
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
