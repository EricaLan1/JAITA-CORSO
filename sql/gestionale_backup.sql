-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gestionale
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articolo`
--

DROP TABLE IF EXISTS `articolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `articolo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(255) DEFAULT NULL,
  `prezzo` decimal(6,2) DEFAULT NULL,
  `categoria` enum('hardware','software') DEFAULT NULL,
  `rimanenza` tinyint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articolo`
--

LOCK TABLES `articolo` WRITE;
/*!40000 ALTER TABLE `articolo` DISABLE KEYS */;
INSERT INTO `articolo` VALUES (1,'monitor',350.00,'hardware',87),(2,'chiavetta',38.50,'hardware',65),(3,'hard-disk',300.00,'hardware',94),(4,'smartwatch',400.00,'hardware',96),(5,'Photoshop',700.00,'software',98),(6,'Office',350.50,'software',95),(7,'Webcam',68.00,'hardware',94),(8,'Adobe CC',1200.00,'software',100),(9,'Office',120.00,'software',100);
/*!40000 ALTER TABLE `articolo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'rossi','paolo','0116702323','paolo25@gmail.com','Via Roma 25','torino','To','Piemonte',974),(2,'mori','marco','0116704040','marco18@gmail.com','Via Torino 18','milano','Mi','Lombardia',0),(3,'bianchi','luca','0116701010','luca2@gmail.com','Via Milano 2','bologna','Bo','Emilia-Romagna',7671),(4,'verdi','mario','0116702020','mario128@gmail.com','Corso Francia 128','torino','To','Piemonte',0),(5,'rosso','alberto','0116707070','alberto12@icloud.com','Corso Svizzera 12','milano','Mi','Lombardia',785),(6,'esposito','franco','0119978812','francoe@icloud.com','Via Roma 3','Asti','At','Piemonte',3429),(7,'bruni','carlo','0117778816','brunicarlo@icloud.com','Corso Stati Uniti 13','Torino','To','Piemonte',0);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `impiegato`
--

DROP TABLE IF EXISTS `impiegato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `impiegato` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cognome` varchar(50) DEFAULT NULL,
  `ruolo` varchar(50) DEFAULT NULL,
  `rif_to` int DEFAULT NULL,
  `stipendio` decimal(6,2) DEFAULT NULL,
  `ufficio_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_impiegato_ufficio` (`ufficio_id`),
  CONSTRAINT `fk_impiegato_ufficio` FOREIGN KEY (`ufficio_id`) REFERENCES `ufficio` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `impiegato`
--

LOCK TABLES `impiegato` WRITE;
/*!40000 ALTER TABLE `impiegato` DISABLE KEYS */;
INSERT INTO `impiegato` VALUES (1,'Mario','Rossi','tecnico',NULL,2500.00,1),(2,'Marco','Bianchi','amministrativo',7,1600.00,2),(3,'Paolo','Verdi','amministrativo',7,1600.00,2),(4,'Enrico','Marrone','venditore',8,1300.00,3),(5,'Nicola','Testa','venditore',8,1300.00,3),(6,'Franco','Barba','tecnico',1,1500.00,1),(7,'Elena','Totti','amministrativo',NULL,2600.00,2),(8,'Paola','Capra','venditore',NULL,2300.00,3),(9,'Mauro','Barba','venditore',8,1300.00,3);
/*!40000 ALTER TABLE `impiegato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordine`
--

DROP TABLE IF EXISTS `ordine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordine` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cliente_id` int DEFAULT NULL,
  `data` date DEFAULT NULL,
  `consegna` enum('consegnato','da spedire','spedito') DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ordine_cliente` (`cliente_id`),
  CONSTRAINT `fk_ordine_cliente` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordine`
--

LOCK TABLES `ordine` WRITE;
/*!40000 ALTER TABLE `ordine` DISABLE KEYS */;
INSERT INTO `ordine` VALUES (1,1,'2017-12-01','consegnato'),(2,3,'2018-01-11','consegnato'),(3,5,'2018-01-21','da spedire'),(4,3,'2018-01-23','spedito'),(5,6,'2018-02-03','consegnato'),(7,6,'2018-02-13','da spedire'),(12,3,'2018-02-28','spedito');
/*!40000 ALTER TABLE `ordine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordine_dettaglio`
--

DROP TABLE IF EXISTS `ordine_dettaglio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordine_dettaglio` (
  `ordine_id` int NOT NULL,
  `articolo_id` int NOT NULL,
  `quantita` tinyint unsigned DEFAULT NULL,
  `prezzo` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`ordine_id`,`articolo_id`),
  KEY `fk_od_articolo` (`articolo_id`),
  CONSTRAINT `fk_od_articolo` FOREIGN KEY (`articolo_id`) REFERENCES `articolo` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_od_ordine` FOREIGN KEY (`ordine_id`) REFERENCES `ordine` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordine_dettaglio`
--

LOCK TABLES `ordine_dettaglio` WRITE;
/*!40000 ALTER TABLE `ordine_dettaglio` DISABLE KEYS */;
INSERT INTO `ordine_dettaglio` VALUES (1,2,20,38.50),(1,7,3,68.00),(2,5,1,700.00),(2,6,5,350.50),(3,2,10,38.50),(3,4,1,400.00),(4,1,3,350.00),(4,3,2,300.00),(4,7,1,68.00),(5,3,2,300.00),(5,4,3,400.00),(5,5,1,700.00),(5,7,1,68.00),(7,2,5,38.50),(7,3,2,300.00),(7,7,1,68.00),(12,1,10,350.00);
/*!40000 ALTER TABLE `ordine_dettaglio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ufficio`
--

DROP TABLE IF EXISTS `ufficio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ufficio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `indirizzo` varchar(50) DEFAULT NULL,
  `citta` varchar(30) DEFAULT NULL,
  `regione` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ufficio`
--

LOCK TABLES `ufficio` WRITE;
/*!40000 ALTER TABLE `ufficio` DISABLE KEYS */;
INSERT INTO `ufficio` VALUES (1,'IT','3332208666','via milano 31','torino','piemonte'),(2,'Amministrazione','3332208688','via torino 25','milano','lombardia'),(3,'Commerciale','3332207899','via milano 33','torino','piemonte'),(4,'Logistica','3332204366','via torino 27','milano','lombardia');
/*!40000 ALTER TABLE `ufficio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-03  9:33:31
