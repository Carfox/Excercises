public class ListaProductos implements Comparable{
    private String nombre;
    private double precio;
    private double contenido;
    private String tipoUnidad;

    public ListaProductos(String nombre, double precio, double contenido, String tipoUnidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.contenido = contenido;
        this.tipoUnidad = tipoUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }


    @Override
    public String toString() {
        return "ListaProductos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", contenido=" + contenido +
                ", tipoUnidad='" + tipoUnidad + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
