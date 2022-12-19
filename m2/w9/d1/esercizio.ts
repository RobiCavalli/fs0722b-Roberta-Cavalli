let utente1 = {
   nome: 'laura',
   numero: 26
}
console.log(utente1.nome + utente1.numero)

let utente2 = {
   nome: 'giulia',
   numero: 77
}
console.log(utente2.nome + utente2.numero)


let random = (Math.floor(Math.random() * 100))

console.log('numero vincente '+ random)


let primoRisultato =  (random - utente1.numero) 
let secondoRisultato = (random - utente2.numero)

console.log(primoRisultato)


if((random  - utente1.numero) == 0) {
 console.log(utente1.nome + 'hai vinto ' )
  } else if((random -utente2.numero) == 0){
   console.log( utente2.nome + 'hai vinto ' )
  }else if (primoRisultato < secondoRisultato){
console.log ('non avete vinto ma ' + utente1.nome + 'è arrivato più vicino ')
  } else if (primoRisultato > secondoRisultato){
   console.log('non avete vinto ma ' + utente2.nome + 'è arrivato più vicino ')
  } 