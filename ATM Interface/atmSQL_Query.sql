create database bankmanagementsystem;

create table bankmanagementsystem.signup (
    formno VARCHAR(255) DEFAULT '1459',
    name VARCHAR(255),
    fname VARCHAR(255),
    dob VARCHAR(50),
    gender VARCHAR(10),
    email VARCHAR(255),
    marital VARCHAR(20),
    address VARCHAR(255),
    city VARCHAR(50),
    pin VARCHAR(10),
    state VARCHAR(50)
);

CREATE TABLE bankmanagementsystem.signuptwo (
    formno VARCHAR(255) DEFAULT '1459',
    sreligion VARCHAR(255),
    scategory VARCHAR(255),
    sIncome VARCHAR(255),
    sEducation VARCHAR(255),
    soccupation VARCHAR(255),
    span VARCHAR(255),
    sadhar VARCHAR(255),
    sYes VARCHAR(255),
    eYes VARCHAR(255)
);

CREATE TABLE bankmanagementsystem.signupthree (
    formno VARCHAR(255) DEFAULT '1459',
    accountType VARCHAR(255),
    cardNumber VARCHAR(255),
    pinNumber VARCHAR(255),
    facility VARCHAR(255)
);

CREATE TABLE bankmanagementsystem.login (
    formno VARCHAR(255) DEFAULT '1459',
    cardNumber VARCHAR(255),
    pinNumber VARCHAR(255)
);

CREATE TABLE bankmanagementsystem.bank (
    pinnumber VARCHAR(255),
    date VARCHAR(50),
    transaction_type VARCHAR(255),
    number INT
);


drop table bankmanagementsystem.bank;
select * from bankmanagementsystem.bank;
select * from bankmanagementsystem.bank where pinnumber=6358;
select * from bankmanagementsystem.login;

