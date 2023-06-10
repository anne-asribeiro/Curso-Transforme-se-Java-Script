package cursojava.aulaempregados;

public class Teste {

    public static void main(String[] args) {

        Diretor diretor = new Diretor();
        diretor.enviarEmail("fulano@email.com", null, "Futebol de sexta",
                "Caro fulano de tal,venho por meio deste te convidar p um futebol na sexta,");
    }

}
