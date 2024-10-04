public class MinhaClasse {
    public static void main(String[] args) {

        /* metodo principal = main */

        String primeiroNome = "Matheus";
        String segundoNome = "Soares";
        String nomeInteiro = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeInteiro);
    }

    /* criando outro metodo para a classe */
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método :" + primeiroNome.concat(" ").concat(segundoNome);

    }

}

