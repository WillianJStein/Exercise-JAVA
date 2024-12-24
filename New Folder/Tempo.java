package exercicio.java;

public class Tempo {

    public static void main(String[] args) {
        boolean noite = true;
        boolean chuva = false;
        
        if (noite) {
            System.out.println("Está uma noite muito fria.\n");
        } else {
            System.out.println("Está de dia e faz calor\n");
        }
        
        if (chuva) {
            System.out.println("Está chovendo.\n");
        } else {
            System.out.println("Não está chovendo.\n");
        }
    }
}