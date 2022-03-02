public class Ficha {
    
    String color= "";
    int posicion=0;
    Dado dado= new Dado(6);

    public Ficha(String color1){
        color= color1;
        posicion=0;
    }

    public int avanzar(){
        int pasos= dado.lanzar();
        posicion=posicion + pasos;
        System.out.println(color+":");
        System.out.println(posicion);
        return(posicion); 
    }


}
