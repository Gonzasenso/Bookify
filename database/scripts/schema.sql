/* BOOKIFY DATABASE
Author: Gonzalo Asenso
Version: 1.0
*/
DROP DATABASE IF EXISTS bookify;

create database bookify
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE bookify;


CREATE TABLE role(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(255)
);

CREATE TABLE users(
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    active BOOLEAN NOT NULL,
    created_at TIMESTAMP NOT NULL,
    role_id INT NOT NULL,
    FOREIGN KEY(role_id) REFERENCES role(id)
);

CREATE TABLE employee(
    user_id INT PRIMARY KEY,
    hire_date DATE NOT NULL,
    specialty VARCHAR(100) NOT NULL,
    active BOOLEAN NOT NULL,
    FOREIGN KEY(user_id) REFERENCES users(id)
);

CREATE TABLE business(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(255) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    address VARCHAR(100) NOT NULL,
    logo_url VARCHAR(150) NOT NULL,
    active BOOLEAN NOT NULL,
    created_at TIMESTAMP NOT NULL,
    employee_id INT NOT NULL,
    FOREIGN KEY(employee_id) REFERENCES employee(user_id)
);

CREATE TABLE service(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(255) NOT NULL,
    estimated_duration TIME NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    active BOOLEAN NOT NULL,
    created_at TIMESTAMP NOT NULL,
    business_id INT NOT NULL,
    FOREIGN KEY(business_id) REFERENCES business(id)
);

CREATE TABLE appointment(
    id INT PRIMARY KEY AUTO_INCREMENT,
    appointment_date DATE NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    status VARCHAR(50) NOT NULL,
    notes VARCHAR(255),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    client_id INT NOT NULL,
    FOREIGN KEY(client_id) REFERENCES users(id),
    employee_id INT NOT NULL,
    FOREIGN KEY(employee_id) REFERENCES employee(user_id)
);

CREATE TABLE appointment_service(
    id INT PRIMARY KEY AUTO_INCREMENT,
    appointment_id INT NOT NULL,
    FOREIGN KEY(appointment_id) REFERENCES appointment(id),
    service_id INT NOT NULL,
    FOREIGN KEY(service_id) REFERENCES service(id),
    price DECIMAL(10,2) NOT NULL,
    quantity INT NOT NULL
);

CREATE TABLE business_hours(
    id INT PRIMARY KEY AUTO_INCREMENT,
    day_of_week TINYINT NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    is_open BOOLEAN NOT NULL,
    business_id INT NOT NULL,
    FOREIGN KEY(business_id) REFERENCES business(id)
);