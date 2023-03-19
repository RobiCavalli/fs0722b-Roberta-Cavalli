var nomeGiocatore= window.prompt ("Ciao, inserisci il tuo nome:");

document.getElementById('titolo').innerHTML= "Benvenuto " + nomeGiocatore;

var sceltaUtente;
// funzione per carta 
function cliccatoCarta(){
  sceltaUtente = "carta";
  alert(nomeGiocatore + " hai scelto " + sceltaUtente);
}
// funzione per forbici
function cliccatoForbici(){
  sceltaUtente = "forbici";
  alert(nomeGiocatore + " hai scelto " + sceltaUtente);
}
// funzione per sasso
function cliccatoSasso(){
  sceltaUtente = "sasso";
  alert(nomeGiocatore + " hai scelto " + sceltaUtente);
}

// Creo funzione verdetto -> la scelta del pc
function verdetto (){
  // elimino gli elementi che non servono 
  document.getElementById('carta').style.display ='none';
  document.getElementById('forbici').style.display ='none';
  document.getElementById('sasso').style.display ='none';
  document.getElementById('pulsante').style.display ='none';
  //  creo variabile scelta computer
  var sceltaComputer;
  // if per la vittoria pc

  if(sceltaUtente == "carta"){
    sceltaComputer = "forbici";
  }

  if(sceltaUtente == "forbici"){
    sceltaComputer = "sasso";
  }

  if(sceltaUtente == "sasso"){
    sceltaComputer = "carta";
  }
  // titolo apparirà scritto hai perso
  document.getElementById ("titolo").innerHTML = nomeGiocatore + " hai Perso =P";
  document.getElementById ("infomazioni").innerHTML = "Il computer ha scelto " + sceltaComputer + ". Tu hai scelto " + sceltaUtente;


}