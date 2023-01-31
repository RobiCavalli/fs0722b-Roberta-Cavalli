/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

// JS Basics

/* ESERCIZIO A
  Crea una variabile chiamata "sum" e assegnaci il risultato della somma tra i valori 10 e 20. */
 //Creato una variabie sum e la funzione somma con parametri (a e b), ottenendo come somma il risultato dei due valori richiesti
/*
let sum = function somma (a, b ){
  return a+ b 
}
console.log(sum (10,20));
/*
 

/* ESERCIZIO B
Crea una variabile chiamata "random" e assegnaci un numero casuale tra 0 e 20 (deve essere generato dinamicamente a ogni esecuzione).
 
// Random è un metodo dell'oggetto Math ma genera un numero decimale causale, per ottenere un numero intero random utilizziamo il metodo floor

/*let random = Math.floor(Math.random() * 20) +1; 
console.log(random);*/


/* ESERCIZIO C
  Crea una variabile chiamata "me" e assegnaci un oggetto contenente le seguenti proprietà: name = il tuo nome, surname = il tuo cognome, age = la tua età.
//Ho creato una variabile e ci ho assegnato un oggetto con le proprietà :name , surname , age 

 /*let me = { "nome": "Roberta", "cognome": "Cavalli", "age": 28 }; 
console.log(me); */


/* ESERCIZIO D
  Crea del codice per rimuovere programmaticamente la proprietà "age" dall'oggetto precedentemente creato.
*/
// Per rimuovere la proprietà 'age' utlizziamo il metodo delete

/*delete me.age; 
console.log(me);

/* ESERCIZIO E
  Crea del codice per aggiungere programmaticamente all'oggetto precedentemente creato un array chiamato "skills", contenente i linguaggi di programmazione che conosci.
*/
//Ho creato una proprietà e gli ho assegnato un valore 

/*me['skills'] = ['html, css, javascriprit'] ; 
 console.log(me);


/* ESERCIZIO F
 Crea un pezzo di codice per aggiungere un nuovo elemento all'array "skills" contenuto nell'oggetto "me".
*/

// Per aggiungere un nuovo elemento dall'array utilizzo push

/*me.skills.push('C++'); 
console.log(me);


/* ESERCIZIO G
  Crea un pezzo di codice per rimuovere programmaticamente l'ultimo elemento dall'array "skills" contenuto nell'oggetto "me".
*/

// Per rimuovere un elemento dall'array utlizzo pop

/*me.skills.pop('C++'); 
console.log(me) */

// Funzioni

/* ESERCIZIO 1
  Crea una funzione chiamata "dice": deve generare un numero casuale tra 1 e 6.
// ho creato una funzione con parametri (a, b ) per generare un numero casuale tra 1 e 6 utilizzando math ceil random
function dice ( a, b) { 
  return Math.ceil(Math.random() * 6)
}
console.log(dice(1,6));

*/


/* ESERCIZIO 2
Crea una funzione chiamata "whoIsBigger" che riceve due numeri come parametri e ritorna il maggiore dei due.

//Ho creato una funzione e ho assegnato ad essa due parametri a e b, con if and else ho trovato il maggiore dei due.

function whoIsBigger(a, b) {
  if (a >b) {
    return b

  } else {
    return a
  } 
    
}
console.log(whoIsBigger ( 4, 5));
/*

/* ESERCIZIO 3
  Crea una funzione chiamata "splitMe" che riceve una stringa come parametro e ritorna un'array contenente ogni parola della stringa.

  Es.: splitMe("I love coding") => ritorna ["I", "Love", "Coding"]

// Creo una funzione chiamata Splitme, creo una variabile Split e applico il metodo split per ottenere delle sottostringhe.
function splitMe (stringa){

let split = stringa.split(' ');
return split;
 }

 console.log(splitMe('I love coding'));
*/

 /*ESERCIZIO 4
  //Crea una funzione chiamata "deleteOne" che riceve una stringa e un booleano come parametri.
  Se il valore booleano è true la funzione deve ritornare la stringa senza il primo carattere, altrimenti la deve ritornare senza l'ultimo.
  Creo una funzione con due parametri, stringa, booleano. Con if and else e slice ritornerà la stringa senza il primo carattere (se è vero) altrimenti senza l'ultimo 
  
  function deleteOne( a, boolean = true){
 if ( boolean){
  let stringa = a.slice(1);
  return stringa
 }
  else{
    let stringa1 = a.slice(0,-1);
    return stringa1 
  }
  
}
console.log(deleteOne('esercizio', true));

/* ESERCIZIO 5
  Crea una funzione chiamata "onlyLetters" che riceve una stringa come parametro e la ritorna eliminando tutte le cifre numeriche.

  Es.: onlyLetters("I have 4 dogs") => ritorna "I have dogs"
*/

