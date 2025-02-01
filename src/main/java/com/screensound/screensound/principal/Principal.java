package com.screensound.screensound.principal;

import com.screensound.screensound.model.Artista;
import com.screensound.screensound.repository.ArtistaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private ArtistaRepository repositorio;

    private List<Artista> artista = new ArrayList<>();

    private Optional<ArtistaRepository> serieBusca;

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {

        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artista
                    5 - Buscar dados sobre um artista
                    
                    0 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void cadastrarArtistas () {
        String option;
        do {
            System.out.println("Informe o nome desse artista:");
            var nomeArtista = leitura.nextLine();
            System.out.println("Informe o tipo desse artista: (solo, dupla, banda)");
            var tipoArtista = leitura.nextLine();
            System.out.println("Cadastrar outro artista? (S/N)");
            option = leitura.nextLine();

//            Artista artista = new Artista(nomeArtista, tipoArtista);
//            repositorio.save(artista);
        } while (option.toUpperCase().contains("S"));
    }
}


