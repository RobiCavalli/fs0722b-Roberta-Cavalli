class MotherAccount {
    balanceInit: number;
    interest: number;

    constructor(balanceInit: number, interest: number) {
      this.balanceInit = balanceInit;
      this.interest = interest;
    }

    oneDeposit(importo: number): void {
      this.balanceInit+= importo;
    }

    oneWithDraw(importo: number): void {
      this.balanceInit -= importo;
    }


    addInterest(): number {
      return this.balanceInit * this.interest;
    }
    total(): number{
    return this.balanceInit + this.addInterest()
    }

  }

  class SonAccount extends MotherAccount{
    balanceInit:number;
    limitedDraw: number;

    constructor(balanceInit: number, interest: number, limitedDraw: number) {
      super(balanceInit, interest);
      this.limitedDraw = limitedDraw;
    }

    twoWithDraw(importo: number): void {
        this.balanceInit -= importo;

      if (importo > this.limitedDraw) {
        console.log("Hai superato il limite giornaliero.");
      } else { 

      }

    }
   total(): number{
    return this.balanceInit
   }
  }

  const conto1 = new MotherAccount(1000, 0.1);
  conto1.oneDeposit(200);
console.log(conto1.total());
console.log( "Il  tuo saldo è: " + conto1.total());

const conto2 = new SonAccount(1000, 0.1, 500);
  conto2.twoWithDraw(600); 
  console.log(conto2.total())

  let tot= conto1.total() - conto2.total();
  console.log(tot)


