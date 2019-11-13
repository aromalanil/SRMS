
package Application;


import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 * @author Aromal
 */

public class ExcelWriter
{
     public void toExcel(JTable table,String fileName)
    {
        String filename = null;
        try{
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        f.showSaveDialog(null);

        filename=f.getSelectedFile()+"\\"+fileName+".csv";
        System.out.println(f.getCurrentDirectory());
        System.out.println(f.getSelectedFile());
        TableModel model = table.getModel();
        FileWriter excel = new FileWriter(filename);

        for(int i = 0; i < model.getColumnCount(); i++){
            excel.write(model.getColumnName(i) + ",");
        }

        excel.write("\n");

        for(int i=0; i< model.getRowCount(); i++) 
        {
            for(int j=0; j < model.getColumnCount(); j++) 
            {
                excel.write(model.getValueAt(i,j).toString()+",");
            }
            excel.write("\n");
        }

        excel.close();
        infoBox(fileName+".csv is generated", "Export Finished");

        }
        catch(IOException e)
        {
            System.out.println(e); 
        }
      }
     
         //Methord for Info box
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
