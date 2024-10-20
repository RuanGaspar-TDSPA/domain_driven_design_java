package entidades;

public class SistemaMensagens {
    public static void main(String[] args) {
        // Criar usuário
        Usuario marinaSilva = new Usuario("Marina Silva");
        Usuario eneias = new Usuario("Enéias");

        // Criar servidor
        Servidor servidorProgramacao = new Servidor("Programação");

        // Adicionar usuários ao servidor
        marinaSilva.adicionarServidor(servidorProgramacao);
        eneias.adicionarServidor(servidorProgramacao);

        // Enviar mensagem
        marinaSilva.enviarMensagem(servidorProgramacao, "Olá, tropal!");
        eneias.enviarMensagem(servidorProgramacao, "Olá, Marina Silva!");

        // Listar mensagens do servidor
        System.out.println("Mensagens no servidor " + servidorProgramacao.getNome() + ":");
        servidorProgramacao.listarMensagens();

        // Listar usuários do servidor
        System.out.println("Usuários no servidor " + servidorProgramacao.getNome() + ":");
        servidorProgramacao.listarUsuarios();

        // Consulta com Stream API
        System.out.println("Filtrar mensagens de Marina Silva:");
        servidorProgramacao.filtrarMensagensPorAutor(marinaSilva);

        System.out.println("Mensagens contendo 'Olá':");
        servidorProgramacao.filtrarMensagensPorPalavra("Olá");

        System.out.println("Total de mensagens no servidor:");
        System.out.println(servidorProgramacao.totalDeMensagens());

        System.out.println("Usuário com mais mensagens:");
        servidorProgramacao.usuarioComMaisMensagens().ifPresent(u -> System.out.println(u.getNome()));


        System.out.println("Contagem de mensagens por usuário:");
        servidorProgramacao.contarMensagensPorUsuario();
    }
}