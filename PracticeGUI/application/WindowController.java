package application;

import java.net.URL;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class WindowController implements Initializable{

    @FXML
    private TextField name;

    @FXML
    private ListView<String> menuList;

    @FXML
    private ListView<String> OrderList;

    @FXML
    private Button add;

    @FXML
    private Button checkOut;
    
    @FXML
    private RadioButton dineIn;

    @FXML
    private ToggleGroup order;

    @FXML
    private RadioButton takeAway;
    
    
    
    String s;
    double price1=0;
    ArrayList<Coffee> arr = new ArrayList<>();
    Alert a = new Alert(AlertType.INFORMATION);
    
    @FXML
    void toAdd(ActionEvent event) {
	
    	
    	String s1 = menuList.getSelectionModel().getSelectedItem();
    	String N = name.getText(); 
    	if(N.equals("")) {
    		a.setTitle("Add Name");
    		a.setHeaderText(null);
    		a.setContentText("Add Your Name");
    		a.showAndWait();
    	}
    	
    	if(!(N.equals(""))) {
    		
    		for(int j = 0; j<arr.size();j++ ) {
        		if(s1.equals(arr.get(j).getCoffee()+" $"+arr.get(j).getPrice())) {
        			price1 +=arr.get(j).getPrice();			
        	    }
        	}
        	
        	OrderList.getItems().add(s1);
     	
        		
    		
    	}
    	
    	
    	
    	  
    	
    }
    
    @FXML
    void toOut(ActionEvent event) {

    	String orderType=null;
     if(dineIn.isSelected()) {
    	 orderType = "Dine In";
    	 price1 = price1+price1*0.05;
     }
     else {
    	 orderType = "Take Away";
    	 price1 = price1+price1*0.05;
     }
     
     
     
    	
    	a.setTitle("Total Bill");
    	a.setHeaderText(null);
    	a.setContentText(name.getText()+" please pay $"+String.format("%.2f",price1)+" for "+orderType);
    	a.showAndWait();
    }

  
    
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			
			String db="C:\\databasecon\\Coffee.accdb";
			String path = "jdbc:ucanaccess://"+db;
			
			
				Connection con = DriverManager.getConnection(path);
				
				Statement stm = con.createStatement();
				
				ResultSet rs = stm.executeQuery("Select * from CoffeeShop");
				
				int i = 0;
				
				while(rs.next()) {
					String coffee=rs.getString(2);
					double price = rs.getDouble(3);
     				
     				
     				
     				
     				arr.add(new Coffee(coffee,price));
     				
     				 s = coffee+" $"+price;
     				menuList.getItems().add(s);
     				
				}
				
				
				
				 
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
		
	}

}
