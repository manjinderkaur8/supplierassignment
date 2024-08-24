INSERT INTO supplier (company_name, website, location, nature_of_business) VALUES
('Company A', 'https://companyA.com', 'India', 'SMALL_SCALE'),
('Company B', 'https://companyB.com', 'India', 'MEDIUM_SCALE'),
('Company C', 'https://companyC.com', 'USA', 'LARGE_SCALE');

INSERT INTO supplier_manufacturing_processes (supplier_id, manufacturing_process) VALUES
(1, 'D_PRINTING'),
(1, 'MOULDING'),
(2, 'CASTING'),
(3, 'COATING');
