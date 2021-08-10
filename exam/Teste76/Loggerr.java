package Teste76;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
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



public class Loggerr {	
	public static void main(String[] args) {
	Logger logger = Logger.getLogger("vol1.chap06.exam");
	logger.setLevel(Level.FINEST);
	logger.setUseParentHandlers(false);
	var handler = new ConsoleHandler();
	handler.setLevel(Level.FINE);
	logger.addHandler(handler);
	
	FileHandler fhandler;
	try {
		fhandler = new FileHandler("D:/LOG/exam6_prob5.%g.log", 0, 
					3);

		fhandler.setLevel(Level.FINEST);
		final int LOG_ROTATION_COUNT = 3;
		logger.addHandler(fhandler);
		logger.config("프로그램 가동");
		logger.finer("프로그램 가동");
	} catch (SecurityException | IOException e) {
		e.printStackTrace();
		}
	}
}


