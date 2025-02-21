/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoAuditoria;
import controlador.DaoCategorias;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.auditoria;

public class Categorias extends javax.swing.JPanel {
    
    Categoria ct=new Categoria();
    DaoCategorias daoCt=new DaoCategorias();
    DefaultTableModel modeloCategoria=new DefaultTableModel();
    
    auditoria aud=new auditoria();
    DaoAuditoria daoAud=new DaoAuditoria();
    MenuPrincipal m=new MenuPrincipal();
    
   public static int iduser=0;
    /**
     * Creates new form Categorias
     */
    public Categorias() {
        initComponents();
        listarCategorias();
        System.out.print(iduser);
    }
    
    private void listarCategorias(){
        List<Categoria> lista=daoCt.Listar();
        modeloCategoria=(DefaultTableModel) tblcategorias.getModel();
        Object[] ob=new Object[2];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getIdCategoria();
            ob[1]=lista.get(i).getNomCategoria();
            modeloCategoria.addRow(ob);
        }
       tblcategorias.setModel(modeloCategoria);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel2 = new javax.swing.JLabel();
        txtidcategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnomCategoria = new javax.swing.JTextField();
        jpanelRound2 = new modelo.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcategorias = new javax.swing.JTable();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar1 = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(238, 238, 238));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setText("Registro De Categorias");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel2.setText("Id");

        jLabel3.setText("Nombre:");

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtidcategoria)
                    .addComponent(txtnomCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnomCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        tblcategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cetegoria"
            }
        ));
        tblcategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcategorias);

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setText("Guardar");
        btnGuardar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardar.setRound(25);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(102, 102, 102));
        btnEditar.setText("Editar");
        btnEditar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnEditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditar.setRound(25);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnEliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnEliminar.setRound(25);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscar.setRound(25);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Complete la Informacion de las Categorias.");

        btnGuardar1.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar1.setBackgroundHover(new java.awt.Color(14, 76, 117));
        btnGuardar1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DASHBOARD);
        btnGuardar1.setRound(25);
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)))
                            .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(327, 327, 327)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        ct.setNomCategoria(txtnomCategoria.getText());
        if(daoCt.insertar(ct)){
            //JOptionPane.showMessageDialog(null, "Categoria Registrada Con Exito");
            m.exito("Categoria Registrada Con Exito");
        }else{
            //JOptionPane.showMessageDialog(null, "No se pudo registrar la Categoria");
            m.error("No se pudo registrar la Categoria");
        }
        limpiarTablaCategoria();
        listarCategorias();
        limpiarCampos();
        registraAuditoria("Registro");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int fila=tblcategorias.getSelectedRow();
        if(fila==-1&&txtidcategoria.getText().isEmpty()){
            //JOptionPane.showMessageDialog(null, "Seleccione una categoria");
            m.advertencia("Seleccione una categoria");
        }else{
            ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
            ct.setNomCategoria(txtnomCategoria.getText());
            if(daoCt.editar(ct)){
                //JOptionPane.showMessageDialog(null, "Se modifico con exito");
                m.exito("Se modifico con exito");
                limpiarTablaCategoria();
                listarCategorias();
                limpiarCampos();
                registraAuditoria("Modificacion");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblcategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcategoriasMouseClicked
        // TODO add your handling code here:
        int fila=tblcategorias.getSelectedRow();
        txtidcategoria.setText(tblcategorias.getValueAt(fila, 0).toString());
        txtnomCategoria.setText(tblcategorias.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tblcategoriasMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(!txtidcategoria.getText().isEmpty()){
            int confirmacion=JOptionPane.showConfirmDialog(null, "¿Es tas seguro de eliminar la categoria?","Confirmar",2);
            if(confirmacion==0){
                ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
                daoCt.eliminar(ct);
                limpiarTablaCategoria();
                listarCategorias();
                limpiarCampos();
                //JOptionPane.showMessageDialog(null, "Se Elimino con exito la cetegoria");
                m.exito("Se Elimino con exito la cetegoria");
                registraAuditoria("Eliminacion");
            }
        }else{
            //JOptionPane.showMessageDialog(null, "Seleccione una categoria");
            m.advertencia("Seleccione una categoria");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
        if(daoCt.buscar(ct)){
            txtidcategoria.setText(ct.getIdCategoria()+"");
            txtnomCategoria.setText(ct.getNomCategoria());
        }else{
            //JOptionPane.showMessageDialog(null, "La Categoria No Existe");
            m.error("La Categoria No Existe");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed


    void limpiarCampos(){
        txtidcategoria.setText("");
        txtnomCategoria.setText("");
    }
    
    void limpiarTablaCategoria(){
        for(int i=0;i<modeloCategoria.getRowCount();i++){
            modeloCategoria.removeRow(i);
            i=0-1;
        }
    }
    private void registraAuditoria(String accion) {
        aud.setTabla("categorias");
        aud.setAccion(accion);
        aud.setIdUsuario(iduser);
        daoAud.insertar(aud);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private javax.swing.JTable tblcategorias;
    private javax.swing.JTextField txtidcategoria;
    private javax.swing.JTextField txtnomCategoria;
    // End of variables declaration//GEN-END:variables

    
}
