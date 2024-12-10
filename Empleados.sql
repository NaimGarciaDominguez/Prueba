DROP DATABASE IF EXISTS empleados;
CREATE DATABASE empleados CHARACTER SET utf8mb4;
USE empleados;

CREATE TABLE departamento (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  presupuesto DOUBLE UNSIGNED NOT NULL,
  gastos DOUBLE UNSIGNED NOT NULL
);

CREATE TABLE empleado (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nif VARCHAR(9) NOT NULL UNIQUE,
  nombre VARCHAR(100) NOT NULL,
  apellido1 VARCHAR(100) NOT NULL,
  apellido2 VARCHAR(100),
  id_departamento INT UNSIGNED,
  FOREIGN KEY (id_departamento) REFERENCES departamento(id)
);

INSERT INTO departamento VALUES(1, 'Desarrollo', 120000, 6000);
INSERT INTO departamento VALUES(2, 'Sistemas', 150000, 21000);
INSERT INTO departamento VALUES(3, 'Recursos Humanos', 280000, 25000);
INSERT INTO departamento VALUES(4, 'Contabilidad', 110000, 3000);
INSERT INTO departamento VALUES(5, 'I+D', 375000, 380000);
INSERT INTO departamento VALUES(6, 'Proyectos', 0, 0);
INSERT INTO departamento VALUES(7, 'Publicidad', 0, 1000);

INSERT INTO empleado VALUES(1, '32481596F', 'Aarón', 'Rivero', 'Gómez', 1);
INSERT INTO empleado VALUES(2, 'Y5575632D', 'Adela', 'Salas', 'Díaz', 2);
INSERT INTO empleado VALUES(3, 'R6970642B', 'Adolfo', 'Rubio', 'Flores', 3);
INSERT INTO empleado VALUES(4, '77705545E', 'Adrián', 'Suárez', NULL, 4);
INSERT INTO empleado VALUES(5, '17087203C', 'Marcos', 'Loyola', 'Méndez', 5);
INSERT INTO empleado VALUES(6, '38382980M', 'María', 'Santana', 'Moreno', 1);
INSERT INTO empleado VALUES(7, '80576669X', 'Pilar', 'Ruiz', NULL, 2);
INSERT INTO empleado VALUES(8, '71651431Z', 'Pepe', 'Ruiz', 'Santana', 3);
INSERT INTO empleado VALUES(9, '56399183D', 'Juan', 'Gómez', 'López', 2);
INSERT INTO empleado VALUES(10, '46384486H', 'Diego','Flores', 'Salas', 5);
INSERT INTO empleado VALUES(11, '67389283A', 'Marta','Herrera', 'Gil', 1);
INSERT INTO empleado VALUES(12, '41234836R', 'Irene','Salas', 'Flores', NULL);
INSERT INTO empleado VALUES(13, '82635162B', 'Juan Antonio','Sáez', 'Guerrero', NULL);

select nombre, apellido1, apellido2 from empleado;
select DISTINCT apellido1 from empleado;
select * from empleado;
select id_departamento from empleado;
select DISTINCT id_departamento from empleado;
select concat_ws(' ', nombre, apellido1, apellido2) as 'Nombre completo' from empleado;
select lower(concat_ws(' ', nombre, apellido1, apellido2)) as 'Nombre completo' from empleado;
select id, substr(nif from 1 for 8) as 'Dígitos nif', substr(nif from -1) as 'letra nif' from empleado;
select nombre, (presupuesto-gastos) as 'Presupuesto actual' from departamento;
select nombre, (presupuesto-gastos) as 'Presupuesto actual' from departamento ORDER BY 2 asc;
select nombre from departamento ORDER BY nombre desc;
select nombre, apellido1, apellido2 from empleado order by 2,3,1;
select nombre, presupuesto from departamento order by 2 desc limit 3;
select nombre, presupuesto from departamento order by 2 limit 3;
select nombre, gastos from departamento order by 2 desc limit 2;
select nombre, gastos from departamento order by 2 limit 2;
select * from empleado limit 5 offset 2;
select nombre, presupuesto from departamento where presupuesto >= 150000;
select nombre, presupuesto from departamento where presupuesto >= 100000 and presupuesto <=200000;
select nombre, presupuesto from departamento where presupuesto BETWEEN 100000 and 200000;
select nombre, presupuesto, gastos from departamento where gastos > presupuesto;
select nombre, presupuesto, gastos from departamento where gastos < presupuesto;
select nombre, presupuesto, gastos from departamento where gastos = presupuesto;
select * from empleado where apellido2 is null;
select * from empleado where apellido2 is not null;
select * from empleado where apellido2 like 'López';
select * from empleado where apellido2 like 'Díaz' or apellido2 like 'Moreno';
select * from empleado where apellido2 in ('Díaz','Moreno');
select nombre, apellido1, apellido2, nif from empleado where id_departamento=3;
select nombre, apellido1, apellido2, nif from empleado where id_departamento in(2,4,5);
select sum(presupuesto) from departamento;
select round(avg(presupuesto),2) as 'Media de presupuesto' from departamento; -- redondea decimales
select min(presupuesto) from departamento;
select nombre, presupuesto from departamento where presupuesto = (select min(presupuesto) from departamento); -- subconsulta
select max(presupuesto) from departamento;
select nombre, presupuesto from departamento where presupuesto = (select max(presupuesto) from departamento);
select count(*) from empleado;
select count(*) from empleado where apellido2 is not null;