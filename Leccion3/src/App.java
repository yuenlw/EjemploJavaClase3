public class App {
    public static void main(String[] args) throws Exception {
        Saludo sal = new Saludo("Pura vida");
        Saludo sal2 = new Saludo("Qué tal?");
        Saludo sal3 = new Saludo();

        System.out.println(sal.getSaludo() +  ", Mundo!");
        System.out.println(sal2.getSaludo() +  ", Mundo!");
        System.out.println(sal3.getSaludo() +  ", Mundo!");

        for (int i = 2; i>=0; i--){
            System.out.println(sal3.getSaludo(i) +  ", Mundo!");
        }
        
    }
}
