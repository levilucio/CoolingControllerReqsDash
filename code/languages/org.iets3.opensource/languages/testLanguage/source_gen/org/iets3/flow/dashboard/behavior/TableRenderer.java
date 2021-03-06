package org.iets3.flow.dashboard.behavior;

/*Generated by MPS */

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import java.awt.Color;

public class TableRenderer {
  private static final int Status_COl = 2;

  public JTable getNewRenderedTable(JTable table) {
    table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
      @Override
      public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        String status = ((String) table.getModel().getValueAt(row, Status_COl));

        if ("Visited".equals(status)) {
          setBackground(Color.green);
          setForeground(Color.BLACK);
        } else if ("ToCome".equalsIgnoreCase(status)) {
          setBackground(Color.white);
          setForeground(Color.black);
        } else if ("Current".equalsIgnoreCase(status)) {
          setBackground(Color.orange);
          setForeground(Color.black);
        } else if ("DontCare".equalsIgnoreCase(status)) {
          setBackground(Color.gray);
          setForeground(Color.black);
        }
        return this;
      }
    });
    return table;
  }
}
