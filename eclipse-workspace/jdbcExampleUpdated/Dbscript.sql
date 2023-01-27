CREATE TABLE Course (
    name varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    CONSTRAINT PK_Course PRIMARY KEY (name)
);

CREATE TABLE GPA (
    lettergrade varchar(255) NOT NULL,
    GPAValue varchar(255) NOT NULL,
    CONSTRAINT PK_GPA PRIMARY KEY (lettergrade)
);
CREATE TABLE USER (
    userid varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    CONSTRAINT PK_user PRIMARY KEY (userid)
);