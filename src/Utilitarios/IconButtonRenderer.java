/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class IconButtonRenderer extends JButton implements TableCellRenderer {
    public IconButtonRenderer() {
        setOpaque(true);
        setPreferredSize(new Dimension(25, 25));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        if (column == 0) {
            setIcon(new ImageIcon(getClass().getResource("/resources/edit_modify_icon_149489.png")));
        } else if (column == 1) {
            setIcon(new ImageIcon(getClass().getResource("/resources/small_x_icon_212667.png")));
        }

        return this;
    }
}

