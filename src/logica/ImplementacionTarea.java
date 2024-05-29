package logica;

import java.util.LinkedList;
import java.util.List;

public class ImplementacionTarea implements ITarea {

    private List<Tarea> tareas;

    public ImplementacionTarea() {
        this.tareas = new LinkedList<>();
    }

    @Override
    public void agregarTarea(Tarea t) {
        tareas.add(t);
    }

    @Override
    public void modificarTarea(Tarea t) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getID() == t.getID()) {
                tareas.set(i, t);
                return;
            }
        }
    }

    @Override
    public void eliminarTarea(Tarea t) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getID() == t.getID()) {
                tareas.remove(i);
                return;
            }
        }
    }
    
    @Override
    public List<Tarea> obtenerTareas() {
        return tareas;
    }
}
