CREATE TABLE AUTHOR (
     ID BIGINT AUTO_INCREMENT PRIMARY KEY,
     NAME VARCHAR(45) NOT NULL,
     PHONE_NUMBER VARCHAR(45) NOT NULL,
     BIRTH_DATE TIMESTAMP NOT NULL,
     CITY VARCHAR(45) NOT NULL,
     COUNTRY VARCHAR(45) NOT NULL
);

CREATE TABLE BOOK (
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  TITLE VARCHAR(45) NOT NULL,
  ISBN VARCHAR(45) NOT NULL,
  PRICE DOUBLE PRECISION NOT NULL,
  RELEASE_DATE TIMESTAMP NOT NULL,
  AUTHOR_ID BIGINT NOT NULL
);

INSERT INTO AUTHOR(NAME, PHONE_NUMBER, BIRTH_DATE, CITY, COUNTRY) VALUES ('AUTHOR1','0268123456','1975-10-11','Brasov', 'Romania');
INSERT INTO AUTHOR(NAME, PHONE_NUMBER, BIRTH_DATE, CITY, COUNTRY) VALUES ('AUTHOR2','2312312312','1980-09-14','Berlin','Germany');
INSERT INTO AUTHOR(NAME, PHONE_NUMBER, BIRTH_DATE, CITY, COUNTRY) VALUES ('AUTHOR3','0269123456','1983-12-23','Sibiu','Romania');


INSERT INTO BOOK(TITLE, ISBN, PRICE, RELEASE_DATE, AUTHOR_ID) VALUES ('Book 1','1234-ABC',923.55,'2022-12-23',1);
INSERT INTO BOOK(TITLE, ISBN, PRICE, RELEASE_DATE, AUTHOR_ID) VALUES ('Book 2','4123-QSX',11.25,'2022-12-23',2);
INSERT INTO BOOK(TITLE, ISBN, PRICE, RELEASE_DATE, AUTHOR_ID) VALUES ('Book 3','5931-GDS',387.33,'2022-11-30',3);
INSERT INTO BOOK(TITLE, ISBN, PRICE, RELEASE_DATE, AUTHOR_ID) VALUES ('Book 4','4902-BCC',3251.79,'2023-01-04',4);