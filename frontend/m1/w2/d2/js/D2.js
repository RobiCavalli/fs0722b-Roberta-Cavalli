/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
 
var stringa = 'Mario'; /* E' una stringa se è contenuta fra gli apici */
console.log(stringa);

var numerica = 5; /* Variabile numerica  ha un dato di tipo numerico e non è compreso fra gli apici */
console.log(numerica);

var booleana = true /* La variabile booleana possiede solo due valori, true o false */
console.log(booleana);

var array = [ 'Mario', 5 , true] /* Lista di valori di qualsiasi tipo di dato */
console.log(array);

var oggetto = { /* Coppie di valori */
  nome: 'Antonio',
  età: 21,
}
console.log(oggetto.nome);
console.log (oggetto.età);



/* ESERCIZIO 2
 Crea una variable chiamata "name" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

var name = 'Roberta';
console.log(name);


/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

var a = 12;
var b = 20;
console.log (a + b);


/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

var x = 12

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "name" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

var ename5 = 'Cavalli';

console.log(ename5);

const esercizio5 = 'Roberta';
esercizio5 = 'Cavalli';
console.log(ename5);



/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
 var c = 4;
 var x = 12;
console.log  (x-c);


/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
var name1 = 'john';
var name2 = 'John';
console.log('name1 e name2 sono uguali', name1 === name2)
console.log ('name1 e name2 in lowrcase sono uguali:'
name1.toLowerCase ()=== name2.toLowerCase()
 )