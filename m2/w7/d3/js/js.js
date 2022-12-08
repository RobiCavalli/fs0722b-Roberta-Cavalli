function delayed (){
    return new Promise ( resolve => {
        setTimeout(()=> {
            resolve ();
        }, 3000);
    });
    }

async function tempoChePassa (){
    let fine = await delayed();
    console.log(fine)
    
    
    if(typeof(Storage) != undefined){
        if(sessionStorage.clickcount){
    
         sessionStorage.clickcount = setInterval(myTimer, 1000) ;
        }else{
            sessionStorage.clickcount = 1
        }
        function myTimer() {
        const d = new Date();
        document.getElementById("tempo").innerHTML = d.toLocaleTimeString();
      }
    }
    
    
    }
    tempoChePassa();