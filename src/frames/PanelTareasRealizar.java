package frames;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import logica.ITarea;
import logica.Tarea;

/**
 *
 * @author Andree Bermúdez
 */
public class PanelTareasRealizar extends javax.swing.JPanel {

    private final ITarea tareaService;
    private final DefaultTableModel modeloTabla;

    public PanelTareasRealizar(ITarea tareaService) {
        this.tareaService = tareaService;
        this.modeloTabla = new DefaultTableModel();
        initComponents();
        configurarTabla();
        actualizarTabla();
    }

    private void configurarTabla() {
        modeloTabla.setColumnIdentifiers(new String[]{"ID", "Descripción", "Fecha Límite", "Prioridad", "Acción"});
        tblTareasRealizar.setDefaultRenderer(Object.class, new RenderTabla());
        if (tblTareasRealizar.getColumnCount() >= 5) {
            TableColumn columnaAccion = tblTareasRealizar.getColumnModel().getColumn(4);
            columnaAccion.setCellRenderer(new TableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    return (Component) value;
                }
            });

            tblTareasRealizar.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblTareasRealizar.getColumnModel().getColumn(1).setPreferredWidth(160);
            tblTareasRealizar.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblTareasRealizar.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblTareasRealizar.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

    }

    public void actualizarTabla() {
        List<Tarea> tareas = tareaService.obtenerTareas();
        modeloTabla.setRowCount(0);
        for (Tarea t : tareas) {
            JButton btnDespachar = new JButton("Despachar");
            btnDespachar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Despachar tarea ID: " + t.getID());
                    tareaService.eliminarTarea(t);
                    actualizarTabla();
                }
            });
            modeloTabla.addRow(new Object[]{t.getID(), t.getDescripcion(), t.getFecha(), t.getPrioridad(), btnDespachar});
            tblTareasRealizar.setModel(modeloTabla);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTareasRealizar = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("Tareas por Realizar");

        tblTareasRealizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTareasRealizar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblTareasRealizar;
    // End of variables declaration//GEN-END:variables
}
