package Tarea07;

public class Integrantes
{
    private String nombre;
    private int celular;
    private String ciclo;

    public Integrantes(String nombre, int celular, String ciclo) {
        this.nombre = nombre;
        this.celular = celular;
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString()
    {
        return "Integrantes(Nombre: " + nombre + ", N° celular: " + celular +" , Ciclo: "+ ciclo +")";
    }
}
