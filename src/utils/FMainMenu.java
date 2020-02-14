package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Form.Client.FDeleteAccount;
import Form.Client.FEditAccount;
import Form.Client.FOrderFood;
import Form.Client.FViewOrderFoodHistory;
import Form.Deliverers.FAddDeliverer;
import Form.Deliverers.FDeleteDeliverer;
import Form.Deliverers.FEditDeliverer;
import Form.DeliveryGuy.FAcceptDeliveryGuy;
import Form.DeliveryGuy.FDoneDeliveryGuy;
import Form.DeliveryGuy.FViewDeliveryGuy;
import Form.Manager.FViewRestaurantOrder;
import Form.Menu.FAddMenu;
import Form.Menu.FDeleteMenu;
import Form.Menu.FEditMenu;
import Form.Restaurant.FAddRestaurant;
import Form.Restaurant.FEditRestaurant;
import Form.Restauranteur.FAcceptOrder;
import Form.Restauranteur.FOrderReady;
import database.Session;

public class FMainMenu extends JMenuBar {
	
	
	private static String UserType = "";
	
	//File Menu
	protected JMenuItem file_disconnect, file_quit;
	
	//Admin Menu
	protected JMenuItem r_add, r_edit, r_delete;
	protected JMenuItem m_add, m_edit, m_delete;
	protected JMenuItem d_add, d_edit, d_delete;
	
	//Restaurater
	protected JMenuItem ro_accept, ro_ready;
	
	//Manager
	protected JMenuItem ma_vorder, ma_editmenu, ma_createmenu, ma_deletemenu, ma_editrestaurant;
	
	
	//Deli Menu
	protected JMenuItem dl_view, dl_accept, dl_conf;
	

	//Client
	protected JMenuItem ca_edit, ca_close, c_orders, co_order, co_history;
	
	
	
	public FMainMenu(FForm link){
		
		UserType = Session.AccesType;
		
		//file menu
		JMenu file = new JMenu("File");
		file_disconnect = new JMenuItem("Disconnect");
		file_quit = new JMenuItem("Quit");
		file.add(file_disconnect);
		file.add(file_quit);
		this.add(file);

		file_disconnect.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Navigator.Disconnect(link);
			}
		});
		
		file_quit.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Navigator.Quit();
			}
		});
		
		
		if(UserType.equals("Admin")){
		//rest menu
		JMenu restaurant = new JMenu("Restaurant");
		//add,edit,delelte
		r_add = new JMenuItem("Add Restaurant");
		r_edit = new JMenuItem("Edit Restaurant");
		r_delete = new JMenuItem("Delete Restaurant");
		restaurant.add(r_add);
		restaurant.add(r_edit);
		restaurant.add(r_delete);
		
		r_add.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FAddRestaurant();
				link.dispose();
			}
		});
		r_edit.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FEditRestaurant();
				link.dispose();
			}
		});
		r_delete.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FEditRestaurant();
				link.dispose();
			}
		});
		

		//menu menu
		JMenu mmenu = new JMenu("Menu");
		//add,edit,delete
		m_add = new JMenuItem("Add Menu");
		m_edit = new JMenuItem("Edit Menu");
		m_delete = new JMenuItem("Delete Menu");
		mmenu.add(m_add);
		mmenu.add(m_edit);
		mmenu.add(m_delete);
		m_add.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FAddMenu();
				link.dispose();
			}
		});
		m_edit.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FEditMenu();
				link.dispose();
			}
		});
		m_delete.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FDeleteMenu();
				link.dispose();
			}
		});
		
		
		
		
		
		//dman
		JMenu deliveryGuy = new JMenu("Delivery Guy");
		//add,edit,delete
		d_add = new JMenuItem("Add Delivery Guy");
		d_edit = new JMenuItem("Edit Delivery Guy");
		d_delete = new JMenuItem("Delete Delivery Guy");
		deliveryGuy.add(d_add);
		deliveryGuy.add(d_edit);
		deliveryGuy.add(d_delete);
		d_add.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FAddDeliverer();
				link.dispose();
			}
		});
		d_edit.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FEditDeliverer();
				link.dispose();
			}
		});
		d_delete.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FDeleteDeliverer();
				link.dispose();
			}
		});
		
		//AdminMenu
		this.add(restaurant);
		this.add(mmenu);
		this.add(deliveryGuy);
		
		
		
		} else if(UserType.equals("Deliverer")) {
		
		//DeliveryGuyMenu
		//File
		/* Delivery : 
		 * 	View
		 * 	Accept
		 * 	Delivery Made
		 * */
		JMenu d_livery = new JMenu("Deliverer:Delivery");
		dl_view= new JMenuItem("View Delivery");
		dl_accept = new JMenuItem("Accept Delivery");
		dl_conf = new JMenuItem("Delivery Made");
		d_livery.add(dl_view);
		d_livery.add(dl_accept);
		d_livery.add(dl_conf);
		this.add(d_livery);
		dl_view.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FViewDeliveryGuy();
				link.dispose();
			}
		});
		dl_accept.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FAcceptDeliveryGuy();
				link.dispose();
			}
		});
		dl_conf.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FDoneDeliveryGuy();
				link.dispose();
			}
		});
		

		} else if(UserType.equals("Restaurateur")) {
		
		//Restaurateur
		/*Order
		 * Accept Order
		 * Order Ready
		 * */
		JMenu r_order = new JMenu("Restaurateur:Order");
		ro_accept = new JMenuItem("Accept Order");
		ro_ready = new JMenuItem("Order Ready");
		r_order.add(ro_accept);
		r_order.add(ro_ready);
		this.add(r_order);
		
		ro_accept.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FAcceptOrder();
				link.dispose();
			}
		});
		ro_ready.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FOrderReady();
				link.dispose();
			}
		});
		

		} else if (UserType.equals("Manager") ) {
		//Manager
		/*Order
		 * View Restaurant Orders
		 * */
		JMenu manager_order = new JMenu("Manager:Order");
		ma_vorder = new JMenuItem("View Restaurant Orders");
		manager_order.add(ma_vorder);
		this.add(manager_order);
		
		manager_order.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FViewRestaurantOrder();
				link.dispose();
			}
		});

		//Client
		//File
		/*Account : 
		 * 	Edit Account
		 * 	Close Account
		 * 
		 * Orders:
		 * 	Order Food
		 * 	Order History
		 * */
		
		} else if(UserType.equals("Client") ){
			
		
		JMenu c_account = new JMenu("Client:Account");
		ca_edit = new JMenuItem("Edit Account");
		ca_close = new JMenuItem("Close Account");
		c_account.add(ca_edit);
		c_account.add(ca_close);
		this.add(c_account);
		
		ca_edit.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FEditAccount();
				link.dispose();
			}
		});
		ca_close.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FDeleteAccount();
				link.dispose();
			}
		});
		
		JMenu c_orders = new JMenu("Client:Orders");
		co_order = new JMenuItem("Order Food");
		co_history = new JMenuItem("Order History");
		c_orders.add(co_order);
		c_orders.add(co_history);
		this.add(c_orders);
		
		co_order.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FOrderFood();
				link.dispose();
			}
		});
		co_history.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FViewOrderFoodHistory();
				link.dispose();
			}
		});

		} else {
			//Going Out
			//FAlerts.Error("User Error", "User not found.");
		}
		
		//End
	}

}
