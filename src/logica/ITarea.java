package logica;

import java.util.List;

public interface ITarea {

    public void agregarTarea(Tarea tarea);

    public void modificarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);
    
    public List<Tarea> obtenerTareas();
    
}
