package vol1.chap06.exam;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.NoSuchFileException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.jhlee.logger.LoggingImageViewer;
import com.jhlee.logger.Simple;

/*
 *  No.5 시험문제
 */



public class TheBetter {	
	public static void main(String[] args) {
	Logger logger = Logger.getLogger("vol1.chap06.exam");
	logger.setLevel(Level.INFO);
	logger.setUseParentHandlers(false);
	var handler = new ConsoleHandler();
	handler.setLevel(Level.INFO);
	logger.addHandler(handler);
	final int LOG_ROTATION_COUNT = 3;
	FileHandler fhandler;
	try {
		fhandler = new FileHandler("D:/LOG/exam6_prob5.%g.log", 0, LOG_ROTATION_COUNT);

		fhandler.setLevel(Level.INFO);

		logger.addHandler(fhandler);
		logger.info("프로그램 가동");
		logger.info("Hello 세상");
		}catch (NoSuchFileException e) {
			System.out.println("파일오류" + e.getFile());
			System.out.println("프로그램 종료!");
		}
		catch (SecurityException | IOException e) {
		e.printStackTrace();
		
		}
	}
}


