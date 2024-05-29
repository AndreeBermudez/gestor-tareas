
package logica;

public class Tarea {
    
    private int ID;
    private String descripcion;
    private String fecha;
    private int prioridad;

    public Tarea(int ID, String descripcion, String fecha, int prioridad) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }
    
    public Tarea(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" + "ID=" + ID + ", descripcion=" + descripcion + ", fecha=" + fecha + ", prioridad=" + prioridad + '}';
    }
    
    
    
}
