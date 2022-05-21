public class testeFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();

        nico.setNome("Nico steppat");
        nico.setCpf("8805065987");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
