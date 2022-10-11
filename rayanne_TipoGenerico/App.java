package rayanne_TipoGenerico;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Vetor<Pessoa> pessoas = new Vetor<>(3);
        Vetor<Cidade> cidades = new Vetor<>(3);

        int totalPessoas = 0, totalCidades = 0;
        String nome, naturalidade, adjetivo, estado;
        char sexo, resp;

        // Cadastrando as pessoas e adicionando no vetor
        do {
            System.out.println("Qual o nome?");
            nome = s.nextLine();

            System.out.println("Qual o sexo?");
            sexo = s.nextLine().charAt(0);

            System.out.println("Onde voce nasceu?");
            naturalidade = s.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo, naturalidade);
            pessoas.adicionaObjeto(pessoa, totalPessoas);
            totalPessoas++;

            System.out.println("Deseja adicionar mais alguma pessoa?");
            resp = s.nextLine().charAt(0);
        }
        while ((resp == 'S' || resp == 's') && totalPessoas < 3);

        // Cadastrando as cidades e Radicionando no vetor
        do {
            System.out.println("Qual a cidade você quer adicionar?");
            nome = s.nextLine();

            System.out.println("Qual o estado dessa cidade ?");
            estado = s.nextLine();

            System.out.println("Quem nasce em " + nome + " é?");
            adjetivo = s.nextLine();

            Cidade cidade = new Cidade(nome, estado, adjetivo);
            cidades.adicionaObjeto(cidade, totalCidades);
            totalCidades++;

            System.out.println("Deseja adicionar mais alguma cidade?");
            resp = s.nextLine().charAt(0);
        } while ((resp == 'S' || resp == 's') && totalCidades < 3);
        System.out.println("Qual usuário você quer escolher?");
        String user = s.nextLine().toLowerCase();
        for (int i = 0; i < totalPessoas; i++) {
            if (pessoas.getObjeto(i).getNome().toLowerCase().contains(user)) {
                Pessoa aux = pessoas.getObjeto(i);
                String inicio = "";
                String adjetivoCidade = "";
                String nomeCidade = "";
                String estadoCidade = "";
                if (aux.getSexo() == 'F' || aux.getSexo() == 'f') {
                    inicio = "A";
                } else {
                    inicio = "O";
                }
                for (int j = 0; j < totalCidades; j++) {
                    if (aux.getNaturalidade().toLowerCase().contains(cidades.getObjeto(j).getNome().toLowerCase())) {
                        adjetivoCidade = cidades.getObjeto(j).getAdjetivo();
                        nomeCidade = cidades.getObjeto(j).getNome();
                        estadoCidade = cidades.getObjeto(j).getEstado();
                    }
                }
                if (adjetivoCidade.equals("") || nomeCidade.equals("") || estadoCidade.equals("")) {
                    System.out.println(String.format("Não possui cidade cadastrada para %s." ,user));
                } else {
                    System.out.println(String.format("%s %s %s nasceu em %s - %s.", inicio, adjetivoCidade, aux.getNome(), nomeCidade, estadoCidade));
                }
                return;
            }

        }
        System.out.println("rayanne_TipoGenerico.Pessoa não encontada");
    }


}


