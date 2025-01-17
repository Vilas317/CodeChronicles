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
SELECT CONCAT(first_name, ' ', last_name) AS FULL_NAME FROM students; -- TODO
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
-- Get all the bacthes that are taught by instructor ID 1
SELECT * FROM batches WHERE instructor_id = 1;
-- Get all the instructors whose last name is either holmes or odinson or Yoda
SELECT first_name, last_name FROM instructors WHERE last_name = 'Holmes' OR last_name = 'Odinson';
-- or
SELECT first_name, last_name FROM instructors WHERE last_name IN ('Odinson', 'Holmes', 'Yoda');
-- Get all the bacthes that started after 2022-01-01
SELECT * FROM bacthes WHERE start_date > '2022-01-01';
-- Get all the batches between 2017-01-01 and 2022-01-01 inclusive
SELECT * FROM bacthes WHERE start_date >= '2017-01-01' AND start_date <= '2022-01-01';
-- BETWEEN CLAUSE
SELECT * FROM bacthes WHERE start_date BETWEEN '2017-01-01' AND '2022-01-01';
-- Get the full name of all the students born between 1657-01-01 AND 1973-01-01
SELECT CONCAT(first_name, '', last_name) AS full_name FROM students WHERE birth_date BETWEEN '1657-01-01' AND '1973-01-01';
-- Get all the students whose IQ is between 100 and 150
SELECT CONCAT(first_name, '', last_name) AS full_name FROM students WHERE iq BETWEEN 100 AND 150;
-- String matching
-- LIKE
-- Get all the batches that have the word Jedi in the same
-- STARTS with - Jedi Academy, Jedi School
-- %
SELECT * FROM batches WHERE name LIKE 'Jedi%';
-- Get all the bacthes where the name ends with Academy
SELECT * FROM batches WHERE name LIKE '%Academy';
-- Get all the batches that contain the word "and" in the name
SELECT * FROM batches WHERE name LIKE '%and%';
-- Get all the students with first name starting with 'T'
SELECT * FROM students WHERE first_name LIKE 'T%';
-- _ underscore wildcard
-- Get all the instructors whose first name is a single character
SELECT * FROM instructors WHERE first_name LIKE '_';
-- Get all the instructors that contain an a in the first name
SELECT * FROM instructors WHERE first_name LIKE '%a%';
-- Get all the single character emails ending with domain @jedi.com
-- t@jedi.com a@jedi.com
SELECT * FROM instructors WHERE email LIKE '_@jedi.com';
-- Get all the single character emails with any domain
-- a@jedi.com s@sherlock.ed
SELECT * FROM instructors WHERE email LIKE '_@%.%';
-- Get all the instructors who do not have a phone number
SELECT * FROM instructors WHERE phone IS NULL;
-- Get all the instructors who have a phone number
SELECT * FROM instructors WHERE phone IS NOT NULL;
-- Get all the instructors who do not have an phone number but have a email
SELECT * FROM instructors WHERE phone IS NULL AND email IS NOT NULL;
-- Get all the unique addresses of students and sort by the NAME
SELECT DISTINCT address FROM students WHERE address IS NOT NULL ORDER BY address;
-- SELECT DISTINCT iq, address FROM students WHERE address IS NOT NULL ORDER BY iq;
-- LIMIT
-- Get the top 5 students by IQ
SELECT id, first_name, last_name, iq FROM Students ORDER BY iq DESC LIMIT 5;
-- Get the 5 students who have the lowest iq
SELECT id, first_name, last_name, iq FROM Students ORDER BY iq ASC LIMIT 5;
-- Get the 5 oldest students 
SELECT first_name, last_name, birth_date FROM Students WHERE birth_date IS NOT NULL ORDER BY birth_date LIMIT 5;

-- UPDATE
-- Set the birthdate = 2022-01-01 where it is null
SELECT * FROM students WHERE birth_date IS NULL;
UPDATE students SET birth_date = '2022-01-01' WHERE birth_date IS NULL;
-- Set the phone to 123-456-7890 and address to Meerut for the student with id 10
UPDATE students SET phone = '123-456-7890', address = 'Meerut' WHERE ID = 10;

-- DELETE
-- DELETE FROM 'table_name' WHERE condition;
-- DELETE the students with ID 10
DELETE FROM students WHERE ID = 10;
-- DELTE all the instructors with a single character first name
DELETE FROM instructors WHERE first_name LIKE '_';

