package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScheduleViewer extends JFrame {

	public ScheduleViewer() {
//		String column[] = {"NAME", "DATE", "TIME", "LOCATION"};
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("DATE");
		model.addColumn("TIME");
		model.addColumn("LOCATION");

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
