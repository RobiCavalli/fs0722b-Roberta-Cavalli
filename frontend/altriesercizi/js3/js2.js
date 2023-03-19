// diamo ad ogni carta una variabile 
let carta1 = document.getElementById('carta1')
let carta2 = document.getElementById('carta2')
let carta3 = document.getElementById('carta3')

// costruttore di oggetti 
function Prodotto ( nome, descrizione, prezzo ) {
//sto definendo le proprietà dell'oggetto
this.nome = nome;
this.descrizione = descrizione;
this.prezzo= prezzo;
this.creaCarta = function (){
 let div= document.createElement ('div');
 div.classList.add('card', 'col-4');
 div.innerHTML=`<img src="..." class="card-img-top" alt="...">
 <div class="card-body">
   <h5 class="card-title">${this.nome}</h5>
   <p class="card-text">${this.descrizione} e costa ${this.prezzo}</p>
   <a href="#" class="btn btn-primary">Aggiungi al carello</a>
 </div>`;

 document.querySelector('.row').append(div);

}
}


// Richiamando costruttore con cosa deve stampare (nome,descrizione, prezzo)
let prodotto1 = new Prodotto ('pomodori', 'rossi', '2/kg' )

prodotto1.creaCarta();

let prodotto2 = new Prodotto('patate', 'gialle', '3/kg')

prodotto2.creaCarta();
 
let prodotto3 = new Prodotto('carote', 'arancioni','4/kg')


prodotto3.creaCarta();