-- JOIN
-- Get all the students with their batch names
SELECT * FROM students s JOIN batches b ON s.batch_id = b.id;
-- Sort data by student ID
SELECT * FROM students s JOIN batches b ON s.batch_id = b.id ORDER BY s.id;
SELECT s.id, s.batch_id, b.id, b.name FROM batches b JOIN students s;
-- Get all the instructors along with their batches
-- SELECT * from instructors i JOIN batches b ON i.id = b.id;
SELECT * FROM batches b JOIN instructors i ON b.instructor_id = i.id;
-- Get all the students where batch name = Jedi Academy 1
SELECT * FROM students s JOIN batches b ON s.batch_id = b.id WHERE b.name = 'Jedi Academy 1';
-- Get all the batches where instructor is called Mycroft
SELECT batches.id, batches.name, instructors.id, CONCAT(instructors.first_name, ' ', instructors.last_name) AS FULL_NAME FROM batches JOIN instructors ON batches.instructor_id = instructors.id WHERE instructors.first_name = 'Mycroft';
-- Get all the students who are in batch where the name starts with "Jedi"
SELECT b.id, b.name, s.id, CONCAT(s.first_name, ' ', s.last_name) AS FULL_NAME FROM students s JOIN batches b ON s.batch_id = b.id WHERE b.`name` LIKE 'jedi%';
-- Get all the students who are in a batch which started before 2012-01-01
SELECT * FROM students s JOIN batches b ON s.batch_id = b.id WHERE b.start_date < '2012-01-01';
-- Get all the batches where instructor has an email address ending with @jedi.com
SELECT b.id, b.name, i.id, concat(i.first_name,' ', i.last_name) AS FULL_NAME FROM batches b JOIN instructor i ON b.instructor_id = i.id WHERE i.email LIKE '%@jedi.com';
-- Get all the students whose instructor has an email address ending with @jedi.com
SELECT * FROM students s JOIN batches b ON s.batch_id = b.id JOIN instructors i ON b.instructor_id = i.id WHERE i.email LIKE '%jedi.com';
-- Get all the bacthes and their instructor names
SELECT b.id, b.name, i.id, i.first_name, i.last_name FROM batches b LEFT JOIN instructors i ON b.instructor_id = i.id;
SELECT b.id, b.name, i.id, i.first_name, i.last_name FROM instructors i RIGHT JOIN batches b ON b.instructor_id = i.id;
-- Get all the students and their batch names
SELECT * FROM student s JOIN batches b ON s.batch_id = b.id;
SELECT s.id, s.first_name, s.last_name, b.id, b.name FROM batches b RIGHT JOIN students s ON s.batch_id = b.id;
-- Get all students with their instructors. If a student has no instructor, then show NULL for the instructor's name.
SELECT s.id, concat(s.first_name,' ', s.last_name) AS STUDENT_NAME, b.id, b.name, i.id, concat(i.first_name,' ', i.last_name) AS INSTRUCTOR_NAME FROM students s LEFT JOIN batches b ON s.batch_id = b.id LEFT JOIN instructors i ON b.instructor_id = i.id;

-- Aggregrate Queries
-- Count Function
SELECT COUNT(id) FROM students;
SELECT COUNT(batch_id) FROM students;
SELECT COUNT(*) FROM students;
SELECT COUNT(*) FROM batches;
-- From the students table, get me the number of unique batch IDs
SELECT COUNT(DISTINCT batch_id) FROM students;
-- FUNCTION(COLUMN_NAME)
-- Get the average IQ of all students
SELECT AVG(iq) FROM students;
-- Get the count of all the students along with the average IQ
SELECT COUNT(*), AVG(iq) FROM students;
-- Get the minimum and maximum IQs
SELECT MIN(iq), MAX(iq) FROM students;
-- Get sum of all IQs
SELECT SUM(iq) FROM students;
-- Get the oldest batch
SELECT MIN(start_date) FROM batches;
-- How many batches start have name starts with jedi
SELECT COUNT(*) FROM batches WHERE name LIKE 'Jedi%';
-- How many students have an IQ above 150
SELECT COUNT(*) FROM students WHERE IQ > 150;
-- What is the average IQ? Without using AVG function
SELECT SUM(iq)/COUNT(iq) FROM students;
SELECT COUNT(1) from students;
-- Get the count of students per batch
SELECT batch_id, COUNT(*) FROM students GROUP BY batch_id;
-- Get the number of batches per instructor
SELECT instructor_id, COUNT(*) FROM batches GROUP BY instructor_id;
-- Get the avg IQ for each batch. Exclude students without a batch
SELECT batch_id, AVG(iq) FROM students WHERE batch_id IS NOT NULL GROUP BY batch_id;
-- Find the average IQ of students in batches with batch ID 1 and 2
SELECT batch_id, AVG(iq) FROM students WHERE batch_id IN(1,2) GROUP BY batch_id;
-- Get the total number of batches taught by each instructor
-- It should also include instructors that do not teach a batch
SELECT i.id, COUNT(b.id)
FROM instructors i
LEFT JOIN batches b ON b.instructor_id = i.id
GROUP BY i.id;
-- Get all the batches where the average iq > 120
SELECT batch_id, AVG(iq) as avg_iq
FROM students 
WHERE batch_id IS NOT NULL 
GROUP BY batch_id
HAVING avg_iq > 130;
-- Get the maximum iq of the students in a batch with more than 1 student
SELECT batch_id, MAX(iq)
FROM students
WHERE batch_id IS NOT NULL
GROUP BY batch_id
HAVING COUNT(*) > 1;

