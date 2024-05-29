package frames;

import java.awt.Component;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import logica.ITarea;
import logica.Tarea;
import frames.BotonEditor;

/**
 *
 * @author Andree Bermúdez
 */
public class PanelTareasPendientes extends javax.swing.JPanel {

    private final ITarea tareaService;
    private final DefaultTableModel modeloTabla;
    private int nextID;

    public PanelTareasPendientes(ITarea tareaService) {
        this.tareaService = tareaService;
        this.modeloTabla = new DefaultTableModel();
        initComponents();
        configurarTabla();
        actualizarTabla();
        nextID = 1;
    }

    private void configurarTabla() {
        modeloTabla.setColumnIdentifiers(new String[]{"ID", "Descripción", "Fecha Límite", "Prioridad", "Acción"});
        tblTareasPendientes.setDefaultRenderer(Object.class, new RendenTabla());

        if (tblTareasPendientes.getColumnCount() >= 5) {
            TableColumn columnaAccion = tblTareasPendientes.getColumnModel().getColumn(4);
            columnaAccion.setCellRenderer(new TableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    return (Component) value;
                }
            });
            columnaAccion.setCellEditor(new BotonEditor());

            tblTareasPendientes.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblTareasPendientes.getColumnModel().getColumn(1).setPreferredWidth(160);
            tblTareasPendientes.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblTareasPendientes.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblTareasPendientes.getColumnModel().getColumn(4).setPreferredWidth(60);
        }
    }

    public void agregarTarea(Tarea tarea) {
        tareaService.agregarTarea(tarea);
        actualizarTabla();
    }

    public void actualizarTabla() {
        List<Tarea> tareas = tareaService.obtenerTareas();
        modeloTabla.setRowCount(0);
        for (Tarea t : tareas) {
            JButton btnModificar = new JButton("Modificar");
            modeloTabla.addRow(new Object[]{t.getID(), t.getDescripcion(), t.getFecha(), t.getPrioridad(), btnModificar});
        }
        tblTareasPendientes.setModel(modeloTabla);
    }

    private int generarNuevoID() {
        return nextID++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnAgregarItem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rbPrioridad = new javax.swing.JRadioButton();
        rbFechaL = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTareasPendientes = new javax.swing.JTable();
        lblBuscar = new javax.swing.JLabel();
        rbPrioridadSearch = new javax.swing.JRadioButton();
        rbFechaSearch = new javax.swing.JRadioButton();
        rbDescripcion = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("Tareas Pendientes");

        btnAgregarItem.setBackground(new java.awt.Color(0, 51, 255));
        btnAgregarItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarItem.setText("Agregar Item");
        btnAgregarItem.setBorderPainted(false);
        btnAgregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarItemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ordenar por:");

        rbPrioridad.setBackground(new java.awt.Color(255, 255, 255));
        rbPrioridad.setText("Prioridad");

        rbFechaL.setBackground(new java.awt.Color(255, 255, 255));
        rbFechaL.setText("Fecha Límite");

        tblTareasPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTareasPendientes);

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscar.setText("Buscar por:");

        rbPrioridadSearch.setBackground(new java.awt.Color(255, 255, 255));
        rbPrioridadSearch.setText("Prioridad");

        rbFechaSearch.setBackground(new java.awt.Color(255, 255, 255));
        rbFechaSearch.setText("Fecha Límite");

        rbDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        rbDescripcion.setText("Descripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnAgregarItem)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbFechaL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblBuscar)
                        .addGap(44, 44, 44)
                        .addComponent(rbPrioridadSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(rbFechaSearch)
                        .addGap(42, 42, 42)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(rbDescripcion)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAgregarItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbPrioridad)
                        .addGap(6, 6, 6)
                        .addComponent(rbFechaL)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblBuscar))
                    .addComponent(rbPrioridadSearch))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rbFechaSearch))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(rbDescripcion))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarItemActionPerformed
        int nuevoID = generarNuevoID();
        NuevaTarea nuevaTarea = new NuevaTarea(this, nuevoID);
    }//GEN-LAST:event_btnAgregarItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbDescripcion;
    private javax.swing.JRadioButton rbFechaL;
    private javax.swing.JRadioButton rbFechaSearch;
    private javax.swing.JRadioButton rbPrioridad;
    private javax.swing.JRadioButton rbPrioridadSearch;
    private javax.swing.JTable tblTareasPendientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
