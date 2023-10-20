package five;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorCellEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

    private Color currentColor;
    private JButton button;
    private JColorChooser colorChooser;
    private JDialog dialog;


    public ColorCellEditor(){
        this.button = new JButton();
        this.button.setBorderPainted(false);
        this.colorChooser = new JColorChooser();
        this.dialog= JColorChooser.createDialog(button,"Pick a color!",true,colorChooser,this::onColorChangeExecute,null);
       this.button.addActionListener(this::nekoNaButtonKlikno);

    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        currentColor = (Color) value;
        button.setText("EDIT");

        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return currentColor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.setVisible(true);

    }

    public void  nekoNaButtonKlikno(ActionEvent event){
        dialog.setVisible(true);
    }
    public void onColorChangeExecute(ActionEvent event){
        currentColor = colorChooser.getColor();
        button.setVisible(false);

    }
}
