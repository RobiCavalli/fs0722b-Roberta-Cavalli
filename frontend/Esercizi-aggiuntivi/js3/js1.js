const persona = {
    nome: 'Luca',
    cognome : 'Rossi',
    genere: 'Maschio',
    età:'25',
    interessi:['snowbard','basket','picnic'],
    indirizzo: {
        via:'Piazza Roma',
        cap:'7012',
        provincia:'Mi',
        città:'Milano'
    },
    saluta : function( ){
        console.log (`Ciao sono ${this.nome}`)
    }

}

//Dot(.)notation
// richiamo la proprietà
console.log(persona.nome)
//accediamo a gli array 
console.log(persona.interessi [1])

// accediamo ai sotto oggetti (indirizo è il sotto oggetto)
console.log (persona.indirizzo.cap)

//metodo
persona.saluta();
persona.nome.toLowerCase()

//bracket notation

console.log(persona['nome']);

console.log(persona['interessi'][1]);
// cambiare la proprietà di un oggetto 
persona.indirizzo.cap = 70233;
console.log(persona.indirizzo.cap);
// aggiungere proprietà
persona.colorePreferito = 'blu';
console.log(persona);

//this
// ho messo nella funzion this.nome (riga14)
persona.saluta();


//Metodo

        var teacher = {
            name: "Federico",
            surname: "De Ambrosis",
            sayHello: function () {
                alert("Hello World, I'm " + this.name + " " + this.surname);
            }
        }
        teacher.sayHello();
  
        // Metodi esempi 
        var x = new Object(32);
        x.toString();


        function Student(name, age) {
            this.name = name;
            this.age = age;
        }

         // var MarioRossi = new persona("Mario", "Rossi");
        // var GiuseppeVerdi = new persona("Giuseppe", "Verdi");
        // marioRossi.telefono = "0612345678" // posso aggiungere all'oggetto qualcosa
        // creo una nuova proprietà a Mario Rossi senza influenzare la struttura di Giuseppe Verdi
        // quando creo oggetti posso partire da una struttura di dati comune definita da un costruttore
        // e poi la possiamo personalizzare in base alle nostre esigenze
        // prototype -> persona.prototype.telefono = "12345678"
        // tutti gli oggetti che avevamo creato col costruttore persona() ora hanno anche la proprietà telefono

        function Student(name, age) {
            this.name = name;
            this.age = age;
        }

        var studente1 = new Student("Luigi Bianchi", 43);
        var studente2 = new Student("Mario Rossi", 32);

        console.log(studente1, studente2);

        Student.prototype.skills = [];  // skills è accessibile come se fosse una proprietà dell'oggetto
                                        // il prototipo ha un riferimento a un altro oggetto
        // console.log(studente1, studente2);

        studente1.skills = ["html", "css", "js"];
        studente2.skills = ["surfare", "ballare", "suonare"];

        console.log(studente1, studente2);

        /* Eredità prototipale -> prototypal inheritance 
        se una proprietà non si trova in un oggetto la si cerca nel prototipo
        il prototipo di un oggetto può essere a sua volta un altro prototipi -> si risale nella catena dei prototipi per cercare la proprietà
        */   

        