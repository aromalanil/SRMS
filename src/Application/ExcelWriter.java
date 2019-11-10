/*
 * The MIT License
 *
 * Copyright 2019 Aromal.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Application;


import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
/**
 *
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
        infoBox(fileName+".csv is generated", "Export Finish");

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
