package ExercicioPraticoLembrete.src;

import java.util.Scanner;

public class LembretesApp {
    BlocoDeLembretes listaLembretes;
    Scanner reader = new Scanner(System.in);

    int menu(int numeroDeLembretes) {
        System.out.println("Lembretes App - A lista contém " + numeroDeLembretes + " lembretes.");
        System.out.println("Escolha uma das seguites opções: ");
        System.out.println("1- Adicionar novo lembrete");
        System.out.println("2- Remover lembrete");
        System.out.println("3- Listar");
        System.out.println("4- Busca por data");
        System.out.println("5- Busca por nome");
        System.out.println("6- Sair");
        System.out.println();
        int choice = Integer.parseInt(reader.nextLine());
        return choice;
    }

    Lembrete escreverLembrete() {
        System.out.println("Insira as informações abaixo: ");
        System.out.print("TÍTULO: ");
        String nome = reader.nextLine();
        System.out.print("DESCRIÇÃO: ");
        String descricao = reader.nextLine();
        System.out.println("DATA");
        System.out.print("   Dia: ");
        int dia = Integer.parseInt(reader.nextLine());
        System.out.print("   Mês: ");
        int mes = Integer.parseInt(reader.nextLine());
        System.out.print("   Ano: ");
        int ano = Integer.parseInt(reader.nextLine());
        DataNotificacao data = new DataNotificacao(dia, mes, ano);
        Lembrete lembrete = new Lembrete(data, nome, descricao);
        return lembrete;
    }

    int escreverNomeRemover() {
        System.out.print("Digite o nome do lembrete que quer remover: ");
        String lembreteRemover = reader.nextLine();
        for (int i = 0; i < this.listaLembretes.numeroDeLembretes(); i++) {
            if (this.listaLembretes.lembretes[i].nomeLembrete.equals(lembreteRemover)) {
                return i;
            }
        }
        return -1;
    }

    DataNotificacao escreverData() {
        System.out.println("Informe a data: ");
        System.out.print("   Dia: ");
        int dia = Integer.parseInt(reader.nextLine());
        System.out.print("   Mês: ");
        int mes = Integer.parseInt(reader.nextLine());
        System.out.print("   Ano: ");
        int ano = Integer.parseInt(reader.nextLine());
        DataNotificacao dataBusca = new DataNotificacao(dia, mes, ano);
        return dataBusca;
    }

    String escreverNomeLembrete() {
        System.out.println("Informe o nome para buscar: ");
        String nome = reader.nextLine();
        return nome;
    }

    public static void main(String[] args) throws Exception {
        LembretesApp app = new LembretesApp();
        app.listaLembretes = new BlocoDeLembretes("Lembretes");
        while (true) {
            switch (app.menu(app.listaLembretes.numeroDeLembretes())) {
                case 1:
                    Lembrete lembrete = app.escreverLembrete();
                    app.listaLembretes.incluirLembrete(lembrete);
                    break;
                case 2:
                    int index = app.escreverNomeRemover();
                    if (index < 0) {
                        System.out.println("Não há um lembrete com este nome!");
                    } else {
                        app.listaLembretes.removerLembrete(index);
                    }
                    break;
                case 3:
                    app.listaLembretes.listarLembretes();
                    break;
                case 4:
                    DataNotificacao dataBusca = app.escreverData();
                    app.listaLembretes.buscarLembretesPorData(dataBusca);
                    break;
                case 5:
                    String nomeBuscar = app.escreverNomeLembrete();
                    app.listaLembretes.buscarLembretesPorNome(nomeBuscar);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

}
