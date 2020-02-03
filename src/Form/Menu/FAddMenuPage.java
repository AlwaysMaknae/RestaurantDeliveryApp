package Form.Menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import utils.FForm;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FAddMenuPage extends FForm{
	
	protected JTextField TFItem;
	protected JTextField TFPrice;
	protected JButton BTNAddItem, BTNSelect, BTNCreateMenu;

	public FAddMenuPage() {
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
	
	JLabel TitleLbl = new JLabel("Create Menu");
	TitlePan.add(TitleLbl);
	
	JPanel SpacePan0 = new JPanel();
	SpacePan0.setBackground(Color.LIGHT_GRAY);
	SpacePan0.setPreferredSize(new Dimension(745, 1));
	InnerPan.add(SpacePan0);
	
	JPanel MenuItemListPan = new JPanel();
	MenuItemListPan.setBackground(Color.RED);
	MenuItemListPan.setPreferredSize(new Dimension(325, 600));
	InnerPan.add(MenuItemListPan);
	
	JPanel SpacePan1 = new JPanel();
	SpacePan1.setBackground(Color.LIGHT_GRAY);
	SpacePan1.setPreferredSize(new Dimension(745, 1));
	InnerPan.add(SpacePan1);
	
	JPanel CreateMenuPan = new JPanel();
	CreateMenuPan.setBackground(Color.LIGHT_GRAY);
	CreateMenuPan.setPreferredSize(new Dimension(325, 80));
	InnerPan.add(CreateMenuPan);
	
	BTNCreateMenu = new JButton("Create Menu");
	BTNCreateMenu.setPreferredSize(new Dimension(110, 25));
	CreateMenuPan.add(BTNCreateMenu);
	
	JPanel SpacePan2 = new JPanel();
	SpacePan2.setBackground(Color.LIGHT_GRAY);
	SpacePan2.setPreferredSize(new Dimension(745, 1));
	InnerPan.add(SpacePan2);
	
	JPanel AddItemPan = new JPanel();
	AddItemPan.setBackground(Color.LIGHT_GRAY);
	AddItemPan.setPreferredSize(new Dimension(325, 210));
	InnerPan.add(AddItemPan);
	
	JLabel AddItemLbl = new JLabel("Add Item");
	AddItemPan.add(AddItemLbl);
	
	JPanel ItemSpacePan = new JPanel();
	ItemSpacePan.setBackground(Color.LIGHT_GRAY);
	ItemSpacePan.setPreferredSize(new Dimension(325, 1));
	AddItemPan.add(ItemSpacePan);
	
	JLabel ItemLbl = new JLabel("Item:");
	ItemLbl.setPreferredSize(new Dimension(45, 14));
	AddItemPan.add(ItemLbl);
	
	TFItem = new JTextField();
	TFItem.setPreferredSize(new Dimension(250, 20));
	AddItemPan.add(TFItem);
	
	JLabel PriceLbl = new JLabel("Price $:");
	PriceLbl.setPreferredSize(new Dimension(45, 14));
	AddItemPan.add(PriceLbl);
	
	TFPrice = new JTextField();
	TFPrice.setPreferredSize(new Dimension(250, 20));
	AddItemPan.add(TFPrice);
	
	BTNAddItem = new JButton("Add Item");
	BTNAddItem.setPreferredSize(new Dimension(85, 25));
	AddItemPan.add(BTNAddItem);
	
	repaint();
	revalidate();
	
	}	
}
