package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Servidor {
    private String nome;
    private List<Usuario> usuarios;
    private List<Mensagem> mensagens;

    public Servidor(String nome) {
        this.nome = nome;
        this.usuarios = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarUsuario(Usuario usuario) {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
            System.out.println(usuario.getNome() + " foi adicionado ao servidor " + this.nome);
        }
    }

    public void removerUsuario(Usuario usuario) {
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
            System.out.println(usuario.getNome() + " foi removido do servidor " + this.nome);
        }
    }

    public void adicionarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public void listarMensagens() {
        for (Mensagem m : mensagens) {
            System.out.println(m.getAutor().getNome() + ": " + m.getConteudo() + " [" + m.getDataHora() + "]");
        }
    }

    public void listarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }
    }

    public void filtrarMensagensPorAutor(Usuario autor) {
        mensagens.stream()
                .filter(m -> m.getAutor().equals(autor))
                .forEach(m -> System.out.println(m.getConteudo() + " [" + m.getDataHora() + "]"));
    }

    public void filtrarMensagensPorPalavra(String palavra) {
        mensagens.stream()
                .filter(m -> m.getConteudo().contains(palavra))
                .forEach(m -> System.out.println(m.getAutor().getNome() + ": " + m.getConteudo() + " [" + m.getDataHora() + "]"));
    }

    public long totalDeMensagens() {
        return mensagens.size();
    }

    public Optional<Usuario> usuarioComMaisMensagens() {
        return mensagens.stream()
                .collect(Collectors.groupingBy(Mensagem::getAutor, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public void contarMensagensPorUsuario() {
        Map<Usuario, Long> contagem = mensagens.stream()
                .collect(Collectors.groupingBy(Mensagem::getAutor, Collectors.counting()));

        contagem.forEach((usuario, qtd) -> System.out.println(usuario.getNome() + ": " + qtd + " mensagens"));
    }
}

