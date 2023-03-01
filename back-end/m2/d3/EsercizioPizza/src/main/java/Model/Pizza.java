package Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Pizza extends Prodotto {
	double calorie;
	
	
public Pizza(String nome, double prezzo, double calorie) {
		super(nome, prezzo);
		this.calorie = calorie;
	}


}
