CREATE TABLE IF NOT EXISTS students (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(50) NOT NULL,age INT)ENGINE=INNODB;

INSERT INTO students (name, age)VALUES ('John Doe', 20);
INSERT INTO students (name, age)VALUES ('Halkano Malise', 24);
INSERT INTO students (name, age)VALUES ('Susan Watiri', 40);
INSERT INTO students (name, age)VALUES ('Amina Abdi', 35);


INSERT INTO students (name, age)VALUES (?, ?);

SELECT * FROM students;
