// Variabili per disegnare nella board( id tag canvas)
let board;
let boardWidth = 360;
let boardHeight = 640;
let context; // contesto di disegno 

//Quando viene caricata la pagina :
window.onload = function () {
  //assegnamo  la variabile board al dot
  board = document.getElementById("board");
  // impostiamo l'altezza sulla variabile boardHeight
  board.height = boardHeight;
  board.width= boardWidth;
  context= board.getContext("2d"); //per disegnare sulla board
};
