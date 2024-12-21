-- Insert a row with some coloumns
INSERT INTO instructors
VALUES(7,'A','B','email','phone');
-- Insert into 'Table_name' (Columns, ..)
-- Values (Value_1, ..)
INSERT INTO 
instructors (first_name, last_name, email, phone)
VALUES
(7,'A','B','email', NULL);
-- INSERT INTO 'TABLE_NAME' (COLUMNS, ...)
-- VALUES (VALUE_1, ..)
-- Get all students
SELECT * FROM students;
-- Get first and last name of all students
SELECT first_name, last_name FROM students;
-- Get first and last name of all students
-- FIRST NAME, LAST NAME
SELECT first_name AS 'FIRST NAME', last_name AS 'LAST NAME' FROM students;
-- Insert a student with first name A and last name B and email email@gmail.c
INSERT INTO students(first_name, last_name, email)
VALUES('A', 'B', 'email@gmail.com');
-- Get all instructors
SELECT * FROM instructors;
-- Get the email and phone number of all instructors
SELECT EMAIL, PHONE FROM INSTRUCTORS;
-- Get all batches
SELECT * FROM batches;
-- Get the name and start date of all batches
-- Name -> FULL_NAME start_date -> START
SELECT name AS 'FULL_NAME', start_date AS 'START' FROM batches;
-- Get the addresses
SELECT address FROM students;
-- Get the unique addresses
SELECT DISTINCT address FROM students;
-- Get all the unique batch ids for the students
SELECT DISTINCT batch_id FROM students;
-- Get all the unique instructor IDs for the batches
SELECT DISTINCT instructor_id FROM batches;

SELECT 99 * 100;
SELECT 'HELLO WORLD';

SELECT 'INSTRUCTOR', instructor_id FROM batches;
-- Get all the students and thier IQs / 100
-- 100 = 1
-- 90 = 0.9
SELECT first_name, last_name, round(iq / 100) FROM students;
-- Get the full name of the student
SELECT  FROM students; -- TODO
-- Get the student with ID equal to 1
SELECT * FROM students WHERE id = 1;
-- Get the name and email of all the students that live in Jhansi
SELECT first_name, last_name FROM students WHERE address = 'Jhansi';
-- Get all students with IQ greater than 150
SELECT first_name, last_name, iq, address FROM students WHERE iq > 150;
-- Get all students with IQ greater than 150 and they are from Meerut
SELECT first_name, last_name, iq FROM students WHERE iq > 150 AND address = 'Meerut';
-- Get all students with IQ greater than 100 and less than 150
SELECT first_name, last_name, iq FROM students WHERE iq > 100 AND iq < 150;
-- Get all students with IQ greater than 100 or less than 150
SELECT first_name, last_name, iq FROM students WHERE iq > 100 OR iq < 150;
-- Get all students with IQ less than 100 or greater than 150
SELECT first_name, last_name, iq FROM students WHERE iq < 100 OR iq > 150;
-- Get all the students who are not from Meerut
-- !=, <>, NOT
SELECT * FROM students WHERE address <> 'Meerut';
-- Get all students with first name 'John' or first name 'Mycroft'
SELECT * FROM students WHERE first_name = 'John' OR first_name = 'Mycroft';
-- Get all students without the first name 'John'
SELECT * FROM students WHERE first_name <> 'John';
-- Get all students with first name 'John','Mycroft','Anakin','Luke'
-- contains operator -- IN
SELECT * FROM students WHERE first_name = 'John' OR first_name = 'Mycroft' OR first_name = 'Anakin' OR first_name = 'Luke';
SELECT * FROM students WHERE first_name IN('John', 'Mycroft', 'Anakin', 'Luke');
-- Get all the students who live in Jhansi, Meerut and London
SELECT * FROM students WHERE address In ('Jhansi', 'Meerut', 'London');
-- Get all the students who do not live in Jhansi, Meerut and London
SELECT * FROM students WHERE address NOT IN ('Jhansi', 'Meerut', 'London');





