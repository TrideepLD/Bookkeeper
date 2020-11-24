CREATE TABLE BOOK_TAGS (
    isbn_13 varchar (13),
    tag_name varchar (255),
    PRIMARY KEY (isbn_13),
    PRIMARY KEY (tag_name),
    FOREIGN KEY (isbn_13) REFERENCES books(isbn_13)
); 

SELECT isbn_13, tag_name
FROM BOOK_TAGS
INNER JOIN books