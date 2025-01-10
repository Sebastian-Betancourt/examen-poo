create database poo;
use poo;
drop database poo;
/*-----------------------------------------------------*/
/*Personal*/
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    pass VARCHAR(255) NOT NULL
);
INSERT INTO usuarios (username, pass)
VALUES
    ('Sebas','123');
    
/*-----------------------------------------------------*/    
/*Tabla estudiante:*/
CREATE TABLE estudiantes (
    cedula int PRIMARY KEY  NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL
);

INSERT INTO estudiantes (cedula, nombre)
VALUES
    ('1728454297','Sebastian Betancourt'),
    ('1724578436','Jairo Iza'),
    ('1732014520','Jordan Portilla'),
    ('1798741214','Jair Vega'),
    ('1702015468','Marco Cordova');
/*-----------------------------------------------------*/
CREATE TABLE materias (
	cedula int,
	gestion DOUBLE NOT NULL,
    diseño DOUBLE NOT NULL,
    bases DOUBLE NOT NULL,
    analisis DOUBLE NOT NULL,
    poo DOUBLE NOT NULL,
    
    promedio double,
    resultado varchar,
    cedula foreign key reference(estudiantes));
    
    
    