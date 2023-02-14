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
IdCliente INT8 NOT NULL,
DataFattura Date NOT NULL,
NumeroFornitore INT8 NOT NULL,
CONSTRAINT Cliente_FK FOREIGN KEY (IdCliente) REFERENCES clienti(NumeroClienti),
CONSTRAINT Fornitore_FK FOREIGN KEY (NumeroFornitore) REFERENCES fornitori(NumeroFornitore)
);


DROP TABLE fornitori;
DROP TABLE clienti;
DROP TABLE fatture;
DROP TABLE prodotti;

CREATE TABLE prodotti  (
IdProdotto SERIAL PRIMARY KEY,
Descrizione VARCHAR NOT NULL,
InProduzione BOOLEAN NOT NULL DEFAULT 'false',
InCommercio BOOLEAN NOT NULL DEFAULT 'false',
DataAttivazione INT8 NOT NULL,
DataDisattivazione INT8 NOT NULL	
);

CREATE TABLE fornitori ( 
NumeroFornitore SERIAL PRIMARY KEY,
Denominazione VARCHAR NOT NULL,
RegioneResidenza VARCHAR NOT NULL
);

INSERT INTO clienti(Nome, Cognome, DataNascita, RegioneResidenza ) 
		VALUES 	('Mario', 'Rossi', '1/8/1999', 'Lazio'),
				('Giuseppe', 'Verdi', '15/10/2000', 'Lombardia'),
				('Francesca', 'Neri', '24/4/2003', 'Campania'),
				('Antonio', 'Gialli', '29/5/1999', 'Sardegna');
				
INSERT INTO fatture (NumeroFattura, Tipologia, Importo, Iva, IdCliente, DataFattura, NumeroFornitore) 
		VALUES	(1, 'A', '180.20', '10%', 2, '2/2/2022', 1),
				(2, 'B', '533.99', '20%', 1, '29/4/2022', 2),
				(3, 'A', '145.12', '20%', 3, '12/1/2023', 1),
				(4, 'A', '180.90', '15%', 2, '2/2/2023', 1);

INSERT INTO fornitori(Denominazione, RegioneResidenza ) 
		VALUES 	('CodeR', 'Puglia'),
				('JCodeS', 'Sicilia');
				

INSERT INTO prodotti (Descrizione, InProduzione, InCommercio,  DataAttivazione, DataDisattivazione)
		VALUES 	('Prodotto x', true, false, '29/4/2017', '29/4/2023'),
				('Prodotto z', true, true, '15/9/2016', '15/9/2024'),
				('Prodotto q', false, false, '12/12/2017', '12/9/2022');
				

SELECT * FROM clienti;
