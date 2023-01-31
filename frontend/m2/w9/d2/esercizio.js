"use strict";
class MotherAccount {
    constructor(balanceInit, interest) {
        this.balanceInit = balanceInit;
        this.interest = interest;
    }
    oneDeposit(importo) {
        this.balanceInit += importo;
    }
    oneWithDraw(importo) {
        this.balanceInit -= importo;
    }
    addInterest() {
        return this.balanceInit * this.interest;
    }
    total() {
        return this.balanceInit + this.addInterest();
    }
}
class SonAccount extends MotherAccount {
    constructor(balanceInit, interest, limitedDraw) {
        super(balanceInit, interest);
        this.limitedDraw = limitedDraw;
    }
    twoWithDraw(importo) {
        this.balanceInit -= importo;
        if (importo > this.limitedDraw) {
            console.log("Hai superato il limite giornaliero.");
        }
        else {
        }
    }
    total() {
        return this.balanceInit;
    }
}
const conto1 = new MotherAccount(1000, 0.1);
conto1.oneDeposit(200);
console.log(conto1.total());
console.log("Il  tuo saldo è: " + conto1.total());
const conto2 = new SonAccount(1000, 0.1, 500);
conto2.twoWithDraw(600);
console.log(conto2.total());
let tot = conto1.total() - conto2.total();
console.log(tot);
