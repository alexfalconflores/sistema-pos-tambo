
package view.Usuario;

import dao.UsuarioDAO;
import dto.Usuario;
import Utilitarios.IconButtonEditor;
import Utilitarios.IconButtonRenderer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableColumn;

public class UsuarioView extends javax.swing.JPanel {

    private JTable tblUsuario;
    private JButton btnInsertar;
    private JButton btnModificar;
    private JButton btnEliminar;
    private Usuario usuario;
    
    public UsuarioView(Usuario usuario) {
        this.usuario = usuario;
        setBackground(new Color(175, 18, 128)); 
        initComponents();
        inicio();
        loadUsuarios();
    }

    private void inicio() {
        setLayout(new BorderLayout());

        JPanel panelTituloBotones = new JPanel(new BorderLayout());
        panelTituloBotones.setBackground(new Color(175, 18, 128)); 

        JLabel lblTitulo = new JLabel("USUARIO");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(255,238,0)); 
        panelTituloBotones.add(lblTitulo, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        btnInsertar = new JButton("Insertar");
        panelBotones.setBackground(new Color(175, 18, 128));

        panelBotones.add(btnInsertar);

        btnInsertar.setBackground(new Color(255,238,0));
        btnInsertar.setForeground(new Color(175, 18, 128));
        panelTituloBotones.add(panelBotones, BorderLayout.EAST);
        add(panelTituloBotones, BorderLayout.NORTH);

        tblUsuario = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{"", "", "ID", "Nombre", "Apellido", "Correo Electrónico", "Rol"}
        ));
        TableColumnModel columnModel = tblUsuario.getColumnModel();

        TableColumn modificarColumn = columnModel.getColumn(0);
        modificarColumn.setCellRenderer(new IconButtonRenderer());
        modificarColumn.setCellEditor(new IconButtonEditor(new JCheckBox(), tblUsuario, usuario, UsuarioView.this));
        modificarColumn.setMaxWidth(25);

        TableColumn eliminarColumn = columnModel.getColumn(1);
        eliminarColumn.setCellRenderer(new IconButtonRenderer());
        eliminarColumn.setCellEditor(new IconButtonEditor(new JCheckBox(), tblUsuario, usuario, UsuarioView.this));
        eliminarColumn.setMaxWidth(25);
        
        int alturaFila = 30;
        tblUsuario.setRowHeight(alturaFila);
        
        tblUsuario.setBackground(new Color(220, 190, 255)); 
        tblUsuario.setForeground(new Color(75, 0, 130)); 

        tblUsuario.setSelectionBackground(new Color(180, 130, 255)); 
        tblUsuario.setSelectionForeground(Color.WHITE); 

        tblUsuario.getTableHeader().setBackground(new Color(75, 0, 130)); 
        tblUsuario.getTableHeader().setForeground(new Color(75, 0, 130));
        
        
        JScrollPane scrollPane = new JScrollPane(tblUsuario);
        scrollPane.getViewport().setBackground(new Color(175, 18, 128)); // Amarillo suave
        add(scrollPane, BorderLayout.CENTER);
        
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioRegistro();
            }
        });
    }
    
    private void loadUsuarios() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
        DefaultTableModel model = (DefaultTableModel) tblUsuario.getModel();
        for (Usuario usuario : usuarios) {
            int idUsuario = usuario.getIdUsuario();
            String nombre = usuario.getNombre();
            String apellido = usuario.getApellido();
            String correoElectronico = usuario.getCorreoElectronico();
            String rol = usuario.getRol();
    
            Object[] rowData = new Object[model.getColumnCount()]; 

            rowData[2] = idUsuario; 
            rowData[3] = nombre;
            rowData[4] = apellido; 
            rowData[5] = correoElectronico;
            rowData[6] = rol;

            model.addRow(rowData);
        }
    }
    
    private void abrirFormularioRegistro() {
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        UsuarioRegister_Modf registroUsuarioForm = new UsuarioRegister_Modf(parentFrame, usuario, UsuarioView.this, false, 0);
        registroUsuarioForm.setVisible(true);
    }
    
    public void refreshUsuarios() {
        DefaultTableModel model = (DefaultTableModel) tblUsuario.getModel();
        model.setRowCount(0);
        
        loadUsuarios();
    }
    
    public JButton getBtnInsertar() {
        return btnInsertar;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
