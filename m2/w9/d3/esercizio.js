var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Tasse = /** @class */ (function () {
    function Tasse(tasseinps, tasseirpef) {
        this.tasseinps = tasseinps;
        this.tasseirpef = tasseirpef;
    }
    return Tasse;
}());
var commerciante = /** @class */ (function (_super) {
    __extends(commerciante, _super);
    function commerciante(codredd, redditoannuolordo, tasseinps, tasseirpef) {
        var _this = _super.call(this, tasseinps, tasseirpef) || this;
        _this.codredd = codredd;
        _this.redditoannuolordo = redditoannuolordo;
        return _this;
    }
    commerciante.prototype.getUtileTasse = function () {
        return this.redditoannuolordo * this.codredd;
    };
    commerciante.prototype.getTasseInps = function () {
        return this.redditoannuolordo * this.tasseinps;
    };
    commerciante.prototype.getTasseIrpef = function () {
        return this.redditoannuolordo * this.tasseirpef;
    };
    commerciante.prototype.getredditoannuonetto = function () {
        return this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codredd;
    };
    return commerciante;
}(Tasse));
var professionista = /** @class */ (function (_super) {
    __extends(professionista, _super);
    function professionista(codredd, redditoannuolordo, tasseinps, tasseirpef) {
        var _this = _super.call(this, tasseinps, tasseirpef) || this;
        _this.codredd = codredd;
        _this.redditoannuolordo = redditoannuolordo;
        return _this;
    }
    professionista.prototype.getUtileTasse = function () {
        return this.redditoannuolordo * this.codredd;
    };
    professionista.prototype.getTasseInps = function () {
        return this.redditoannuolordo * this.tasseinps;
    };
    professionista.prototype.getTasseIrpef = function () {
        return this.redditoannuolordo * this.tasseirpef;
    };
    professionista.prototype.getredditoannuonetto = function () {
        return this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codredd;
    };
    return professionista;
}(Tasse));
var artigiano = /** @class */ (function (_super) {
    __extends(artigiano, _super);
    function artigiano(codredd, redditoannuolordo, tasseinps, tasseirpef) {
        var _this = _super.call(this, tasseinps, tasseirpef) || this;
        _this.codredd = codredd;
        _this.redditoannuolordo = redditoannuolordo;
        return _this;
    }
    artigiano.prototype.getUtileTasse = function () {
        return this.redditoannuolordo * this.codredd;
    };
    artigiano.prototype.getTasseInps = function () {
        return this.redditoannuolordo * this.tasseinps;
    };
    artigiano.prototype.getTasseIrpef = function () {
        return this.redditoannuolordo * this.tasseirpef;
    };
    artigiano.prototype.getredditoannuonetto = function () {
        return this.redditoannuolordo * this.tasseinps * this.tasseirpef * this.codredd;
    };
    return artigiano;
}(Tasse));
var Luca = new commerciante(0.58, 20000, 0.25, 0.30);
var Mario = new professionista(0.40, 300000, 0.25, 0.50);
var Michele = new artigiano(0.30, 1500000, 0.40, 0.60);
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
