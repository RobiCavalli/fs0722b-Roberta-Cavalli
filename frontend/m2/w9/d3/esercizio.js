"use strict";
class Tasse {
    constructor(tasseinps, tasseirpef) {
        this.tasseinps = tasseinps;
        this.tasseirpef = tasseirpef;
    }
}
class commerciante extends Tasse {
    constructor(codredd, redditoannuolordo, tasseinps, tasseirpef) {
        super(tasseinps, tasseirpef);
        this.codredd = codredd;
        this.redditoannuolordo = redditoannuolordo;
    }
    getUtileTasse() {
        return this.redditoannuolordo * this.codredd;
    }
    getTasseInps() {
        return this.redditoannuolordo * this.tasseinps;
    }
    getTasseIrpef() {
        return this.redditoannuolordo * this.tasseirpef;
    }
    getredditoannuonetto() {
        return this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codredd;
    }
}
class professionista extends Tasse {
    constructor(codredd, redditoannuolordo, tasseinps, tasseirpef) {
        super(tasseinps, tasseirpef);
        this.codredd = codredd;
        this.redditoannuolordo = redditoannuolordo;
    }
    getUtileTasse() {
        return this.redditoannuolordo * this.codredd;
    }
    getTasseInps() {
        return this.redditoannuolordo * this.tasseinps;
    }
    getTasseIrpef() {
        return this.redditoannuolordo * this.tasseirpef;
    }
    getredditoannuonetto() {
        return this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codredd;
    }
}
class artigiano extends Tasse {
    constructor(codredd, redditoannuolordo, tasseinps, tasseirpef) {
        super(tasseinps, tasseirpef);
        this.codredd = codredd;
        this.redditoannuolordo = redditoannuolordo;
    }
    getUtileTasse() {
        return this.redditoannuolordo * this.codredd;
    }
    getTasseInps() {
        return this.redditoannuolordo * this.tasseinps;
    }
    getTasseIrpef() {
        return this.redditoannuolordo * this.tasseirpef;
    }
    getredditoannuonetto() {
        return this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codredd;
    }
}
let Luca = new commerciante(0.58, 20000, 0.25, 0.30);
let Mario = new professionista(0.40, 300000, 0.25, 0.50);
let Michele = new artigiano(0.30, 1500000, 0.40, 0.60);
console.log(Luca.getUtileTasse());
console.log(Luca.getTasseInps());
console.log(Luca.getTasseIrpef());
console.log(Luca.getredditoannuonetto());
//   Mario
console.log(Mario.getUtileTasse());
console.log(Mario.getTasseInps());
console.log(Mario.getTasseIrpef());
console.log(Mario.getredditoannuonetto());
//Michele
console.log(Michele.getUtileTasse());
console.log(Michele.getTasseInps());
console.log(Michele.getTasseIrpef());
console.log(Michele.getredditoannuonetto());
