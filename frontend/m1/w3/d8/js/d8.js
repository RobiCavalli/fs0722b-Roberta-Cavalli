
document.querySelector('#salva')
.addEventListener('click', function(){

    let testo = document.querySelector('#text');
    
    let div = document.createElement('div');//nasce il div
    
    div.classList.add('todolist')
    
    let span = document.createElement('span');
    span.textContent = testo.value;

    let completato = document.createElement('button');
    completato.textContent = 'Completato';

    completato.addEventListener('click', ()=> {
        div.classList.add('completato');//assegno una classe aggiuntiva
        document.querySelector('#lista-completati')
        .append(div);//sposto il div nella lista completati
    })

    div.append(span, completato);
    document.querySelector('#lista').append(div);


    testo.value = '';            
});
   