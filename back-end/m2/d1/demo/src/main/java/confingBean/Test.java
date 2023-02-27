package confingBean;

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
public class Test {

	private String nome;
	private String cognome;
	
	public Test(String nome) {
		super();
		this.nome = nome;
		this.cognome = "Rossi";
	}
	
	public String saluta() {
		return "Hello World da " + this.nome + " " + this.cognome;
	}
	
}

