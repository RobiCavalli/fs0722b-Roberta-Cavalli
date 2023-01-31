fetch ('users.json').then(function (response){
    return response.json();

}).then(function(json){
classe = json; 
console.log(classe)

document.querySelector('#john1').innerHTML = classe[0].firstName + " " + classe[0].lastName + " " ;
document.querySelector('#john_email').innerHTML = classe[0].email;
document.querySelector('#jane1').innerHTML = classe[1].firstName + " " + classe[1].lastName;
document.querySelector('#jane_email').innerHTML = classe[1].email;
document.querySelector('#john-img').innerHTML = `<img class="bg-light border rounded-circle" src ="img/male.png"></img>`
document.querySelector('#jane-img').innerHTML = `<img class="bg-light border rounded-circle" src ="img/female.png"></img>`

}).catch(function(err){
    console.log ('fetch problem: '+ err.message);

});





