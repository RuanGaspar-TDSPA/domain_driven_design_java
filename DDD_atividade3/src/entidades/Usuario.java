package entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private static int contadorID = 1; // para garantir IDs únicos
    private List<Servidor> servidores; // Servidores em que o usuário participa

    public Usuario(String nome) {
        this.nome = nome;
        this.id = contadorID++;
        this.servidores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void adicionarServidor(Servidor servidor) {
        if (!servidores.contains(servidor)) {
            servidores.add(servidor);
            servidor.adicionarUsuario(this);
        }
    }

    public void removerServidor(Servidor servidor) {
        if (servidores.contains(servidor)) {
            servidores.remove(servidor);
            servidor.removerUsuario(this);
        }
    }

    public void enviarMensagem(Servidor servidor, String conteudo) {
        if (servidores.contains(servidor)) {
            Mensagem mensagem = new Mensagem(this, conteudo);
            servidor.adicionarMensagem(mensagem);
        } else {
            System.out.println("Você não faz parte deste servidor.");
        }
    }
}


