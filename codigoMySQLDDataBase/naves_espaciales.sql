# Código SQL de la DATABASE con las tres tablas, para la ejecuación en caso de
# que no se pueda hacer la ejecución local de la DB 
# Cada tipo de nave con 5 registros

DROP DATABASE IF EXISTS naves_espaciales;

use naves_espaciales;

# Table	Create Table lanzadera	
CREATE TABLE `lanzadera` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `altura` float NOT NULL,
  `fecha_actividad` varchar(80) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `pais_origen` varchar(100) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `toneladas_empuje` float NOT NULL,
  `toneladas_peso` float NOT NULL,
  `velocidad` float NOT NULL,
  `tipo_combustible` varchar(65) NOT NULL,
  `toneladas_carga` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


# Table	Create Table nave_tripulada	
CREATE TABLE `nave_tripulada` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `altura` float NOT NULL,
  `fecha_actividad` varchar(80) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `pais_origen` varchar(100) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `toneladas_empuje` float NOT NULL,
  `toneladas_peso` float NOT NULL,
  `velocidad` float NOT NULL,
  `orbita_tierra` varchar(10) NOT NULL,
  `tripulacion` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


# Table	Create Table nave_no_tripulada	
CREATE TABLE `nave_no_tripulada` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `altura` float NOT NULL,
  `fecha_actividad` varchar(80) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `pais_origen` varchar(100) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `toneladas_empuje` float NOT NULL,
  `toneladas_peso` float NOT NULL,
  `velocidad` float NOT NULL,
  `orbita_tierra` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `lanzadera` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`tipo_combustible`,`toneladas_carga`) VALUES (1,150,'1999-2005','Launh 1021','Ecuador','Lanzadera',150,122,250,'Gasolina y TNT',300);
INSERT INTO `lanzadera` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`tipo_combustible`,`toneladas_carga`) VALUES (3,50,'1997-Actualidad','Lancer 22','Venezuela','Lanzadera',123,65,88,'Trinitrato de sodio',33);
INSERT INTO `lanzadera` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`tipo_combustible`,`toneladas_carga`) VALUES (4,44,'1996-1998','Launcher 145','Inglaterra','Lanzadera',65,78,321,'Carbon y Trinimetano',48);
INSERT INTO `lanzadera` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`tipo_combustible`,`toneladas_carga`) VALUES (5,78,'2020-2022','Lanzador 1','España','Lanzadera',300,150,600,'Trinitrato de sodio',280);
INSERT INTO `lanzadera` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`tipo_combustible`,`toneladas_carga`) VALUES (7,100,'1969-1973','Saturno V','Estados Unidos','Lanzadera',3500,2900,250,'Queroseno',118);


INSERT INTO `nave_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`,`tripulacion`) VALUES (2,588,'1969-2022','Estación Espacial Internacional','Cooperacion internacional','Tripulada',354,2284,365,'Si',25);
INSERT INTO `nave_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`,`tripulacion`) VALUES (3,254,'1969','Apolo XI','Estados Unidos','Tripulada',150,200,367,'No',10);
INSERT INTO `nave_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`,`tripulacion`) VALUES (4,180,'1998-1999','Vostok','Rusia','Tripulada',90,150,600,'No',6);
INSERT INTO `nave_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`,`tripulacion`) VALUES (6,150,'2022','Estación Espacial de Colombia','Colombia','Tripulada',10,150,700,'Si',10);
INSERT INTO `nave_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`,`tripulacion`) VALUES (7,150,'1988-2010','Skylab','Estados Unidos','Tripulada',10,77,438,'Si',8);


INSERT INTO `nave_no_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`) VALUES (1,90,'1997-Actualidad','Voyaguer 1','Colombia','No tripulada',15,300,1500,'No');
INSERT INTO `nave_no_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`) VALUES (2,50,'2018-Actualidad','Humbble','Canadá','No tripulada',2,10,1200,'No');
INSERT INTO `nave_no_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`) VALUES (3,60,'2015-Actualidad','Satélite 10','Rusia','No tripulada',6,17,1300,'Si');
INSERT INTO `nave_no_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`) VALUES (4,50,'2022','Humbble 34','Reino Unido y Colombia','No tripulada',2,20,12000,'No');
INSERT INTO `nave_no_tripulada` (`id`,`altura`,`fecha_actividad`,`nombre`,`pais_origen`,`tipo`,`toneladas_empuje`,`toneladas_peso`,`velocidad`,`orbita_tierra`) VALUES (5,60,'1999-2010','Helios','Alemania y Estados Unidos','No tripulada',1,12,30000,'No');