// Ho creato una funzione, due variabili (lettere e numeri) con remove ho sostituito il valore 4 con uno spazio vuoto 

/*function onlyLetter () {

let lettere = 'I have a 4 dogs';

let numeri = lettere.replace(/4/," ");

return numeri 

}
 console.log(onlyLetter ('I have a 4 dogs'));
 /*


/* ESERCIZIO 6
  Crea una funzione chiamata "isThisAnEmail" che riceve una stringa come parametro e ritorna true se la stringa è un valido indirizzo email.

function isThisAnEmail (){
let a = new RegExp('[a-z0-9]+-[a-z](2,3)') // per la validazione
let b = ['roberta.cavalli94@gmail.com']
b.forEach((indirizzo) => { // per ogni elemento dell array 
  console.log(a.test(indirizzo))

});
}
isThisAnEmail() 



/* ESERCIZIO 7
  Scrivi una funzione chiamata "whatDayIsIt" che ritorna il giorno della settimana corrente.
// Dopo aver creato la funzione e la variabile con il metodo getdate è possibile recuperare numero delgiorno della settimana corrente
let whatDayIsIt = new Date()
let giorno = whatDayIsIt.getDay()

console.log(giorno) */

/* ESERCIZIO 8
  Scrivi una funzione chiamata "rollTheDices" che riceve un numero come parametro.
  Deve invocare la precedente funzione dice() il numero di volte specificato nel parametro, e deve tornare un oggetto contenente una proprietà "sum":
  il suo valore deve rappresentare il totale di tutti i valori estratti con le invocazioni di dice().
  L'oggetto ritornato deve anche contenere una proprietà "values", contenente un array con tutti i valori estratti dalle invocazioni di dice().

  Example:
  rollTheDices(3) => ritorna {
      sum: 10
      values: [3, 3, 4]
  }
*/


/* ESERCIZIO 9
  Scrivi una funzione chiamata "howManyDays" che riceve una data come parametro e ritorna il numero di giorni trascorsi da tale data.
*/
 /*let d1 = new Date("2022-10-12") 
let d2 = new Date("2022-10-20")

let differenza = d2.getTime() - d1.getTime()

let diff = differenza / (1000 * 60 * 60 * 24)

console.log(diff)
*/

/* ESERCIZIO 10
  Scrivi una funzione chiamata "isTodayMyBirthday" che deve ritornare true se oggi è il tuo compleanno, falso negli altri casi.
*/
//Creata una funzione isToDayMyBirthday, con if restituirà false non essendo oggi il mio compleanno

/*let  isTodayMyBirthday = function (a){
  if(a !== 11){
    return true
  }
  else{ (a == 11)
    return false
  }
}

console.log(isTodayMyBirthday(11))
*/

// Arrays & Oggetti

// NOTA: l'array "movies" usato in alcuni esercizi è definito alla fine di questo file
const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },

  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
]

/* ESERCIZIO 11
  Scrivi una funzione chiamata "deleteProp" che riceve un oggetto e una stringa come parametri; deve ritornare l'oggetto fornito dopo aver eliminato
  in esso la proprietà chiamata come la stringa passata come secondo parametro.
*/



  /*ESERCIZIO 12
  Scrivi una funzione chiamata "newestMovie" che trova il film più recente nell'array "movies" fornito.

  let newestMovie = function (movies) {
  let newMovie = movies[0]
  let annoMaggiore = movies[0].Year
  for (let film of movies) {
    if (film.Year > annoMaggiore) {
      newMovie = film
    }
  }
  return newMovie
}

console.log(newestMovie(movies))


/* ESERCIZIO 13
  Scrivi una funzione chiamata countMovies che ritorna il numero di film contenuti nell'array "movies" fornito.

 let countMovies = function (array) {
  return array.length // lunghezza dell array
}
console.log(countMovies(movies))

/* ESERCIZIO 14
  Scrivi una funzione chiamata "onlyTheYears" che crea un array con solamente gli anni di uscita dei film contenuti nell'array "movies" fornito.
*/
/*function onlyTheYears (array){
  let film = []; //array vuoto da riempire
  for (let year of array) {
    film.push(year.Year); //aggiungiamo la proprietà dell array
  }
  return film;
}

console.log(onlyTheYears(movies))



/* ESERCIZIO 15
  Scrivi una funzione chiamata "onlyInLastMillennium" che ritorna solamente i film prodotto nel millennio scorso contenuti nell'array "movies" fornito.
*/
/*function onlyInLastMillennium (array){
  let es15 = []
  for (let millenio of array) {
    if (millenio.Year < 2000) { //del millenio scorso
      arr.push(millenio) //aggiungo il film prodotto nel millenio scorso
    }
  }
  return es15
  }

console.log(onlyInLastMillennium(movies))





/* ESERCIZIO 16
  Scrivi una funzione chiamata "sumAllTheYears" che ritorna la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array "movies" fornito.

  let sumAllTheYears = function (arr) {
  let somma = 0
  for (let films of arr) {
    sum += Number( films.Year)
  }
  return somma
}

console.log(sumAllTheYears(movies))
*/

