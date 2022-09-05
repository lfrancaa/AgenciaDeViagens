-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: agenciadeviagens
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `checkout`
--

DROP TABLE IF EXISTS `checkout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checkout` (
  `ID_Checkout` int NOT NULL,
  `ID_Destino` int NOT NULL,
  `ID_Promocao` int NOT NULL,
  `ID_Voo` int NOT NULL,
  `ID_Hoteis` int NOT NULL,
  `Nome` varchar(45) NOT NULL,
  `Sobrenome` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Endereco` varchar(45) NOT NULL,
  `Complemento` varchar(45) NOT NULL,
  `Pais` varchar(20) NOT NULL,
  `Estado` varchar(20) NOT NULL,
  `CEP` varchar(20) NOT NULL,
  `Preco_Passagem` double(10,2) NOT NULL,
  `Formas_Pagamento` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_Checkout`),
  KEY `ID_Destino` (`ID_Destino`),
  KEY `ID_Promocao` (`ID_Promocao`),
  KEY `ID_Voo` (`ID_Voo`),
  KEY `ID_Hoteis` (`ID_Hoteis`),
  CONSTRAINT `checkout_ibfk_1` FOREIGN KEY (`ID_Destino`) REFERENCES `destinos` (`ID_Destino`),
  CONSTRAINT `checkout_ibfk_2` FOREIGN KEY (`ID_Promocao`) REFERENCES `promocoes` (`ID_Promocao`),
  CONSTRAINT `checkout_ibfk_3` FOREIGN KEY (`ID_Voo`) REFERENCES `voos` (`ID_Voo`),
  CONSTRAINT `checkout_ibfk_4` FOREIGN KEY (`ID_Hoteis`) REFERENCES `hoteis` (`ID_Hoteis`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkout`
--

LOCK TABLES `checkout` WRITE;
/*!40000 ALTER TABLE `checkout` DISABLE KEYS */;
/*!40000 ALTER TABLE `checkout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `destinos`
--

DROP TABLE IF EXISTS `destinos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `destinos` (
  `ID_Destino` int NOT NULL,
  `Local_Viagem` varchar(35) NOT NULL,
  `Valor_Viagem` double(6,2) NOT NULL,
  PRIMARY KEY (`ID_Destino`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destinos`
--

LOCK TABLES `destinos` WRITE;
/*!40000 ALTER TABLE `destinos` DISABLE KEYS */;
INSERT INTO `destinos` VALUES (1,'Machu Picchu Peru',3112.00),(2,'Santorini Grecia',6381.00),(3,'Roma Itália',6381.00),(4,'Ilhas Maldivas Ásia Meridional',7277.00),(5,'Paris Franca',7487.00),(6,'Alberta Canadá',6866.00),(7,'Fernando de Noronha Brasil',1300.00),(8,'Rio de Janeiro Brasil',1150.00),(9,'São Paulo Brasil',1000.00),(10,'Lagos Portugal',9684.00),(11,'Patagônia Chile',1376.00),(12,'Kruger Park África do Sul',7530.00);
/*!40000 ALTER TABLE `destinos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoteis`
--

DROP TABLE IF EXISTS `hoteis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoteis` (
  `ID_Hoteis` int NOT NULL,
  `Hotel` varchar(40) NOT NULL,
  `Checkin` date NOT NULL,
  `Noites` float NOT NULL,
  `Adultos` float NOT NULL,
  `Valor_Hospedagem` double(6,2) NOT NULL,
  PRIMARY KEY (`ID_Hoteis`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoteis`
--

LOCK TABLES `hoteis` WRITE;
/*!40000 ALTER TABLE `hoteis` DISABLE KEYS */;
INSERT INTO `hoteis` VALUES (1,'Sumaq Machu Picchu Hotel','2022-10-12',5,2,2348.00),(2,'Katikies Garden Hotel','2022-08-10',6,1,700.00),(3,'The Wesley Rome Hotel','2022-07-13',4,2,2348.00),(4,'Gili Lankanfushi Maldives Hotel','2022-10-10',5,1,1200.00),(5,'Mayfair Paris Hotel','2022-10-12',6,2,992.00),(6,'The Ritz-Carlton Hotel','2022-08-10',4,1,932.00),(7,'Pousada Corveta','2022-07-13',5,2,542.00),(8,'Arena Leme Hotel','2022-10-12',6,1,150.00),(9,'Pousada Bahia Bella','2022-08-10',4,2,230.00),(13,'Fujinomiya Fujikyu Hotel','2022-07-13',5,1,343.00),(14,'L oscar Londres Hotel','2022-10-12',6,2,286.00),(15,'Safestay Madrid','2022-08-10',4,1,686.00),(16,'Canopy By Hilton Cancun La Isla','2022-07-13',5,2,958.00),(18,'The Marker Hotel','2022-10-12',6,1,751.00);
/*!40000 ALTER TABLE `hoteis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passageiros`
--

DROP TABLE IF EXISTS `passageiros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passageiros` (
  `ID_Passageiro` int NOT NULL,
  `Nome` varchar(45) NOT NULL,
  `RG` varchar(25) NOT NULL,
  `CPF` varchar(25) NOT NULL,
  `Data_Nascimento` date NOT NULL,
  `Endereco` varchar(45) NOT NULL,
  `Complemento` varchar(45) NOT NULL,
  `CEP` varchar(20) NOT NULL,
  `Estado` varchar(20) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Telefone` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_Passageiro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passageiros`
--

LOCK TABLES `passageiros` WRITE;
/*!40000 ALTER TABLE `passageiros` DISABLE KEYS */;
INSERT INTO `passageiros` VALUES (1,'Miguel','47.731.795-9','230.864.120-70','2001-05-10','Rua Manoel Ribas','Bairro Centro - Cidade Cascavel','85801-230','Paraná','jahangir6864@gmail.com','(42) 2524-6566'),(2,'Davi','31.592.295-3','144.610.870-85','1999-02-06','Rua Caminho 46-Setor 07','Bairro Cajazeiras - Cidade Salvador','41345-183','Bahia','olmedo2531@uorak.com','(75) 2525-1987'),(3,'Sophia','31.276.864-3','189.126.590-30','1996-03-07','Rua Governador Cloves Nova da Costa','Bairro Dr. Airton Rocha - Cidade Boa Vista','69318-752','Roraima','rochel4821@hotmail.com','(95) 2604-4189'),(4,'Alice','13.622.816-1','768.325.490-83','2001-07-01','Rua Carpinteiro Peres Junior','Bairro Japiim - Cidade Manaus','69077-292','Amazonas','xoaquin5536@yahoo.com.br','(92) 3374-2486'),(5,'Arthur','38.569.181-6','795.731.530-50','1998-01-05','Rua Pedro Ferreira de Castro','Bairro Copas Verdes - Cidade Ji-Paraná','76901-620','Roraima','devin7061@hotmail.com','(92) 2045-3668'),(6,'Julia','30.903.830-3','762.191.510-20','2000-06-21','Rua João Damasceno Ramos','Bairro Novo Maranguape II - Cidade Maranguape','61944-410','Ceará','castora5952@gmail.com','(85) 2774-9801'),(7,'Pedro','27.897.926-9','096.095.880-00','1995-08-14','Quadra QC 5 Conjunto 8','Bairro Riacho Fundo II - Cidade Brasília','71882-208','Distrito Federal','ariela9738@gmail.com','(61) 2668-0347'),(8,'Isabella','39.726.388-0','116.857.990-27','1997-10-28','Rua Praça Apolo','Bairro Vila Amélia - Cidade Itabira','35900-716','Minas Gerais','erikas80@yahoo.com.br','(31) 3868-1061'),(9,'Gabriel','50.975.527-6','081.980.350-28','2002-09-19','Rua Érico Alves dos Santos','Bairro Jabotiana - Cidade Aracaju','49095-550','Sergipe','aingeru2397@hotmail.com','(79) 2451-3581'),(10,'Manuela','50.178.045-2','512.230.640-00','2003-12-14','Rua da Linha','Bairro Moisés Reis - Cidade Eunápolis','45824-370','Bahia','marilou1334@gmail.com','(75) 2513-1923');
/*!40000 ALTER TABLE `passageiros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passagens`
--

DROP TABLE IF EXISTS `passagens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passagens` (
  `ID_Passagem` int NOT NULL,
  `ID_Passageiro` int NOT NULL,
  `ID_Checkout` int NOT NULL,
  `Hora_Viagem` time NOT NULL,
  `Nome_Local_Origem` varchar(40) NOT NULL,
  `Nome_Local_Destino` varchar(40) NOT NULL,
  `Data_Viagem_Ida` date NOT NULL,
  `Data_Viagem_Volta` date NOT NULL,
  PRIMARY KEY (`ID_Passagem`),
  KEY `ID_Passageiro` (`ID_Passageiro`),
  KEY `ID_Checkout` (`ID_Checkout`),
  CONSTRAINT `passagens_ibfk_1` FOREIGN KEY (`ID_Passageiro`) REFERENCES `passageiros` (`ID_Passageiro`),
  CONSTRAINT `passagens_ibfk_2` FOREIGN KEY (`ID_Checkout`) REFERENCES `checkout` (`ID_Checkout`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passagens`
--

LOCK TABLES `passagens` WRITE;
/*!40000 ALTER TABLE `passagens` DISABLE KEYS */;
/*!40000 ALTER TABLE `passagens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promocoes`
--

DROP TABLE IF EXISTS `promocoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promocoes` (
  `ID_Promocao` int NOT NULL,
  `Local_Viagem` varchar(35) NOT NULL,
  `Valor_Viagem` double(7,2) NOT NULL,
  PRIMARY KEY (`ID_Promocao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promocoes`
--

LOCK TABLES `promocoes` WRITE;
/*!40000 ALTER TABLE `promocoes` DISABLE KEYS */;
INSERT INTO `promocoes` VALUES (13,'Fujinomiya Shizuoka, Japão',9500.00),(14,'Londres Inglaterra',9869.00),(15,'Madri Espanha',6879.00),(16,'Chichén-Itzá Yuc. Mexico',7095.00),(17,'Bangkokl Tailândia',14807.00),(18,'Dublin Irlanda',8008.00);
/*!40000 ALTER TABLE `promocoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voos`
--

DROP TABLE IF EXISTS `voos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `voos` (
  `ID_Voo` int NOT NULL,
  `Linha_Aerea` varchar(35) NOT NULL,
  `Origem` varchar(40) NOT NULL,
  `Destino` varchar(40) NOT NULL,
  `Partida` datetime NOT NULL,
  `Chegada` datetime NOT NULL,
  `Paradas` float NOT NULL,
  `Valor_voo` double(7,2) NOT NULL,
  PRIMARY KEY (`ID_Voo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voos`
--

LOCK TABLES `voos` WRITE;
/*!40000 ALTER TABLE `voos` DISABLE KEYS */;
INSERT INTO `voos` VALUES (1,'Gol','Sao Paulo','Machu Picchu Peru','2022-10-12 13:10:00','2022-10-12 22:10:00',2,1634.00),(2,'Latam','Rio de Janeiro','Santorini Grecia','2022-08-08 12:00:00','2022-08-10 04:00:00',4,6007.00),(3,'Azul','Sao Paulo','Roma Itália','2022-07-13 10:00:00','2022-07-13 21:16:00',3,7956.00),(4,'Gol','Rio de Janeiro','Ilhas Maldivas Ásia Meridional','2022-10-09 10:00:00','2022-10-10 02:00:00',1,9418.00),(5,'Latam','Sao Paulo','Paris Franca','2022-10-12 09:10:00','2022-10-12 20:10:00',2,3592.00),(6,'Azul','Rio de Janeiro','Alberta Canadá','2022-08-10 07:10:00','2022-08-10 17:10:00',1,5277.00),(7,'Gol','Sao Paulo','Fernando de Noronha Brasil','2022-07-13 10:00:00','2022-07-13 14:00:00',1,1375.00),(8,'Latam','Sao Paulo','Rio de Janeiro Brasil','2022-10-12 15:10:00','2022-10-12 16:10:00',1,913.00),(9,'Latam','Rio de Janeiro','São Paulo Brasil','2022-08-10 15:10:00','2022-08-10 16:10:00',1,913.00),(13,'Azul','Sao Paulo','Fujinomiya Shizuoka, Japão','2022-07-12 10:00:00','2022-07-13 10:00:00',4,13010.00),(14,'Gol','Rio de Janeiro','Londres Inglaterra','2022-10-12 10:00:00','2022-10-12 21:00:00',2,6459.00),(15,'Latam','Sao Paulo','Madri Espanha','2022-08-10 08:00:00','2022-08-10 18:00:00',3,8708.00),(16,'Azul','Rio de Janeiro','Chichén-Itzá Yuc. Mexico','2022-07-13 12:10:00','2022-07-13 23:10:00',2,5623.00),(18,'Latam','Rio de Janeiro','Dublin Irlanda','2022-10-12 13:10:00','2022-10-12 23:10:00',2,7253.00);
/*!40000 ALTER TABLE `voos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'agenciadeviagens'
--

--
-- Dumping routines for database 'agenciadeviagens'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-05  9:47:21
