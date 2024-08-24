package org.makersharks.suppliersassignment.repositories;


import org.makersharks.suppliersassignment.models.ManufacturingProcess;
import org.makersharks.suppliersassignment.models.NatureOfBusiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.makersharks.suppliersassignment.entities.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
        String location, NatureOfBusiness natureOfBusiness, List<ManufacturingProcess> manufacturingProcesses, Pageable pageable);
}