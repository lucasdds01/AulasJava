import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    int primeiro = 0, segundo = 0;
    int resultado;

    double resDiv;

    int opcao = -1;

    while (opcao != 0) {
        opcao = entrada.nextInt ( );

        if(opcao != 0 ) {
            System.out.println("Insira o primeiro número: ");   
            primeiro = entrada.nextInt( );

            System.out.println("Insira o segundo número: ");
            segundo = entrada.nextInt( );
        }
        

        switch (opcao) {
            case 1:
                resultado = primeiro + segundo;
                System.out.println(resultado);
                break;
            case 2:
                resultado = primeiro - segundo;
                System.out.println(resultado);
                break;
            case 3:
                resultado = primeiro * segundo;
                System.out.println(resultado);
                break;
            case 4:
                resDiv =(double) primeiro /(double) segundo;
                System.out.println(resDiv);
                break;
            case 0:
                System.out.println("Encerrando!");
                break;
    
        
            default:
                break;
        }
    }
    }
}
