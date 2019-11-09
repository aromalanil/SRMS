/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;
/**
 *
 * @author Aromal
 */
public class ExcelWriter
{
     public void toExcel(JTable table, String filename)
    {
    try{
        TableModel model = table.getModel();
        FileWriter excel = new FileWriter(filename);

        for(int i = 0; i < model.getColumnCount(); i++){
            excel.write(model.getColumnName(i) + ",");
        }

        excel.write("\n");

        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                excel.write(model.getValueAt(i,j).toString()+",");
            }
            excel.write("\n");
        }

        excel.close();
        System.out.println("Done");

    }catch(IOException e){ System.out.println(e); }
    }
}
