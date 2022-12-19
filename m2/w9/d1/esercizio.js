var utente1 = 5;
var utente2 = 4;
console.log('utente 1 ha scelto:' + utente1);
console.log('utente 2 ha scelto:' + utente2);
var bottone = document.getElementById('vincente');
var numeroVincente = document.getElementById('div');
var random = (Math.floor(Math.random() * 100));
console.log('numero vincente ' + random);
if (random === utente1) {
    console.log('utente1 ha vinto');
}
if (random === utente2) {
    console.log('utente2 ha vinto');
}
