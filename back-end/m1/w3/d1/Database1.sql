CREATE TABLE clienti  (
NumeroClienti SERIAL PRIMARY KEY,
Nome VARCHAR NOT NULL,
Cognome VARCHAR NOT NULL,
DataNascita INT8 NOT NULL,
RegioneResidenza VARCHAR NOT NULL
);

CREATE TABLE fatture (
NumeroFattura SERIAL PRIMARY KEY,
Tipologia VARCHAR NOT NULL,
Importo INT4 NOT NULL,
Iva INT4 NOT NULL,
DataFattura INT4 NOT NULL,
NumeroFornitore INT4 NOT NULL,
IdCliente INT4 NOT NULL,
CONSTRAINT IdCliente_fk  FOREIGN KEY (IdCliente) REFERENCES clienti (NumeroClienti) 
);


DROP TABLE fornitori;
DROP TABLE clienti;

CREATE TABLE prodotti  (
IdProdotto SERIAL PRIMARY KEY,
Descrizione VARCHAR NOT NULL,
InProduzione INT8 NOT NULL,
InCommercio INT8 NOT NULL,
DataAttivazione INT8 NOT NULL,
DataDisattivazione INT8 NOT NULL	
);

CREATE TABLE fornitori ( 
NumeroFornitore INT8 NOT NULL,
Denominazione VARCHAR NOT NULL,
RegioneResidenza VARCHAR NOT NULL
);



