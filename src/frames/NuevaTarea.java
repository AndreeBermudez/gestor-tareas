package frames;

import logica.Tarea;

/**
 *
 * @author Andree Bermúdez
 */
public class NuevaTarea extends javax.swing.JFrame {

    private final PanelTareasPendientes ventanaTareasPendientes;
    private final int tareaID;

    public NuevaTarea(PanelTareasPendientes ventanaTareasPendientes, int tareaID) {
        initComponents();
        this.ventanaTareasPendientes = ventanaTareasPendientes;
        this.tareaID=tareaID;
        this.setTitle("Nueva Tarea");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoNuevaTare = new javax.swing.JPanel();
        panelTarea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cmbPrioridad = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        fondoNuevaTare.setBackground(new java.awt.Color(255, 255, 255));

        panelTarea.setBackground(new java.awt.Color(255, 255, 255));
        panelTarea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tarea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        panelTarea.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Descripción:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha Límite:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Prioridad");

        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Medio", "Alta" }));

        javax.swing.GroupLayout panelTareaLayout = new javax.swing.GroupLayout(panelTarea);
        panelTarea.setLayout(panelTareaLayout);
        panelTareaLayout.setHorizontalGroup(
            panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTareaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbPrioridad, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelTareaLayout.setVerticalGroup(
            panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTareaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnAgregar.setBackground(new java.awt.Color(0, 51, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Aceptar");
        btnAgregar.setBorderPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);

        javax.swing.GroupLayout fondoNuevaTareLayout = new javax.swing.GroupLayout(fondoNuevaTare);
        fondoNuevaTare.setLayout(fondoNuevaTareLayout);
        fondoNuevaTareLayout.setHorizontalGroup(
            fondoNuevaTareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoNuevaTareLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(fondoNuevaTareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoNuevaTareLayout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        fondoNuevaTareLayout.setVerticalGroup(
            fondoNuevaTareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoNuevaTareLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(panelTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(fondoNuevaTareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoNuevaTare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoNuevaTare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String descripcion = txtDesc.getText();
        String fecha = txtFecha.getText();
        int prioridad = cmbPrioridad.getSelectedIndex();
        Tarea nuevaTarea = new Tarea(tareaID,descripcion, fecha, prioridad);
        ventanaTareasPendientes.agregarTarea(nuevaTarea);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JPanel fondoNuevaTare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelTarea;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
