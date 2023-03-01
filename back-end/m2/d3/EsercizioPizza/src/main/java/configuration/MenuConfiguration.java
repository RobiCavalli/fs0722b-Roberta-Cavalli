package configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Model.Menu;
import Model.Pizza;
import Model.PizzaHawaiian;
import Model.PizzaMargherita;
import Model.PizzaSalami;


@Configuration
public class MenuConfiguration {
	@Bean
	public Menu menu() {
		Menu menu = new Menu();
		menu.getMenuPizza().add(pizzaMargherita());     
	  
		//creare un bean di tipo PizzaHawaiian
	    menu.getMenuPizza().add(pizzaHawaiian());     
		//creare un bean di tipo PizzaSalami
		menu.getMenuPizza().add(pizzaSalami());     	
		return menu;
}
	
	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}
	
	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
