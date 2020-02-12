package utils;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FMainMenu extends JMenuBar {
	
	public FMainMenu(){
		
		//file menu
		JMenu file = new JMenu("File");
		JMenuItem file_disconnect = new JMenuItem("Disconnect");
		JMenuItem file_quit = new JMenuItem("Quit");
		file.add(file_disconnect);
		file.add(file_quit);
		
		
		//rest menu
		JMenu restaurant = new JMenu("Restaurant");
		//add,edit,delelte
		JMenuItem r_add = new JMenuItem("Add Restaurant");
		JMenuItem r_edit = new JMenuItem("Edit Restaurant");
		JMenuItem r_delete = new JMenuItem("Delete Restaurant");
		restaurant.add(r_add);
		restaurant.add(r_edit);
		restaurant.add(r_delete);
		
		//menu menu
		JMenu mmenu = new JMenu("Menu");
		//add,edit,delete
		JMenuItem m_add = new JMenuItem("Add Menu");
		JMenuItem m_edit = new JMenuItem("Edit Menu");
		JMenuItem m_delete = new JMenuItem("Delete Menu");
		mmenu.add(m_add);
		mmenu.add(m_edit);
		mmenu.add(m_delete);
		
		//dman
		JMenu deliveryGuy = new JMenu("Delivery Guy");
		//add,edit,delete
		JMenuItem d_add = new JMenuItem("Add Delivery Guy");
		JMenuItem d_edit = new JMenuItem("Edit Delivery Guy");
		JMenuItem d_delete = new JMenuItem("Delete Delivery Guy");
		deliveryGuy.add(d_add);
		deliveryGuy.add(d_edit);
		deliveryGuy.add(d_delete);
		
		
		//AdminMenu
		this.add(file);
		this.add(restaurant);
		this.add(mmenu);
		this.add(deliveryGuy);
		
		
		
		
		//DeliveryGuyMenu
		//File
		/* Delivery : 
		 * 	View
		 * 	Accept
		 * 	Delivery Made
		 * */
		JMenu d_livery = new JMenu("Deliverer:Delivery");
		JMenuItem dl_view= new JMenuItem("View Delivery");
		JMenuItem dl_accept = new JMenuItem("Accept Delivery");
		JMenuItem dl_conf = new JMenuItem("Delivery Made");
		d_livery.add(dl_view);
		d_livery.add(dl_accept);
		d_livery.add(dl_conf);
		this.add(d_livery);
		
		
		//Restaurateur
		//File
		/*Order
		 * Accept Order
		 * Order Ready
		 * */
		JMenu r_order = new JMenu("Restaurateur:Order");
		JMenuItem ro_accept = new JMenuItem("Accept Order");
		JMenuItem ro_ready = new JMenuItem("Order Ready");
		r_order.add(ro_accept);
		r_order.add(ro_ready);
		this.add(r_order);
		
		//Manager
		//File
		/*Order
		 * View Restaurant Orders
		 * */
		JMenu manager_order = new JMenu("Manager:Order");
		JMenuItem ma_vorder = new JMenuItem("View Restaurant Orders");
		manager_order.add(ma_vorder);
		this.add(manager_order);
		
		
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
		JMenu c_account = new JMenu("Client:Account");
		JMenuItem ca_edit = new JMenuItem("Edit Account");
		JMenuItem ca_close = new JMenuItem("Close Account");
		c_account.add(ca_edit);
		c_account.add(ca_close);
		this.add(c_account);
		
		JMenu c_orders = new JMenu("Client:Orders");
		JMenuItem co_order = new JMenuItem("Order Food");
		JMenuItem co_history = new JMenuItem("Order History");
		c_orders.add(co_order);
		c_orders.add(co_history);
		this.add(c_orders);
		
		
		
		
	}

}
