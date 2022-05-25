import javax.swing.plaf.synth.SynthScrollBarUI;

public class TesteReferencias {
    public static void main(String[] args) {
  
      

        ControleBonificacao controle = new ControleBonificacao();
        
        Funcionario d = new Designer();
     
        controle.registra(d);
        d.setSalario(2000.0);
        System.out.println(controle.getSoma());

        


        

        
    }
}
