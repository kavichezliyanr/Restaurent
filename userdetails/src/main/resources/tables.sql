create table USERDETAIL (
        ID integer not null auto_increment,
        ACTIVE varchar(255) not null,
        GMAILVERIFIED bit not null,
        EMAILID varchar(255),
        FULLNAME varchar(255) not null,
        PASSWORD varchar(255) not null,
        PHONENUMBER varchar(255),
        USERNAME varchar(255) not null,
        VERSION integer not null,
        WHENMODIFIED datetime not null,
        primary key (ID)
    )