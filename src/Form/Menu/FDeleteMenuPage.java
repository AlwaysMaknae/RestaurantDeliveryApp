package Form.Menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.FForm;

public class FDeleteMenuPage extends FForm{
	protected JButton BTNSelect, BTNDeleteMenu;
	
	public FDeleteMenuPage() {
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Software");
		
		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel RestaurantListPan = new JPanel();
		RestaurantListPan.setBackground(Color.LIGHT_GRAY);
		RestaurantListPan.setPreferredSize(new Dimension(220, 975));
		MainPan.add(RestaurantListPan);
		
		JPanel ListTitlePan = new JPanel();
		ListTitlePan.setPreferredSize(new Dimension(220, 20));
		ListTitlePan.setBackground(Color.LIGHT_GRAY);
		RestaurantListPan.add(ListTitlePan);
		
		JLabel ListRestaurantTitleLbl = new JLabel("Restaurant");
		ListTitlePan.add(ListRestaurantTitleLbl);
		
		JPanel ListPan = new JPanel();
		ListPan.setBackground(Color.RED);
		ListPan.setPreferredSize(new Dimension(220, 905));
		RestaurantListPan.add(ListPan);
		
		JPanel RestaurantListButtonPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) RestaurantListButtonPan.getLayout();
		flowLayout.setVgap(0);
		RestaurantListButtonPan.setPreferredSize(new Dimension(220, 26));
		RestaurantListPan.add(RestaurantListButtonPan);
		
		BTNSelect = new JButton("Select");
		BTNSelect.setPreferredSize(new Dimension(220, 26));
		RestaurantListButtonPan.add(BTNSelect);
		
		JPanel InnerPan = new JPanel();
		InnerPan.setBackground(Color.LIGHT_GRAY);
		InnerPan.setPreferredSize(new Dimension(745, 975));
		MainPan.add(InnerPan);
		
		JPanel TitlePan = new JPanel();
		TitlePan.setBackground(Color.LIGHT_GRAY);
		TitlePan.setPreferredSize(new Dimension(325, 40));
		InnerPan.add(TitlePan);
		
		JPanel TitleSpacePan = new JPanel();
		TitleSpacePan.setBackground(Color.LIGHT_GRAY);
		TitleSpacePan.setPreferredSize(new Dimension(325, 3));
		TitlePan.add(TitleSpacePan);
		
		JLabel TitleLbl = new JLabel("Delete Menu");
		TitlePan.add(TitleLbl);
		
		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(745, 1));
		InnerPan.add(SpacePan0);
		
		JPanel MenuItemListPan = new JPanel();
		MenuItemListPan.setBackground(Color.RED);
		MenuItemListPan.setPreferredSize(new Dimension(125, 750));
		InnerPan.add(MenuItemListPan);
		
		JPanel DeleteMenuPan = new JPanel();
		DeleteMenuPan.setBackground(Color.LIGHT_GRAY);
		DeleteMenuPan.setPreferredSize(new Dimension(700, 80));
		InnerPan.add(DeleteMenuPan);
		
		BTNDeleteMenu = new JButton("Delete Menu");
		BTNDeleteMenu.setPreferredSize(new Dimension(110, 25));
		DeleteMenuPan.add(BTNDeleteMenu);
		
		repaint();
		revalidate();
		
	}
	
}
