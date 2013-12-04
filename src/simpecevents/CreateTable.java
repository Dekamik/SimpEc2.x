package simpecevents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;

import simpecgui.SimpEcTableFrame;

public class CreateTable implements ActionListener {
	
	JDesktopPane d;
	
	public CreateTable(JDesktopPane d) {
		this.d = d;
	}

	public void actionPerformed(ActionEvent e) {
		d.add(new SimpEcTableFrame("FooBar"));
	}
}
