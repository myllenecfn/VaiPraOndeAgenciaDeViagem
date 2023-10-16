CREATE DATABASE
use vaipraondeagencia

CREATE TABLE `pacote` (
  `id_pacote` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int DEFAULT NULL,
  `preco_pacote` varchar(10) DEFAULT NULL,
  `cidade_origem` varchar(45) DEFAULT NULL,
  `cidade_destino` varchar(45) DEFAULT NULL,
  `hora_partida` varchar(45) DEFAULT NULL,
  `hora_chegada` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_pacote`),
  KEY `id_cliente_idx` (`id_cliente`),
  CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `usuario` (`id_usuario`)

)

CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `cpf` varchar(20) NOT NULL,
  `nome` varchar(40) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `senha` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
)

