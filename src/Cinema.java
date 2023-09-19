import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, contadorTerror = 0, contadorHomens = 0, contadorMulheres = 0, contadorComediaHomens = 0, contadorComediaMulheres = 0, contadorIdades = 0;
        char sexo, genero;
        double mediaIdadeTerror = 0;

        while (true) {
            System.out.print("Digite a idade (-1 para sair): ");
            idade = sc.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            sexo = sc.next().charAt(0);

            System.out.print("Digite o gênero preferido (C/T/A): ");
            genero = sc.next().charAt(0);

            if (genero == 'T') {
                mediaIdadeTerror += idade;
                contadorTerror++;
            }

            if (sexo == 'M' && genero == 'A') {
                contadorHomens++;
            } else if (sexo == 'F' && genero == 'A') {
                contadorMulheres++;
            }

            if (genero == 'C') {
                if (sexo == 'M') {
                    contadorComediaHomens++;
                } else if (sexo == 'F') {
                    contadorComediaMulheres++;
                }
            }

            contadorIdades++;
        }

        if (contadorTerror > 0) {
            mediaIdadeTerror /= contadorTerror;
            System.out.println("Média de idade das pessoas que preferem filmes de terror: " + mediaIdadeTerror);
        } else {
            System.out.println("Nenhuma pessoa prefere filmes de terror.");
        }

        System.out.println("Estatísticas:");
        System.out.println("Número de homens que preferem filmes de ação: " + contadorHomens);
        System.out.println("Número de mulheres que preferem filmes de ação: " + contadorMulheres);
        System.out.println("Número de homens que preferem filmes de comédia: " + contadorComediaHomens);
        System.out.println("Número de mulheres que preferem filmes de comédia: " + contadorComediaMulheres);
        System.out.println("Total de pessoas: " + contadorIdades);

        sc.close(); // Feche o scanner quando não for mais necessário.
    }
}
