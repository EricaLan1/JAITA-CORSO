
CREATE TABLE `articolo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(255) DEFAULT NULL,
  `prezzo` decimal(6,2) DEFAULT NULL,
  `categoria` enum('hardware','software') DEFAULT NULL,
  `rimanenza` tinyint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cognome` varchar(50) NOT NULL,
  `nome` varchar(40) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `indirizzo` varchar(100) NOT NULL,
  `citta` varchar(50) NOT NULL,
  `provincia` char(2) NOT NULL,
  `regione` varchar(30) NOT NULL,
  `credito` int DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
);

CREATE TABLE `ordine` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cliente_id` int DEFAULT NULL,
  `data` date DEFAULT NULL,
  `consegna` enum('consegnato','da spedire','spedito') DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_ordine_cliente` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON UPDATE CASCADE
);

CREATE TABLE `ordine_dettaglio` (
  `ordine_id` int NOT NULL,
  `articolo_id` int NOT NULL,
  `quantita` tinyint unsigned DEFAULT NULL,
  `prezzo` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`ordine_id`,`articolo_id`),
  CONSTRAINT `fk_od_articolo` FOREIGN KEY (`articolo_id`) REFERENCES `articolo` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_od_ordine` FOREIGN KEY (`ordine_id`) REFERENCES `ordine` (`id`) ON UPDATE CASCADE
);

CREATE TABLE `ufficio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `indirizzo` varchar(50) DEFAULT NULL,
  `citta` varchar(30) DEFAULT NULL,
  `regione` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `impiegato` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `ruolo` varchar(50) DEFAULT NULL,
  `rif_to` int DEFAULT NULL,
  `stipendio` decimal(6,2) DEFAULT NULL,
  `ufficio_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_impiegato_ufficio` FOREIGN KEY (`ufficio_id`) REFERENCES `ufficio` (`id`) ON UPDATE CASCADE
);