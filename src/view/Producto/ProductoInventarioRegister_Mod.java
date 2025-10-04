package view.Producto;

import dto.ProductoInventario;
import dao.ProductoInventarioDAO;
import dto.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author user
 */
public class ProductoInventarioRegister_Mod extends javax.swing.JDialog {

    private Usuario usuario;
    private ProductoInventarioView productoInventarioView;
    private boolean isModify;
    private int idProducto;
    /**
     * Creates new form ProductoPrueba
     */
    public ProductoInventarioRegister_Mod(java.awt.Frame parent, Usuario usuario, ProductoInventarioView productoInventarioView, boolean isModify, int idProducto) {
        super(parent, isModify ? "Modificar Producto Inventario" : "Registro de Producto Inventario", true);
        this.usuario = usuario;
        this.productoInventarioView = productoInventarioView; 
        this.isModify = isModify;
        this.idProducto = idProducto;
        initComponents();
        addNumberInputValidation();
        if (isModify) {
            loadProductData();
        }
         setLocationRelativeTo(null);
    }
    private void addNumberInputValidation() {
        KeyAdapter numberInputValidation = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                } else if (c == '.' && text.contains(".")) {
                    e.consume();
                }
            }
        };
        
        txtPrecio.addKeyListener(numberInputValidation);
        txtStock.addKeyListener(numberInputValidation);
    }
    
    private void loadProductData() {
        ProductoInventarioDAO productoInventarioDAO = new ProductoInventarioDAO();
        ProductoInventario productoInventario = productoInventarioDAO.obtenerProductoInventarioPorId(idProducto);
        if (productoInventario != null) {
            txtNombre.setText(productoInventario.getNombre());
            txtDescripcion.setText(productoInventario.getDescripcion());
            txtPrecio.setText(String.valueOf(productoInventario.getPrecio()));
            txtStock.setText(String.valueOf(productoInventario.getStock()));
            txtCategoria.setText(productoInventario.getCategoria());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(175, 18, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TAMBOmain.png"))); // NOI18N
        jPanel1.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 160, 60));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio:");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblStock.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(255, 255, 255));
        lblStock.setText("Stock:");
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categoria:");
        jPanel1.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 220, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, -1));
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 220, -1));
        jPanel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 220, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 238, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-lazo-marcapáginas-24.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 238, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-eliminar-24 (1).png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
                String nombre = txtNombre.getText().trim();
                String descripcion = txtDescripcion.getText().trim();
                double precio = Double.parseDouble(txtPrecio.getText().trim());
                int stock = Integer.parseInt(txtStock.getText().trim());
                String categoria = txtCategoria.getText().trim();

                ProductoInventario nuevoProductoInventario = new ProductoInventario(idProducto, nombre, descripcion, precio, 0, stock, categoria);
                ProductoInventarioDAO productoInventarioDAO = new ProductoInventarioDAO();
                int errorCode;
                    
                if (isModify) {
                    errorCode = productoInventarioDAO.modificarProductoInventario(nuevoProductoInventario);
                } else {
                    errorCode = productoInventarioDAO.insertarProductoInventario(nuevoProductoInventario);
                }    

                if (errorCode == 0) {
                    JOptionPane.showMessageDialog(ProductoInventarioRegister_Mod.this,
                            isModify ? "Producto modificado exitosamente." : "Producto registrado exitosamente.",
                            "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (productoInventarioView != null) {
                        productoInventarioView.refreshProductosInventario(); 
                    }
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(ProductoInventarioRegister_Mod.this,
                            "Error al " + (isModify ? "modificar" : "registrar") + " el producto.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }                               
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

                dispose();
      

    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
