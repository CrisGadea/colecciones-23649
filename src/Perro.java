public class Perro {

    static class ClaseAnidada{
        void mostrarMensaje(){
            System.out.println("Mensaje desde la clase anidada.");
        }
    }

    static{
        System.out.println("La clase carga");
        Perro.cantidadDePerros = 0;
    }
    private String nombre;

    static int cantidadDePerros;

    public Perro(){
        nombre = "";
        cantidadDePerros++;
    }

    public Perro(String nombre){
        this.nombre = nombre;
        cantidadDePerros++;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre; // cada objeto va a poder modificar su propio nombre
    }

    public Integer getCantidadDePerros() {
        return cantidadDePerros;
    }

    public void setCantidadDePerros(Integer cantidadDePerros) {
        this.cantidadDePerros = cantidadDePerros;
    }
}
