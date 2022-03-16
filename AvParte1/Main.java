import br.senai.model.Evento;

public class Main {
    public static void main(String[] args) {

        Evento evento1 = new Evento();
        evento1.setNome("Final campeonato");
        evento1.setData("13/04/2022");
        evento1.setCliente("Anna", "118.373.389-50", "(48) 99107-6443", "annalauraberti@gmail.com");
        evento1.setCliente("Peterson","123.211.979-28","(48) 98407-2169", "petersongdasilva@gmail.com");
        evento1.setCliente("Matheus Marques", "096.599.099-00", "(48) 99118-8711", "mathuesmarques@gmail.com");
        evento1.setCliente("Bernardo", "737.234.945-65", "(48)93485-2384", "bernardofogaça@gmail.com");
        evento1.setCliente("diego", "834.654.754-54", "(48)93284-3454", "diego_souza@estudante.sc.senai.br");
        System.out.println(evento1);

        Evento evento2 = new Evento();
        evento2.setNome("festa de 15");
        evento2.setData("25/03/2022");
        evento2.setCliente("Peterson","123.211.979-28","(48) 98407-2169", "petersongdasilva@gmail.com");
        evento2.setCliente("Anna", "118.373.389-50", "(48) 99107-6443", "annalauraberti@gmail.com");
        evento2.setCliente("Matheus Marques", "096.599.099-00", "(48) 99118-8711", "mathuesmarques@gmail.com");
        evento2.setCliente("Bernardo", "737.234.945-65", "(48)93485-2384" ,"bernardofogaça@gmail.com");
        evento2.setCliente("diego", "834.654.754-54", "(48)93284-3454", "diego_souza@estudante.sc.senai.br");
        System.out.println(evento2);

        Evento evento3 = new Evento();
        evento3.setNome("tbt bike tem");
        evento3.setData("24/05/2022");
        evento3.setCliente("Anna", "118.373.389-50", "(48) 99107-6443", "annalauraberti@gmail.com");
        evento3.setCliente("Matheus Marques", "096.599.099-00", "(48) 99118-8711", "mathuesmarques@gmail.com");
        evento3.setCliente("Peterson","123.211.979-28","(48) 98407-2169", "petersongdasilva@gmail.com");
        evento3.setCliente("Bernardo", "737.234.945-65", "(48)93485-2384", "bernardofogaça@gmail.com");
        evento3.setCliente("diego", "834.654.754-54", "(48)93284-3454", "diego_souza@estudante.sc.senai.br");
        System.out.println(evento3);


    }
}
