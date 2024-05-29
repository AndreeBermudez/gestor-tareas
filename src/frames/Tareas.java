package frames;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import logica.ITarea;
import logica.ImplementacionTarea;

/**
 *
 * @author Andree Bermúdez
 */
public class Tareas extends javax.swing.JFrame {

    private final ITarea tareaService;

    public Tareas() {
        initComponents();
        tareaService = new ImplementacionTarea();
        mostrarPanel(new PanelTareasPendientes(tareaService));
    }

    private void mostrarPanel(JPanel p) {
        p.setSize(600, 491);
        p.setLocation(0, 0);
        panelPrincipal.removeAll();
        panelPrincipal.add(p, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        if (p instanceof PanelTareasPendientes) {
            ((PanelTareasPendientes) p).actualizarTabla();
        } else if (p instanceof PanelTareasRealizar) {
            ((PanelTareasRealizar) p).actualizarTabla();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPrincipal = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        btnPendientes = new javax.swing.JButton();
        btnRealizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        fondoPrincipal.setPreferredSize(new java.awt.Dimension(675, 492));
        fondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        fondoPrincipal.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 74, -1, 440));

        btnPendientes.setBackground(new java.awt.Color(255, 255, 0));
        btnPendientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPendientes.setForeground(new java.awt.Color(0, 0, 0));
        btnPendientes.setText("Tareas \nPendientes");
        btnPendientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPendientes.setBorderPainted(false);
        btnPendientes.setPreferredSize(new java.awt.Dimension(100, 50));
        btnPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendientesActionPerformed(evt);
            }
        });
        fondoPrincipal.add(btnPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 20, 150, 50));

        btnRealizar.setBackground(new java.awt.Color(204, 204, 204));
        btnRealizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRealizar.setForeground(new java.awt.Color(0, 0, 0));
        btnRealizar.setText("Tareas por Realizar ");
        btnRealizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizar.setBorderPainted(false);
        btnRealizar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });
        fondoPrincipal.add(btnRealizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        mostrarPanel(new PanelTareasRealizar(tareaService));
    }//GEN-LAST:event_btnRealizarActionPerformed

    private void btnPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendientesActionPerformed
        mostrarPanel(new PanelTareasPendientes(tareaService));
    }//GEN-LAST:event_btnPendientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPendientes;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JPanel fondoPrincipal;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
