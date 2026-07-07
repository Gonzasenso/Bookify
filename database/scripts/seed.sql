USE bookify;

DELETE FROM appointment_service;
DELETE FROM appointment;
DELETE FROM business_hours;
DELETE FROM service;
DELETE FROM business;
DELETE FROM employee;
DELETE FROM users;
DELETE FROM role;

/* Roles */
INSERT INTO role(name, description)
VALUES 
('ADMIN', 'System administrator'), 
('EMPLOYEE', 'Business employee'), 
('CLIENT', 'Customer');

/* Usuario administrador */
INSERT INTO users(first_name, last_name, email, password, phone, active, created_at, role_id)
VALUES
/* Temporary password. Later this will be stored using BCrypt. */
('Alex', 'Morgan', 'admin@aurastudio.com', '123456', '1122334455', TRUE, NOW(), 1),
('Emma', 'Carter', 'emma@aurastudio.com', '654321', '1132456789', TRUE, NOW(), 2),
('John', 'Doe', 'john@email.com', '334455', '2233445566', TRUE, NOW(), 3);

/* Empleado */
INSERT INTO employee(user_id, hire_date, specialty, active)
VALUES
(1, CURRENT_DATE(), 'Senior Stylist', TRUE),
(2, CURRENT_DATE(), 'Color Specialist', TRUE);

/* Negocio */
INSERT INTO business(name, description, phone, email, address, logo_url, active, created_at, employee_id)
VALUES
('Aura Studio', 'Modern beauty and grooming studio.', '+54 9 11 4567-8901', 'contact@aurastudio.com', 'Buenos Aires, Argentina', 'logo.png', TRUE, NOW(), 1);

/* Servicios */
INSERT INTO service(name, description, estimated_duration, price, active, created_at, business_id)
VALUES
('Classic Haircut', 'Traditional haircut.', '00:45:00', 12000.00, TRUE, NOW(), 1),
('Fade Cut', 'Modern fade haircut', '01:00:00', 15000.00, TRUE, NOW(), 1),
('Beard Styling', 'Professional beard shaping.', '00:30:00', 7000.00, TRUE, NOW(), 1),
('Hair Wash', 'Hair wash and massage.', '00:20:00', 4000.00, TRUE, NOW(), 1),
('Premium Experience', 'Haircut + Beard + Hair Wash.', '01:30:00', 22000.00, TRUE, NOW(), 1);

/* Horarios */
INSERT INTO business_hours(day_of_week, start_time, end_time, is_open, business_id)
VALUES
(1, '09:00:00', '18:00:00', TRUE, 1),
(2, '09:00:00', '18:00:00', TRUE, 1),
(3, '09:00:00', '18:00:00', TRUE, 1),
(4, '09:00:00', '18:00:00', TRUE, 1),
(5, '09:00:00', '18:00:00', TRUE, 1),
(6, '09:00:00', '16:00:00', TRUE, 1),
(7, '00:00:00', '00:00:00', FALSE, 1);

/* day_of_week
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday
*/