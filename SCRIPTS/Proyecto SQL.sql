CREATE DATABASE actividad;

CREATE TABLE personas(
 pid INT,
 nombre VARCHAR(25),
 apellido VARCHAR(25),
 edad INT,videojuegos
 sexo VARCHAR(10),
 correo VARCHAR(50),
 telefono INT,
 nacionalidad VARCHAR(50),
 departamento VARCHAR(50),
 estudios VARCHAR(50)
);

CREATE TABLE videojuegos(
 vid INT,
 nombre VARCHAR(50),
 plataforma VARCHAR(25),
 genero VARCHAR(25),
 flanzamiento INT,
 ver FLOAT,
 desarrollador VARCHAR(50),
 clasificacion VARCHAR(50),
 peso INT,
 lenguaje VARCHAR(25)
);

SELECT * FROM personas;
SELECT * FROM videojuegos;