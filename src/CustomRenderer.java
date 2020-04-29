import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * 
 * @author Victor
 */
class CustomRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if(hasFocus)
            table.setRowSelectionInterval(row, row);
        
        switch((int) Integer.valueOf((String) value)) {
            case 0: 
                if(table.getSelectedRow() == row && isSelected) {
                    c.setBackground(Color.BLUE);
                } else c.setBackground(Color.GREEN);
                c.setEnabled(true);
                c.setFocusable(true);
                break;
            case 1: 
                c.setBackground(Color.YELLOW);
                c.setEnabled(false);
                c.setFocusable(false);
                break;
            case 2: 
                c.setBackground(Color.RED);
                c.setEnabled(false);
                c.setFocusable(false);
                break;
        }
        return c;
    }
}