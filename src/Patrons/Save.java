package Patrons;

import java.io.File;

import javax.swing.JFileChooser;

public class Save implements Command{
	
	private static Save instance = new Save();
	
	public Save(){}
	
	public static Save getInstance(){
		return instance;
	}
	
	@Override
	public boolean execute() {
		JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + File.separator + "Downloads"));

		int returnVal = chooser.showSaveDialog(null);

		if(returnVal == JFileChooser.APPROVE_OPTION) {
			
		}else{

		}
		return true;
	}

	@Override
	public void reDo() {
		//Do nothing
	}

	@Override
	public void unDo() {
		//Do nothing
	}
}
