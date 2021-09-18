CREATE TABLE books
(
    book_id     bigint NOT NULL auto_increment,
    author      varchar(255),
    year        datetime(6),
    description longtext,
    title       varchar(255),
    PRIMARY KEY (book_id)
) engine=InnoDB;

CREATE TABLE book_category
(
    book_id     bigint NOT NULL,
    category_id bigint NOT NULL,
    PRIMARY KEY (book_id, category_id)
) engine=InnoDB;


CREATE TABLE categories
(
    cat_id bigint NOT NULL auto_increment,
    name   varchar(255),
    PRIMARY KEY (cat_id)
) engine=InnoDB;

ALTER TABLE book_category
    ADD CONSTRAINT FKiwvwb2bwuvg0017hh8kg5e8g1
        FOREIGN KEY (category_id)
            REFERENCES categories (cat_id);

ALTER TABLE book_category
    ADD CONSTRAINT FK7k0c5mr0rx89i8jy5ges23jpe
        FOREIGN KEY (book_id)
            REFERENCES books (book_id);


