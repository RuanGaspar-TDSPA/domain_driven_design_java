import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variaveis();

        var calculo = 1 + 2 - (3 * 2) / 5.0;
        System.out.println(calculo);
        calculo++;
        System.out.println(calculo);
        calculo--;
        System.out.println(calculo);

        //condicionais();
        var scanner = new Scanner(System.in);
        System.out.println("Digite a idade");
        var idade = scanner.nextInt();

        if(idade >= 18 && idade <= 200)
            System.out.println("A pessoa é maior de idade");
        else if (idade > 200)
            System.out.println("A pessoa é um vampiro");
            else
            System.out.println("A pessoa é menor de idade");

            }


            public static void variaveis() {
                System.out.println("Sistema iniciando...");

                var scan = new Scanner(System.in);
                System.out.println("Digite o número 1: ");
                var numero1 = scan.nextBigDecimal();
                scan.nextLine();
                System.out.println("Digite o número 2: ");
                var numero2 = scan.nextBigDecimal();
                scan.nextLine();

                System.out.println(numero1.add(numero2));

                String nome = "FIAP";
                System.out.println(nome);

                int numero = 10;
                System.out.println(numero + 10);

                double valor = 10.5;
                System.out.println(numero + 10.5);

                long valorGrande = 1000000000000000000L;
                short valorPequeno = 10;


                char letra = 'A';
                boolean condicao = true;

                var temp = 30.5;
                System.out.println("A temp é de: " + temp + "graus");

                var numeroTexto = "10";
                // conversao explicita de string para int
                var numeroConvertido = Integer.parseInt(numeroTexto);

                //declaracao de variaveis
                int idade;
                //inicializacao de variaveis
                idade = 10;
                idade = 20;
                idade = 30;
                //declaracao e inicializacao
                int idade2 = 10;

                System.out.println("Sistema finalizando...");





            }
}