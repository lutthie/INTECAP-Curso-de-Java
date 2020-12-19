--BASE DE DATOS--
CREATE DATABASE prueba;
--TABLAS--
 CREATE TABLE vehiculos(
 	vid INT,
 	tipo VARCHAR(25),
	marca VARCHAR(25),
	modelo VARCHAR(25),
	color VARCHAR(25),
	caja VARCHAR(10),
	combustible VARCHAR(25)
 );
 
 CREATE TABLE electronicos(
 	eid INT,
 	nombre VARCHAR(25),
 	tipo VARCHAR(25),
 	procesador VARCHAR(25),
 	generacion INT,
 	ram VARCHAR(10),
 	rom INT
 );
 
 CREATE TABLE paises(
 	pid INT,
 	nombre VARCHAR(25),
 	capital VARCHAR(25),
 	continente VARCHAR(25),
 	poblacion BIGINT,
 	presidente VARCHAR(50paises),
 	flor VARCHAR(25)
 );
--REGISTROS--
 INSERT INTO vehiculos(vid, tipo, marca, modelo, color, caja, combustible) VALUES 
 (1, 'Carro', 'Nissan', 'Micra', 'Naranja', 'Mecánico', 'Gasolina'),
 (2, 'Camioneta', 'Mitsubishi', 'Space Star', 'Gris', 'Mecánico', 'Gasolina'),
 (3, 'Camioneta', 'Nissan', 'Qashqai', 'Azul', 'Mecánico', 'Gasóleo'),
 (4, 'Carro', 'Suzuki', 'Swift', 'Rojo', 'Mecánico', 'Gasolina'),
 (5, 'Carro', 'BMW', 'i3', 'Gris', 'Automático', 'Gasolina'),
 (6, 'Camioneta', 'Ford', 'KA+', 'Rojo', 'Mecánico', 'Gasolina'),
 (7, 'Camioneta', 'Suzuki', 'Vitara', 'Amarillo', 'Mecánico', 'Gasolina'),
 (8, 'Carro', 'Nissan', 'Nismo', 'Blanco', 'Mecánico', 'Gasolina'),
 (9, 'Camioneta', 'Peugeot', 'iOn', 'Verde', 'Automático', 'Gasolina'),
 (10, 'Camioneta', 'Mitsubishi', 'Eclipse Cross', 'Negro', 'Automático', 'Gasóleo'),
 (11, 'Moto', 'Ducati', '1299 Panigale R', 'Rojo', '--', 'Gasolina'),
 (12, 'Carro', 'Kia', 'Optima', 'Blanco', 'Mecánico', 'Gasóleo'),
 (13, 'Camioneta', 'Lamborghini', 'Huracán EVO', 'Naranja', 'Automático', 'Gasolina'),
 (14, 'Furgoneta', 'Suzuki', 'Jimmy', 'Celeste', 'Mecánico', 'Gasolina'),
 (15, 'Pick-up', 'Mitsubishi', 'Club Cab', 'Blanco', 'Mecánico', 'Gasóleo');
 
 INSERT INTO electronicos(eid, nombre, tipo, procesador, generacion, ram, rom) VALUES
 (1, 'DELL', 'Laptop', 'Intel core i7', 4, '250GB', 4),
 (2, 'LG Gram', 'Laptop', 'Intel core i5', 8, '1TB', 16),
 (3, 'HP', 'Escritorio', 'Intel core i7', 7, '500GB', 8),
 (4, 'Asus', 'Laptop', 'Intel core i3', 7, '250GB', 4),
 (5, 'Dell', 'Laptop', 'Intel core i3', 3, '250GB', 2),
 (6, 'Dell', 'Escritorio', 'Intel core i5', 4, '250GB', 12),
 (7, 'HP', 'Escritorio', 'AMD Dual Core', 4, '500GB', 4),
 (8, 'Samsung', 'Laptop', 'Intel core i5', 4, '500GB', 4),
 (9, 'Macbook', 'Laptop', 'Intel core i7', 7, '500GB', 8),
 (10, 'Dell', 'Escritorio', 'Intel core i5', 5, '500GB', 8),
 (11, 'Alienware', 'Laptop', 'Intel core i7', 8, '1TB', 32),
 (12, 'Acer', 'Laptop', 'AMD turbo', 4, '500GB', 2),
 (13, 'Dell', 'Escritorio', 'Intel core i5', 3, '500GB', 8),
 (14, 'Raptor', 'Laptop', 'Intel core i7', 8, '500GB', 16),
 (15, 'HP', 'Escritorio', 'Intel core DUO', 3, '250GB', 4);
 
 INSERT INTO paises(pid, nombre, capital, continente, poblacion, presidente, flor) VALUES
 (1, 'Guatemala', 'Ciudad de Guatemala', 'Centroamérica', 17263000, 'Alejandro Giammattei', 'Monja Blanca'),
 (2, 'Uruguay', 'Montevideo', 'Sur América', 3449299, 'Tabaré Vázquez', 'Ceibo'),
 (3, 'Turquía', 'Ankara', 'Europa-Asia', 82003882, 'Recep Tayyip Erdoğan', 'Tulipán'),
 (4, 'Estados Unidos', 'Washington D.C.', 'Norte América', 327352000, 'Donald Trump', 'Rosa'),
 (5, 'España', 'Madrid', 'Europa', 46870000, 'Pedro Sánchez', 'Clavel'),
 (6, 'Rusia', 'Moscú', 'Europa-Asia', 146800000, 'Vladímir Putin', 'Romashka'),
 (7, 'Argentina', 'Buenos Aires', 'Sur América', 44560000, 'Mauricio Macri', 'Ceibo'),
 (8, 'Peru', 'Lima', 'Sur América', 32162184, 'Martín Vizcarra', 'Cantuta'),
 (9, 'Nicaragua', 'Managua', 'Centoramérica',  6465513, 'Daniel Ortega', 'Plumeria rubra'),
 (10, 'Canada', 'Ottawa', 'Norte América', 37590000, 'Justin Trudeau', 'Hoja de maple'),
 (11, 'Alemania', 'Berlín', 'Europa', 83019213, 'Frank-Walter Steinmeier', 'Aciano'),
 (12, 'Croacia', 'Zagreb', 'Europa', 4076000, 'Kolinda Grabar-Kitarović', 'Iris'),
 (13, 'Arabia Saudita', 'Riad', 'Asia', 33699947, 'Salmán bin Abdulaziz', ' Palma De Fénix'),
 (14, 'Japón', 'Tokio', 'Asia', 126529100, 'Shinzō Abe', 'Cerezo'),
 (15, 'México', 'Ciudad de México', 'Norte América', 125930000, 'Manuel López Obrador', 'Dalia');
 --MOSTRANDO TODA LA TABLA--
 SELECT * FROM vehiculos;
 
 SELECT * FROM electronicos;
 
 SELECT * FROM paises;
 --MOSTRAR SOLO NOMBRE--
 SELECT marca FROM vehiculos;
 
 SELECT nombre FROM electronicos;
 
 SELECT nombre FROM paises;
 --MOSTRAR 3 CAMPOS DE LA TABLA--
 SELECT vid, marca, modelo FROM vehiculos;
 
 SELECT nombre, procesador, generacion FROM electronicos;
 
 SELECT nombre, capital, poblacion FROM paises;
 --MODIFICAR EL 3ER Y 8VO REGISTRO DE LA TABLA--
 -- VEHICULOS --
 UPDATE vehiculos SET caja = 'Automático' WHERE vid = 3;
 UPDATE vehiculos SET tipo = 'Camioneta' WHERE vid = 8;
 --ELECTRONICOS--
 UPDATE electronicos SET procesador = 'Intel core i5' WHERE eid = 3;
 UPDATE electronicos SET nombre = 'Dell' WHERE eid = 8;
 --PAISES--
 UPDATE paises SET poblacion = 82004885 WHERE pid = 3;
 UPDATE paises SET nombre = 'Perú' WHERE pid = 8;
 --MODIFICAR EL REGISTRO QUE ME INDIQUEN--
 UPDATE electronicos SET procesador = 'Intel core i7' WHERE eid = 6;
 UPDATE electronicos SET rom = 16 WHERE eid = 6;
 --ELIMINAR EL ULTIMO REGISTRO DE LA TABLA--
 DELETE FROM vehiculos WHERE vid = 15;
 
 DELETE FROM electronicos WHERE eid = 15;
 
 DELETE FROM paises WHERE pid = 15;
 --ELIMINAR EL ULTIMO CAMPO DE CADA TABLA--
 ALTER TABLE vehiculos DROP COLUMN combustible;
 
 ALTER TABLE electronicos DROP COLUMN rom;
 
 ALTER TABLE paises DROP COLUMN flor;