public class Main {
    public static void main(String[] args) {
        // New= Instanciar uma variavel
        var produto1 = new Produto("Coca-Cola",5.0,"Refrigerante de Cola", 2);


        var produto2 = new Produto("Fanta",4.0, "Refrigerante de laranja", 5);


        produto1.AdicionarEstoque(5);

        System.out.println(produto1);



    }
}