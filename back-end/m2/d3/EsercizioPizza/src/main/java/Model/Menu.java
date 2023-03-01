package Model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
@Getter
public class Menu {
	private List<Pizza> menuPizza = new ArrayList<Pizza>();
	private List<Bevanda> menuBevanda = new ArrayList<Bevanda>();
}
