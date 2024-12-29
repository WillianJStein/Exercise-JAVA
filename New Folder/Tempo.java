package exercicio.java;

public class Tempo {

    public static void main(String[] args) {
        boolean noite = false;
        boolean chuva = true;
        int flores = 30;
        int ano = 2069;
        int tempo = 30;
        int resultado = 0;
        int resultado_flores = 0;
        float temperatura_1 = 5;
        float temperatura_2 = 40;
        float resultado_temp = 0;
        
        if (noite) {
            resultado = ano + tempo;
            resultado_flores = flores + tempo;
            resultado_temp = temperatura_1 - temperatura_2;
            System.out.println("O ano é " + resultado + ", está de noite e a temperatura é " + resultado_temp + "ºC.\nEstá muito frio e o total de flores no planeta Terra é de " + resultado_flores + ".\n");
        } else {
            resultado = ano - tempo;
            resultado_flores = flores - tempo;
            resultado_temp = temperatura_2 + temperatura_1;
            System.out.println("O ano é " + resultado + ", está de dia e a temperatura é " + resultado_temp + "ºC.\nEstá muito calor e o total de flores no planeta Terra é de " + resultado_flores + ".\n");
        }
        
        if (chuva) {
            resultado = ano + tempo;
            System.out.println("Está chovendo.\n");
        } else {
            resultado = ano - tempo;
            System.out.println("Não está chovendo.\n");
        }
    }
}

public class EstruturaCondicionalSwitch {

    public static void main(String[] args) {
        int dia = Integer.parseInt(args[0]);
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

}

public class EstruturaRepeticaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        while (numero != 10) {
            System.out.print("Informe um número: ");
            numero = scanner.nextInt();

            if (numero == 10) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou! :(\nTente novamente!");
            }
        }
        scanner.close();
    }
}

public class EstruturaCondicionalIf {
    public static void main(String[] args) {
        int resposta = 8;
        if (resposta == 10) {
        //Se  a variável  for igual a 10,  a frase a baixo será escrita
            System.out.println("Você Acertou!");
        } else {
        //Se a variável não for igual a 10, a frase a baixo será escrita
            System.out.println("Você Errou!");
        }

    }
}