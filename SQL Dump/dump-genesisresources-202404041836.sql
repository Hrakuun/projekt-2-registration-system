-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: genesisresources
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `surname` varchar(100) DEFAULT NULL,
  `personid` varchar(100) NOT NULL,
  `uuid` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `users_unique` (`personid`),
  UNIQUE KEY `users_unique_1` (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Karel','Svoboda','hM5bZ8nK4aVf','093ddff6-073f-4793-80d6-f8c7aa28860d'),(2,'Marie','Bledá','gT4cR7wS0lVx','b79bf847-27ea-4087-9b06-69699fd2b648'),(3,'Karolína','Churavá','xF9hD2yJ3sWv','dc7fa3f7-a483-4dc4-a1f6-465ff5193df6'),(4,'Jan','Kovář','jXa4g3H7oPq2','2cec4d6e-9708-4046-a1da-5062d11d1958'),(5,'Lucia','Kadlecová','yB9fR6tK0wLm','4f7bc69e-925f-47ab-9a29-5cf5b9f37d87'),(6,'Ondřej','Tipl','cN1vZ8pE5sYx','571edd43-560e-4a1a-bb5a-fe0eab17d722'),(7,'Tomáš','Surový','tQdG2kP3mJfB','a8314630-b17f-4b76-85ae-20f92d64e2b7'),(8,'Zuzana','Šedivá','iM5sO6zXcW7v','78345dd0-fa29-4c0c-a8d3-380315da9321'),(9,'Milan','Sedlák','rU8nA9eT2bYh','723b4088-ce6e-48ff-a171-6a975f005cec'),(10,'Tereza','Poláková','wV6eH1fK7qZj','5c0dfb1d-976f-4c3b-b739-1048ad4ab525');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'genesisresources'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-04 18:36:55
