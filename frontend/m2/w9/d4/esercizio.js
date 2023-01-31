var Vestiti = /** @class */ (function () {
    function Vestiti(id, codprod, collezione, capo, modello, quantità, colore, prezzoivainclusa, prezzoivaesclusa, disponibile, saldo) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantità = quantità;
        this.colore = colore;
        this.prezzoivainclusa = prezzoivainclusa;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    Vestiti.prototype.getsaldocapo = function () {
        return this.prezzoivainclusa - ((this.prezzoivainclusa / 100) * this.saldo);
    };
    Vestiti.prototype.getacquistocapo = function () {
        return (this.getsaldocapo()) * this.quantità;
    };
    return Vestiti;
}());
;
var abiti;
fetch('https://mocki.io/v1/765b2daf-41d5-4e94-a0d5-abd918f57b8f').then(function (response) {
    return response.json();
}).then(function (json) {
    abiti = json;
    console.log('dati', abiti);
    var cardigan = new Vestiti(abiti[0].id, abiti[0].codprod, abiti[0].codprod, abiti[0].capo, abiti[0].modello, abiti[0].quantita, abiti[0].colore, abiti[0].prezzoivainclusa, abiti[0].prezzoivaesclusa, abiti[0].disponibile, abiti[0].saldo);
    console.log(cardigan.getsaldocapo());
    console.log(cardigan.getacquistocapo());
    var tshirt = new Vestiti(abiti[1].id, abiti[1].codprod, abiti[1].codprod, abiti[1].capo, abiti[1].modello, abiti[1].quantita, abiti[1].colore, abiti[1].prezzoivainclusa, abiti[1].prezzoivaesclusa, abiti[1].disponibile, abiti[1].saldo);
    console.log(tshirt.getsaldocapo());
    console.log(tshirt.getacquistocapo());
    var felpa = new Vestiti(abiti[2].id, abiti[2].codprod, abiti[2].codprod, abiti[2].capo, abiti[2].modello, abiti[2].quantita, abiti[2].colore, abiti[2].prezzoivainclusa, abiti[2].prezzoivaesclusa, abiti[2].disponibile, abiti[2].saldo);
    console.log(felpa.getsaldocapo());
    console.log(felpa.getacquistocapo());
    var maglione = new Vestiti(abiti[0].id, abiti[0].codprod, abiti[0].codprod, abiti[0].capo, abiti[0].modello, abiti[0].quantita, abiti[0].colore, abiti[0].prezzoivainclusa, abiti[0].prezzoivaesclusa, abiti[0].disponibile, abiti[0].saldo);
    console.log(maglione.getsaldocapo());
    console.log(maglione.getacquistocapo());
    var maglia = new Vestiti(abiti[0].id, abiti[0].codprod, abiti[0].codprod, abiti[0].capo, abiti[0].modello, abiti[0].quantita, abiti[0].colore, abiti[0].prezzoivainclusa, abiti[0].prezzoivaesclusa, abiti[0].disponibile, abiti[0].saldo);
    console.log(maglia.getsaldocapo());
    console.log(maglia.getacquistocapo());
});