-- SUBQUERIES
-- Find all the students where iq > max iq of batch 2
-- Break the query
-- Get the max iq of batch 2
SELECT MAX(iq) FROM students WHERE batch_id = 2;
SELECT * FROM students WHERE iq > (SELECT MAX(iq) FROM students WHERE batch_id = 2);
-- Get all the students where the iq greater than the avg iq
SELECT * FROM students WHERE iq > (SELECT AVG(iq) FROM students);
-- Find the students whose iq > the iq of student with id 5
SELECT * FROM students WHERE iq > (SELECT iq FROM students WHERE id = 5);
-- Find all the students who are in batches that start with the word jedi
SELECT * FROM students WHERE batch_id IN (SELECT id FROM batches WHERE name LIKE 'Jedi%');
-- Find all the batches where the instructor has an email @jedi.com
SELECT * FROM batches WHERE instructor_id IN (SELECT id FROM instructors WHERE email LIKE '%@jedi.com');
SELECT id, i.first_name as first FROM (SELECT * FROM instructors WHERE email LIKE '%@jedi.com') AS i;
-- ALL and ANY
-- Get all the students whose iq is greater than all the iqs of the batch id 2 students(We can use ALL/ANY)
SELECT * FROM students WHERE iq > ANY (SELECT iq FROM students WHERE batch_id = 2);
SELECT * FROM students WHERE iq = ANY (SELECT iq FROM students WHERE batch_id = 2);
-- Find all the students where the iq is greater than the avg iq of their batch
-- batch id 2
SELECT * FROM students s1 WHERE iq > (SELECT AVG(iq) FROM students s2 WHERE s1.batch_id=s2.batch.id);
-- Find all the students where the iq is greater than the avg iq of their batch
SELECT * FROM students s1 WHERE iq < (SELECT AVG(iq) FROM students s2 WHERE s1.batch_id=s2.batch_id);
-- Exists
-- Get all the students who are a part of batch which has other students 
SELECT * FROM students s1 WHERE EXISTS (SELECT * FROM students s2 WHERE s1.batch_id = s2.batch_id AND s2.id <> s1.id);
-- UNION
SELECT * FROM students WHERE batch_id = 1 UNION SELECT * FROM students WHERE batch_id = 2;
SELECT id, first_name FROM students UNION SELECT id, name FROM batches;

-- Indexes
EXPLAIN ANALYZE SELECT * FROM students WHERE id = 1;
EXPLAIN SELECT * FROM students WHERE first_name = 'A' AND last_name = 'B';
EXPLAIN ANALYZE SELECT * FROM students WHERE batch_id = 1;
EXPLAIN ANALYZE SELECT * FROM students WHERE email = 'darth@empire.blr';
CREATE INDEX idx_students_email ON students(email);
CREATE INDEX idx_students_first_last_name ON students(first_name, last_name);
-- FORMAT FOR CREATING INDEX
-- CREATE INDEX <INDEX_NAME> ON TABLE_NAME (COLUMN_NAME,...)

-- TRANSACTIONS
-- Create Index <INDEX_NAME> on Table_Name (Column_Name..)
set autocommit = 0;
BEGIN;
-- OR START TRANSATION;
UPDATE students SET IQ = 100;
SELECT * FROM students;
ROLLBACK;

SELECT * FROM students;
BEGIN;
Update students SET IQ = 100 WHERE ID = 8;
SELECT * FROM students;
ROLLBACK;
COMMIT;

SHOW VARIABLES LIKE '%isolation%';
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;
