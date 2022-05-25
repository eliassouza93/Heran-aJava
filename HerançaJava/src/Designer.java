public class Designer extends Funcionario {

    public double getBonificacao(){
        System.out.println("Bonificacao designer");

        return super.getBonificacao()+ 300;
    }
    
}
