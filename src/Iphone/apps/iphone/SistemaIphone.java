package Iphone.apps.iphone;

import Iphone.apps.navegador.Navegador;
import Iphone.apps.reprodutorMusical.ReprodutorMusical;
import Iphone.apps.telefone.AparelhoTelefonico;

import java.util.Scanner;

public class SistemaIphone implements ReprodutorMusical, AparelhoTelefonico, Navegador  {
    Scanner entrada = new Scanner(System.in);

    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualiando Pagina");
    }

    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Qual  musica: ");
            String novaMusica = entrada.next();
            musica = novaMusica;
            return ;
    }

    public void ligar(String numero) {
        String novoNumero = entrada.next();
        numero = novoNumero;
        System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendeu a ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado.");

    }
}
