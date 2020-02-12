package utils;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FListView extends JPanel {
	
	private ArrayList<Object> List;
	private JList TheView;
	private DefaultListModel<Object> ListElements;
	private JScrollPane ScrollPane;
	private Dimension ListScrollerDimension;
	
	public FListView( ArrayList<Object> data ){
		this.List = data;
		
		ListElements = new DefaultListModel<Object>();
		for (Object o : List) {
			ListElements.addElement(o);
		}
		
		
		TheView = new JList<Object>(ListElements);
		ScrollPane = new JScrollPane(TheView);
		
		ListScrollerDimension = new Dimension(100,100);
		ScrollPane.setPreferredSize(ListScrollerDimension);
		
		
		this.setLayout( new BorderLayout());
		this.add(ScrollPane, BorderLayout.CENTER );
		
	}
	public FListView(){
		this(new ArrayList<Object>());
	}
	
	public void SetList(ArrayList<Object> data){
		ListElements.clear();
		this.List = data;
		for (Object o : data) {
			ListElements.addElement(o);
		}
	}
	
	public Object GetSelectedItem(){
		
		if(TheView.getSelectedIndex() > -1 )
			return List.get( TheView.getSelectedIndex() );
		else
			return null;
	}
	public int GetSelectedIndex(){
		return TheView.getSelectedIndex();
	}
	public Dimension getListScrollerDimension() {
		return ListScrollerDimension;
	}
	public void setListScrollerDimension(Dimension listScrollerDimension) {
		ListScrollerDimension = listScrollerDimension;
		ScrollPane.setPreferredSize(ListScrollerDimension);
	}
	

}