/* ESERCIZIO 17
  Scrivi una funzione chiamata "searchByTitle" che riceve una stringa come parametro e ritorna i film nell'array "movies" fornito che la contengono nel titolo.

  function searchByTitle ('stringa')

*/

/* ESERCIZIO 18
  Scrivi una funzione chiamata "searchAndDivide" che riceve una stringa come parametro e ritorna un oggetto contenente due array: "match" e "unmatch".
  "match" deve includere tutti i film dell'array "movies" fornito che contengono la stringa fornita all'interno del proprio titolo, mentre "unmatch" deve includere tutti i rimanenti.
*/

/* ESERCIZIO 19
  Scrivi una funzione chiamata "removeIndex" che riceve un numero come parametro e ritorna l'array "movies" fornito privo dell'elemento nella posizione ricevuta come parametro.
*/

// DOM (nota: gli elementi che selezionerai non si trovano realmente nella pagina)

/* ESERCIZIO 20
  Scrivi una funzione per selezionare l'elemento dotato di id "container" all'interno della pagina.
*/
//creata la funzione con document.getElementById è possibile selezionare l'elemento id 'container'

/*function es20 () {
  let select = document.getElementById ('container')
}
es20();
/*


/* ESERCIZIO 21
  Scrivi una funzione per selezionare ogni tag <td> all'interno della pagina.
*/
//Con il querySelectorAll richiamiamo tutti i tag <td> all'interno della pagina

/*function es21(){
  let td = document.querySelectorAll('td')
}
es21() */


/* ESERCIZIO 22
  Scrivi una funzione che, tramite un ciclo, stampa in console il testo contenuto in ogni tag <td> all'interno della pagina.
*/


/*let stampa = document.querySelectorAll('td');//seleziono tutti i tag td
function es22(){
    for(let i = 0 ; i < a.length ; i++ ){
    let testo = stampa[i].textContent = 'testo fittizio'; // ad ogni indice aggiungiamo testo fittizio
  }
} 
*/

/* ESERCIZIO 23
  Scrivi una funzione per aggiungere un background di colore rosso a ogni link all'interno della pagina.
*/
  
// Con document.querySelectorAll(a)e l'attributo style ho potuto cambiare il colore di tutti i link

/*let es23= function () {
   let a = document.querySelectorAll('a')
  for (let i = 0; i < a.length; i++) {
  a [i].style.backgroundColor='red'
  }
}

es23();
 */

/* ESERCIZIO 24
  Scrivi una funzione per aggiungere un nuovo elemento alla lista non ordinata con id "myList".
*/

/*let es24 = function () {
  let List = document.querySelector('#myList'); // richiamato l'elemento
  let test = document.creatElement('li') //creato l'elemento
  test.innerHTML = content; //inserito il contenuto
  List.appendChild(test); //aggiunge un nodo  come ultimo figlio di un elemento.
}
es24('esercizio'); 



/* ESERCIZIO 25
  Scrivi una funzione per svuotare la lista non ordinata con id "myList".
*/

/*function es25(){
  document.getElementById('myList') //selezionare l'emento
  myList.textContent = '' //  contenuto vuoto per svuotare il contenuto 

}
es25()
  
*/

/* ESERCIZIO 26
  Scrivi una funzione per aggiungere ad ogni tag <tr> la classe CSS "test"
*/

//Per ogni elemento selezionato con il querySelectorAll  ho aggiunto con  la proprietà class.liss la classe test

function esercizio26()
let es26 = document.querySelectorAll('tr')
for (let i = 0; i < es26.length; i++){
  es26[i].classList.add('test');
}

es26();


// [EXTRA] JS Avanzato

/* ESERCIZIO 27
  Crea una funzione chiamata "halfTree" che riceve un numero come parametro e costruisce un mezzo albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  halfTree(3)

  *
  **
  ***

*/

/* ESERCIZIO 28
  Crea una funzione chiamata "tree" che riceve un numero come parametro e costruisce un albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  tree(3)

    *
   ***
  *****

*/

/* ESERCIZIO 29
  Crea una funzione chiamata "isItPrime" che riceve un numero come parametro e ritorna true se il numero fornito è un numero primo.
*/

/* Questo array viene usato per gli esercizi. Non modificarlo. */


