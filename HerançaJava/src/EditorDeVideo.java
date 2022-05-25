public class EditorDeVideo extends Funcionario {

    public double getBonificacao(){
        System.out.println("Bonificacao editor de video");

        return super.getBonificacao()+ 100;
    }
    
}
