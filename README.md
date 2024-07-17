
flowchart TD

    E[SistemaIphone]
    A[Iphone]
    A --> E
    E --> B(Reprodutor musical)
    E --> C(Aparelho Telefonico)
    E --> D(Navegador na Internet) 

    B -->new[["+tocar()
    +pausar()
    +selecionarMusica(String musica)"]]

    C--> newLine[["+ligar(String numero) 
    +atender()
    +iniciarCorreioVoz()"]]   

    D--> newLine2[["+exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina"]]
  