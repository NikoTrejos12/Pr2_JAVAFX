package co.edu.uniquindio.heroefx.heroeapp;

public class heroe {

    private String Nombre;
    private String codigo;
    private String poder;
    private String color;
    private String armamento;
    private String vehiculo;

    public heroe() {
    }

    public heroe(String nombre, String codigo, String poder, String color, String armamento, String vehiculo) {
        Nombre = nombre;
        this.codigo = codigo;
        this.poder = poder;
        this.color = color;
        this.armamento = armamento;
        this.vehiculo = vehiculo;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPoder() {
        return poder;
    }

    public String getColor() {
        return color;
    }

    public String getArmamento() {
        return armamento;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "heroe{" +
                "Nombre='" + Nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", poder='" + poder + '\'' +
                ", color='" + color + '\'' +
                ", armamento='" + armamento + '\'' +
                ", vehiculo='" + vehiculo + '\'' +
                '}';
    }
}


