 --Creación de las bases de datos--
 CREATE DATABASE prueba1;
 CREATE DATABASE prueba2;
 --Creacion de tablas--
 CREATE TABLE tabla_prueba(
 	id INT,
	nombre VARCHAR(25),
	apellido VARCHAR(25),
	telefono INT
 );
 CREATE TABLE tablita(
 	id INT,
 	nombre VARCHAR(25),
 	raza VARCHAR(25),
 	edad INT
 );
 --Eliminar tabla y base de datos--
 DROP TABLE tablita;
 DROP DATABASE prueba2;
 --Modificar o alterar tablas--
 ALTER TABLE tabla_prueba RENAME tabla; --Cambia el nombre de la tabla
 ALTER TABLE tabla DROP COLUMN apellido; --Elimina una columna
 ALTER TABLE tabla ADD PRIMARY KEY(id); --Agrega llave primaria
 ALTER TABLE tabla DROP PRIMARY KEY;--Elimina la llave primaria
 ALTER TABLE tabla ADD edad INT;--Agrega una nueva columna
 ALTER TABLE tabla ADD nit VARCHAR(12) AFTER id;--Agrega una nueva columna en un orden especifico
 ALTER TABLE tabla ADD dpi INT(15) FIRST;--Agrega una nueva columna de primero
 ALTER TABLE tabla CHANGE telefono celular INT;--Cambia el nombre de una columna
 ALTER TABLE tabla CHANGE edad edad SMALLINT;--Cambia el tipo y nombre de variable de la columna
 ALTER TABLE tabla MODIFY nombre VARCHAR(50);--Cambia el tipo de la variable de la columna
 ALTER TABLE tabla MODIFY dpi BIGINT;
 --Consulta INSERT--
 --INSERT INTO <nombre_tabla>(campo,campo,...) VALUES (registro, registro, 'dato tipo texto',...)
 INSERT INTO tabla(dpi, id, nit, nombre, celular, edad) VALUES --Agregando datos de forma individual
 (225533333010123, 1, '784596-6', 'Juanito', 12345678, 78);
 INSERT INTO tabla(dpi, id, nit, nombre, celular,edad) VALUES --Agregando datos multiples
 (134577777770102, 2, '456230-b', 'Pedrito', 45962314, 99),
 (568954865985482, 3, '732560-a', 'Luisito', 56231478, 66);
 --Consulta SELECT--
 --SELECT * FROM <nombre_tabla>; * <- significa TODO
 SELECT * FROM tabla;
 -- SELECT <nombre_campo> FROM <nombre_tabla>;
 SELECT nombre FROM tabla; -- Solo muestra un campo en especifico
 SELECT nombre, edad, dpi FROM tabla; -- Muestra multiples campos en especifico
 SELECT nombre FROM tabla --Mostrar un campo con condiciones
 WHERE edad = 99; --Tambien pueden usarse operadores
 SELECT id, nombre, edad FROM tabla --Tambien se pueden multiples campos
 WHERE edad > 90;
 --Consulta UPDATE--
 --UPDATE <nombre_tabla> SET <campo> = 'nombre nuevo' WHERE id = id del campo a cambiar;
 UPDATE tabla --Modifica algun registro tipo varchar
 SET nombre = 'Pepito' WHERE id = 2;
 UPDATE tabla -- int o cualquier otro tipo de dato
 SET edad = 65 WHERE id = 2;
 TRUNCATE TABLE tabla; --Borra todos los registros en tabla