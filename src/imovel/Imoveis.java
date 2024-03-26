package imovel;


public class Imoveis {
    public static void main(String[] args) {
        Imovel ap = new Imovel("Pasqualini", 5, 3, true, 750000.00);
        System.out.println(ap.toString());
        Imovel litoral = new Imovel("Litoral", 10, 7, false, 1000000.00);
        System.out.println(litoral.toString());
    }
}
