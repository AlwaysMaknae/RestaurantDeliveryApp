package utils;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class FLabel extends JLabel {
	public FLabel(String text) {
		this.setText(text);
		this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN, 12));
	}
	public FLabel(String text, Dimension size) {
		this(text);
		this.setPreferredSize(size);
	}
	public FLabel(String text, Boolean DefaultSize) {
		this(text, new Dimension(150,24));
	}
}
