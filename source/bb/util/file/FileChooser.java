package bb.util.file;


import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;


/**
 * @author BB20101997
 *
 */
public class FileChooser {
	
	/**
	 * @param frame the parent JFrame
	 * @param Button the Text of the Approval Button
	 * @param mode the FileSelectionMode
	 * @return the chosen File
	 */
	public static File chooseFile(JFrame frame, String Button,int mode){
		
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(mode);
		jfc.setMultiSelectionEnabled(false);
		jfc.setAcceptAllFileFilterUsed(true);
		
		int succes = jfc.showDialog(frame,Button);
		if(succes == JFileChooser.APPROVE_OPTION){
			File f = jfc.getSelectedFile();
			return f;
		}
		return null;
	}
	
	/**
	 * @param frame the parent JFrame
	 * @param Button the Text of the Approval Button
	 * @param mode the FileSelectionMode
	 * @return the chosen Files
	 */
	public static File[] chooseFiles(JFrame frame,String Button,int mode){
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(mode);
		jfc.setMultiSelectionEnabled(false);
		jfc.setAcceptAllFileFilterUsed(true);
		
		int succes = jfc.showDialog(frame,Button);
		if(succes == JFileChooser.APPROVE_OPTION){
			File[] f = jfc.getSelectedFiles();
			return f;
		}
		return null;
	}
	
}