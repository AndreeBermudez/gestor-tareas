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
        button = new JButton();
        button.addActionListener(this);
    }

    @Override
    public Object getCellEditorValue() {
        return button;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        button.setText("Modificar");
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ModificarTarea ventanaModificar = new ModificarTarea();
        ventanaModificar.setVisible(true);
        fireEditingStopped();
    }
}

