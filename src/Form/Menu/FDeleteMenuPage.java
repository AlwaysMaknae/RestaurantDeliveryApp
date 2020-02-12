package Form.Menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.FButton;
import utils.FForm;
import utils.FLabel;
import utils.FListView;

public class FDeleteMenuPage extends FForm {

	protected FButton BTNSelect, BTNDeleteMenu;

	protected FListView ListPan, MenuItemListPan;

	public FDeleteMenuPage() {

		setSize(984, 1040);
		getContentPane().setBackground(Color.LIGHT_GRAY);
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

		FLabel ListRestaurantTitleLbl = new FLabel("Restaurant");
		ListTitlePan.add(ListRestaurantTitleLbl);

		ListPan = new FListView();
		ListPan.setPreferredSize(new Dimension(220, 905));
		RestaurantListPan.add(ListPan);

		JPanel RestaurantListButtonPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) RestaurantListButtonPan.getLayout();
		flowLayout.setVgap(0);
		RestaurantListButtonPan.setPreferredSize(new Dimension(220, 26));
		RestaurantListPan.add(RestaurantListButtonPan);

		BTNSelect = new FButton("Select");
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

		FLabel TitleLbl = new FLabel("Delete Menu");
		TitlePan.add(TitleLbl);

		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(745, 1));
		InnerPan.add(SpacePan0);

		MenuItemListPan = new FListView();
		MenuItemListPan.setPreferredSize(new Dimension(125, 750));
		InnerPan.add(MenuItemListPan);

		JPanel DeleteMenuPan = new JPanel();
		DeleteMenuPan.setBackground(Color.LIGHT_GRAY);
		DeleteMenuPan.setPreferredSize(new Dimension(700, 80));
		InnerPan.add(DeleteMenuPan);

		BTNDeleteMenu = new FButton("Delete Menu");
		BTNDeleteMenu.setPreferredSize(new Dimension(110, 25));
		DeleteMenuPan.add(BTNDeleteMenu);

		repaint();
		revalidate();

	}

}
