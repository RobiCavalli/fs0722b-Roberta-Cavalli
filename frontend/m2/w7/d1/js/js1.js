// ossatura costruttore

function utente (){
    this.nome= "";
    this.cognome = "";
    this.dataNascita= "";
}

let user = new utente();
let nome = document.querySelector("#name");
let cognome = document.querySelector("#surname");
let data = document.querySelector("#data");
let bottone= document.querySelector('#invio_btn')
 console.log(nome.value)

 bottone.addEventListener('click', invio)

// riempio il costruttore 

let cella3 = document.querySelector('#cella3')
let oggi = new Date ()

bottone.addEventListener('click', invio)

function invio (){
 utente.nome =  nome.value
 utente.cognome = cognome.value
 utente.dataNascita = data.value
cella.innerHTML = utente.nome
cella2.innerHTML = utente.cognome
cella3.innerHTML = utente.compleanno


}

new date().getFullYear
