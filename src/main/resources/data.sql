INSERT INTO patient (name, gender, birth_date, mail, blood_group)
 VALUES
('A1', 'Male', '2004-02-04', 'A1@gmail.com','B_POSITIVE'),
('A2', 'Male', '2006-02-12', 'A2@gmail.com','A_POSITIVE'),
('A3', 'Male', '1977-04-28', 'A3@gmail.com','AB_POSITIVE'),
('A4', 'Female', '1982-08-02', 'A4@gmail.com','O_POSITIVE'),
('A5', 'Female', '1952-06-01', 'A5@gmail.com','O_NEGATIVE');

INSERT INTO doctor(name,specialization,email)
VALUES
('DR.1','Cardiology',"DR1@gmail.com"),
('DR.2','Dermatology',"DR2@gmail.com"),
('Dr.3','Orthopedics','DR3@gmail.com');

INSERT INTO appointment(appointment_time,reason,doctor_id,patient_id)
VALUES
('2025-07-01 10:30:00','General Checkup',1,2),
('2025-07-02 11:00:00','Skin Rash',2,2),
('2025-07-03 09:45:00','Knee Pain',3,3),
('2025-07-04 14:30:00','Follow-up Visit',1,1),
('2025-07-05 16:15:00','Consultation',1,4),
('2025-07-06 08:30:00','Allergy Treatment',2,5);