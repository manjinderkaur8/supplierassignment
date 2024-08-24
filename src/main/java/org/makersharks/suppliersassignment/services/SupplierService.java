package org.makersharks.suppliersassignment.services;


import org.makersharks.suppliersassignment.models.ManufacturingProcess;
import org.makersharks.suppliersassignment.models.NatureOfBusiness;
import org.makersharks.suppliersassignment.entities.Supplier;
import org.makersharks.suppliersassignment.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> findSuppliers(String location, NatureOfBusiness natureOfBusiness, List<ManufacturingProcess> manufacturingProcesses, int page, int size) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(location, natureOfBusiness, manufacturingProcesses, PageRequest.of(page, size));
    }
}