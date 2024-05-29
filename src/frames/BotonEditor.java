package frames;

import frames.ModificarTarea;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class BotonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
    private JButton button;

    public BotonEditor() {
        button = new JButton("Modificar");
        button.addActionListener(this);
        button.setFocusPainted(false); // Evitar que el botón muestre el borde de foco
    }

    @Override
    public Object getCellEditorValue() {
        return button.getText(); // Devolver el texto del botón en lugar del botón mismo
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fireEditingStopped(); // Detener la edición cuando se presiona el botón
        ModificarTarea ventanaModificar = new ModificarTarea();
        ventanaModificar.setVisible(true);
    }
}
