public class Saludo {

    private String saludo;
    private String[] saludos;
    private Ejemplo ej;

    public Saludo(){
       saludos = new String[3];
       saludos[0] = "Hola";
       saludos[1] = "Qué tal?";
       saludos[2] = "Pura vida";
       ej = new Ejemplo("!!");
    }

    public Saludo(String s){
        this.saludo = s;
        ej = new Ejemplo("!!");
    }

    public String getSaludo(){
        return saludo+ej.getExc() ;
    }

    public String getSaludo(int i){
        return saludos[i]+ej.getExc() ;
    }

}
