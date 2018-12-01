

package Vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableCellRendererColor extends DefaultTableCellRenderer{

    private Component componente;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 

        if(value instanceof String){
            
            String valor = (String) value;
            
            if(valor.contains("A")){
                cell.setBackground(Color.yellow);
            } else if(valor.contains("B")){
                cell.setBackground(Color.red);
            } else if(valor.contains("C")){
                cell.setBackground(Color.green);
            } else {
                cell.setBackground(Color.blue);
            }
            
        }

        return cell;
    }
}
