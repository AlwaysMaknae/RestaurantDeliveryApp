package utils;

import java.awt.Component;

import javax.swing.JOptionPane;

public abstract class FAlerts {

	public static void Error(String title, String msg) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
	}

	public static boolean Confirm(String title, String msg) {
		int res = JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (res == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void Say(String title, String msg) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
	}

	public static String Ask(String title, String question) {
		return JOptionPane.showInputDialog(null, question, title, JOptionPane.INFORMATION_MESSAGE);
	}

}
