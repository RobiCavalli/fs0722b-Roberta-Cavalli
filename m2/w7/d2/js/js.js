

class persona {
    name = "";
    age ="";
    constructor(_name, _age) {
        this.name = _name;
        this.age = _age;
    }
    calcoloeta() {
        if ((user1.age > user2.age)) {
            console.log('Mario è piu vecchio di Luca');
            if ((user2.age < user1.age)) {
                console.log('Luca è più piccolo di Mario');
            }
            if ((user2.age == user3.age)) {
                console.log('Luca e Paolo hanno la stessa età');
           }
        }
    }
}

let user1 = new persona('Mario', 25);
let user2 = new persona('Luca', 22);
let user3 = new persona('Paolo', 22);


user2.calcoloeta();
user3.calcoloeta();



