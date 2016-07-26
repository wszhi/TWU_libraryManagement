CREATE TABLE bookInfo (
  bookId VARCHAR(32) NOT NULL,
  bookName VARCHAR(100) NOT NULL,
  bookAuthor VARCHAR(30) NOT NULL,
  bookImage VARCHAR(1000) DEFAULT NULL,
  bookPublish TIMESTAMP NOT NULL,
  bookIntroduce VARCHAR(4000) DEFAULT NULL,
  PRIMARY KEY (bookId)
)