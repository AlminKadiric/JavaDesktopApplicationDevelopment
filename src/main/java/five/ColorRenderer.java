package five;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ColorRenderer extends JLabel implements TableCellRenderer {

   public ColorRenderer(){
       setOpaque(true);
   }


    @Override
    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) {

       if(color instanceof Color) {
           Color newColor = (Color) color;

           setBackground(newColor);
           Border border;

           if (isSelected){
               setText(String.format("RGB(%s,%s,%s)",((Color) color).getRed(),((Color) color).getBlue(),((Color) color).getGreen()));
           border=BorderFactory.createMatteBorder(2,5,5,2,table.getSelectionBackground());
           }
           setToolTipText("Boja: " + color.toString());

       }
        return this;

    }
}
