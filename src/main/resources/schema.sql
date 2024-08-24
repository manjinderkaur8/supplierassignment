CREATE TABLE supplier (
    supplier_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(255),
    website VARCHAR(255),
    location VARCHAR(255),
    nature_of_business VARCHAR(255)
);

CREATE TABLE supplier_manufacturing_processes (
    supplier_id BIGINT,
    manufacturing_process VARCHAR(255),
    FOREIGN KEY (supplier_id) REFERENCES supplier(supplier_id)
);
