package Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor


public class ArticoloBrand extends Prodotto {public ArticoloBrand(String nome, double prezzo) {
	super();

}

public String getArticoloBrand() {
return this.getNome() + " Prezzo: " + this.getPrezzo();
}

	
	
}
