package proyecto;

import javax.swing.table.DefaultTableModel;

public class vMostrar extends javax.swing.JPanel {

    public vMostrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Juegos registrados");

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
protected void mostrar(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnCount(0);
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Plataforma");
        model.addColumn("Género");
        model.addColumn("Lanzamiento");
        model.addColumn("Versión");
        model.addColumn("Desarrollador");
        model.addColumn("Clasificación");
        model.addColumn("Peso");
        model.addColumn("Lenguaje");
        
        ConsultorioV cl = new ConsultorioV();
        for (Videojuegos v : cl.consultarTabla()) {
            model.addRow(new Object[]{v.getVid(), v.getNombre(), v.getPlataforma(), v.getGenero(), v.getFlanzamiento(), v.getVer(), v.getDesarrollador(), v.getClasificacion(), v.getPeso(), v.getLenguaje()});
        }
        tblMostrar.setModel(model);
        
    }
}
