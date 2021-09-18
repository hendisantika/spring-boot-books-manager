INSERT INTO books (book_id, author, year, description, title)
VALUES (1000, 'J. K. Rowling', '1997-01-01 00:00:00',
        'Harry Potter and the Philosopher''s Stone is a fantasy novel written by British author J. K. Rowling. The first novel in the Harry Potter series and Rowling''s debut novel, it follows Harry Potter, a young wizard who discovers his magical heritage on his eleventh birthday, when he receives a letter of acceptance to Hogwarts School of Witchcraft and Wizardry. Harry makes close friends and a few enemies during his first year at the school, and with the help of his friends, Harry faces an attempted comeback by the dark wizard Lord Voldemort, who killed Harry''s parents, but failed to kill Harry when he was just 15 months old.',
        'Harry Potter and the Philosopher''s Stone'),
       (1001, 'J. K. Rowling', '1998-01-01 00:00:00',
        'Harry Potter and the Chamber of Secrets is a fantasy novel written by British author J. K. Rowling and the second novel in the Harry Potter series. The plot follows Harry''s second year at Hogwarts School of Witchcraft and Wizardry, during which a series of messages on the walls of the school''s  corridors warn that the "Chamber of Secrets" has been opened and that the "heir of Slytherin" would kill all pupils who do not come from all-magical families. These threats are found after attacks which leave residents of the school petrified. Throughout the year, Harry and his friends Ron and Hermione investigate the attacks.',
        'Harry Potter and the Chamber of Secrets'),
       (1002, 'J. K. Rowling', '1999-01-01 00:00:00',
        'Harry Potter and the Prisoner of Azkaban is a fantasy novel written by British author J. K. Rowling and the third in the Harry Potter series. The book follows Harry Potter, a young wizard, in his third year at Hogwarts School of Witchcraft and Wizardry. Along with friends Ronald Weasley and Hermione Granger, Harry investigates Sirius Black, an escaped prisoner from Azkaban who they believe is one of Lord Voldemort''s old allies.',
        'Harry Potter and the Prisoner of Azkaban'),
       (1003, 'J. K. Rowling', '2000-01-01 00:00:00',
        'Harry Potter and the Goblet of Fire is a fantasy book written by British author J. K. Rowling and the fourth novel in the Harry Potter series. It follows Harry Potter, a wizard in his fourth year at Hogwarts School of Witchcraft and Wizardry and the mystery surrounding the entry of Harry''s name into the Triwizard Tournament, in which he is forced to compete.',
        'Harry Potter and the Goblet of Fire'),
       (1004, 'J. K. Rowling', '2003-01-01 00:00:00',
        'Harry Potter and the Order of the Phoenix is a fantasy novel written by British author J. K. Rowling and the fifth novel in the Harry Potter series. It follows Harry Potter''s struggles through his fifth year at Hogwarts School of Witchcraft and Wizardry, including the surreptitious return of the antagonist Lord Voldemort, O.W.L. exams, and an obstructive Ministry of Magic.',
        'Harry Potter and the Order of the Phoenix'),
       (1005, 'J. K. Rowling', '2005-01-01 00:00:00',
        'Harry Potter and the Half-Blood Prince is a fantasy novel written by British author J. K. Rowling and the sixth and penultimate novel in the Harry Potter series. Set during protagonist Harry Potter''s sixth year at Hogwarts, the novel explores the past of Harry''s nemesis, Lord Voldemort, and Harry''s preparations for the final battle against Voldemort alongside his headmaster and mentor Albus Dumbledore.',
        'Harry Potter and the Half-Blood Prince'),
       (1006, 'J. K. Rowling', '2007-01-01 00:00:00',
        'Following Albus Dumbledore''s death, Voldemort consolidates his support and power, including covert control of the Ministry of Magic, while Harry is about to turn seventeen, losing the protection of his home. The Order of the Phoenix move Harry to a new location before his birthday, but are attacked upon departure. In the ensuing battle, "Mad-Eye" Moody is killed and George Weasley wounded; Voldemort himself arrives to kill Harry, but Harry''s wand fends him off of its own accord. Harry, Ron and Hermione make preparations to abandon Hogwarts and hunt down Voldemort''s four remaining Horcruxes, but have few clues to work with as to their identities and locations.',
        'Harry Potter and the Deathly Hallows'),
       (1007, 'Andy Weir', '2011-01-01 00:00:00',
        'The Martian is a 2011 science fiction novel written by Andy Weir. It was his debut novel under his own name.[a] It was originally self-published in 2011; Crown Publishing purchased the rights and re-released it in 2014. The story follows an American astronaut, Mark Watney, as he becomes stranded alone on Mars in the year 2035 and must improvise in order to survive',
        'The Martian'),
       (1008, 'Michael Crichton', '1990-01-01 00:00:00',
        'Jurassic Park is a 1990 science fiction novel written by Michael Crichton, divided into seven sections (iterations). A cautionary tale about genetic engineering, it presents the collapse of an amusement park showcasing genetically recreated dinosaurs to illustrate the mathematical concept of chaos theory and its real world implications. ',
        'Jurassic Park'),
       (1009, 'Robert C. Martin', '2008-01-01 00:00:00',
        'Even bad code can function. But if code isn’t clean, it can bring a development organization to its knees. Every year, countless hours and significant resources are lost because of poorly written code. But it doesn’t have to be that way. Noted software expert Robert C. Martin presents a revolutionary paradigm with Clean Code: A Handbook of Agile Software Craftsmanship ',
        'Clean Code'),
       (1010, 'Robert C. Martin', '2017-01-01 00:00:00',
        'By applying universal rules of software architecture, you can dramatically improve developer productivity throughout the life of any software system. Now, building upon the success of his best-selling books Clean Code and The Clean Coder, legendary software craftsman Robert C. Martin (“Uncle Bob”) reveals those rules and helps you apply them.',
        'Clean Architecture');


INSERT INTO categories (cat_id, name)
VALUES (1000, 'Fantasy'),
       (1001, 'Science Fiction'),
       (1002, 'Drama'),
       (1003, 'Coming of Age'),
       (1004, 'Computer Science');


INSERT INTO book_category (book_id, category_id)
VALUES (1000, '1000'),
       (1000, '1002'),
       (1000, '1003'),
       (1001, '1000'),
       (1001, '1002'),
       (1001, '1003'),
       (1002, '1000'),
       (1002, '1002'),
       (1002, '1003'),
       (1003, '1000'),
       (1003, '1002'),
       (1003, '1003'),
       (1004, '1000'),
       (1004, '1002'),
       (1004, '1003'),
       (1005, '1000'),
       (1005, '1002'),
       (1005, '1003'),
       (1006, '1000'),
       (1006, '1002'),
       (1006, '1003'),
       (1007, '1002'),
       (1007, '1001'),
       (1008, '1001'),
       (1009, '1004'),
       (1010, '1004');

SELECT *
FROM books;
SELECT *
FROM categories;
