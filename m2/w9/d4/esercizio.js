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
    var Abbigliamento = /** @class */ (function () {
        function Abbigliamento(id, codprod, collezione, capo, modello, quantità, colore, prezzoivainclusa, prezzoivaesclusa, disponibile, saldo) {
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
        Abbigliamento.prototype.getsaldocapo = function () {
            return this.prezzoivainclusa - ((this.prezzoivainclusa / 100) * this.saldo);
        };
        Abbigliamento.prototype.getacquistocapo = function () {
            return (this.getsaldocapo()) * this.quantità;
        };
        Abbigliamento.prototype.arrotonda = function () {
            return Math.round(this.getsaldocapo() * 10) / 10;
        };
        return Abbigliamento;
    }());
    ;
    var capi;
    fetch('https://mocki.io/v1/765b2daf-41d5-4e94-a0d5-abd918f57b8f').then(function (response) {
        return response.json();
    }).then(function (json) {
        capi = json;
        console.log('dati', capi);
        var cardigan = new Abbigliamento(capi[0].id, capi[0].codprod, capi[0].codprod, capi[0].capo, capi[0].modello, capi[0].quantita, capi[0].colore, capi[0].prezzoivainclusa, capi[0].prezzoivaesclusa, capi[0].disponibile, capi[0].saldo);
        console.log(cardigan.getsaldocapo());
        console.log(cardigan.getacquistocapo());
        console.log(cardigan.arrotonda());
        var tshirt = new Abbigliamento(capi[1].id, capi[1].codprod, capi[1].codprod, capi[1].capo, capi[1].modello, capi[1].quantita, capi[1].colore, capi[1].prezzoivainclusa, capi[1].prezzoivaesclusa, capi[1].disponibile, capi[1].saldo);
        console.log(tshirt.getsaldocapo());
        console.log(tshirt.getacquistocapo());
        console.log(tshirt.arrotonda());
        var felpa = new Abbigliamento(capi[2].id, capi[2].codprod, capi[2].codprod, capi[2].capo, capi[2].modello, capi[2].quantita, capi[2].colore, capi[2].prezzoivainclusa, capi[2].prezzoivaesclusa, capi[2].disponibile, capi[2].saldo);
        console.log(felpa.getsaldocapo());
        console.log(felpa.getacquistocapo());
        console.log(felpa.arrotonda());
        var maglione = new Abbigliamento(capi[0].id, capi[0].codprod, capi[0].codprod, capi[0].capo, capi[0].modello, capi[0].quantita, capi[0].colore, capi[0].prezzoivainclusa, capi[0].prezzoivaesclusa, capi[0].disponibile, capi[0].saldo);
        console.log(maglione.getsaldocapo());
        console.log(maglione.getacquistocapo());
        console.log(maglione.arrotonda());
        var maglia = new Abbigliamento(capi[0].id, capi[0].codprod, capi[0].codprod, capi[0].capo, capi[0].modello, capi[0].quantita, capi[0].colore, capi[0].prezzoivainclusa, capi[0].prezzoivaesclusa, capi[0].disponibile, capi[0].saldo);
        console.log(maglia.getsaldocapo());
        console.log(maglia.getacquistocapo());
        console.log(maglia.arrotonda());
    });
});
