package utils;

import java.awt.Component;
import java.util.Arrays;

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

	public static int ConfirmOrder(String title, String msg, int optionType) {
		int res = JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		return res;

	}

	public static void Say(String title, String msg) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
	}

	public static String Ask(String title, String question) {
		return JOptionPane.showInputDialog(null, question, title, JOptionPane.INFORMATION_MESSAGE);
	}

	public static boolean AskOrder(String title, Object[] question) {
		int res1 = JOptionPane.showConfirmDialog(null, question, title, JOptionPane.OK_CANCEL_OPTION ,JOptionPane.INFORMATION_MESSAGE);
		if (res1 == 0) {
			return true;
		} else {
			return false;
		} 
	}

	public static boolean AskDeliverer(String title, Object[] question) {
		int res2 = JOptionPane.showConfirmDialog(null, question, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);

		if (res2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
