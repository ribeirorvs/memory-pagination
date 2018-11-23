	



	import javax.swing.table.*;
	import javax.swing.*;
	import java.awt.*;
	
	public class FIFO_Table
	{
		Object data[][];
		String str;
		JLabel jlbl;
		int row,col,i,j,k;
		TableModel dataModel;
		DefaultTableCellRenderer colorRenderer;
	  	public FIFO_Table(int irow,int icol) 
	        {
	            row = irow;
	            col=  icol;
	            data = new Object[row][col];
	            jlbl = new JLabel("sam");
	            jlbl.setForeground(Color.black);
	            str="sam";
	            for(i=0;i<row;i++)
	            {
	                    for(j=0;j<col;j++)
	                    {
	                            data[i][j]="";                            
	                    }
	            }  		
	                    resetModel();    		
	        }
	     
	     public void resetModel()
	     {	     		
	            dataModel = new AbstractTableModel() {
	            public int getColumnCount() { return col; }
	            public int getRowCount() { return row;}
	            public Object getValueAt(int rowi, int coli) {return data[rowi][coli];}
	            public String getColumnName(int column) {return "";}
	            public Class getColumnClass(int c) {return getValueAt(0, c).getClass();}
		    	public boolean isCellEditable(int rowi, int coli) {return false;}
	            public void setValueAt(Object aValue, int rowi, int columni) { data[rowi][columni] = aValue; }
	         };         
	     }
	     
	     
	     public boolean GetObj()
	     {
	         for(i=0;i<row;i++)
	    	{
	    		for(j=0;j<col;j++)
	    		{
	    			if(!data[i][j].toString().equals(""))
	                            return true;
	    		}
	    	}     	
	        return false;
	     }
	     
	     public void resetObj()
	     {
	     	data = new Object[row][col];
	    	for(i=0;i<row;i++)
	    	{
	    		for(j=0;j<col;j++)
	    		{
	    			data[i][j]=new Object();
	    			data[i][j]="";
	    		}
	    	}     	
	     }
	    
	    public void setVal(int irow,int icol,int ino)
	    {
	    	data[irow][icol]=String.valueOf(ino);
	    	resetModel();    	
	    }
	    
	}
