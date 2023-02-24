public class App {
    public static void main(String[] args) throws Exception {
        Saludo sal = new Saludo("Pura vida");
        Saludo sal2 = new Saludo("Qué tal?");

        System.out.println(sal.getSaludo() +  ", Mundo!");
        System.out.println(sal2.getSaludo() +  ", Mundo!");
    }
}
