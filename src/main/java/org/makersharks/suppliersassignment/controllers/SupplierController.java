package org.makersharks.suppliersassignment.controllers;

import org.makersharks.suppliersassignment.entities.Supplier;
import org.makersharks.suppliersassignment.models.ManufacturingProcess;
import org.makersharks.suppliersassignment.models.NatureOfBusiness;
import org.makersharks.suppliersassignment.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<Page<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam NatureOfBusiness natureOfBusiness,
            @RequestParam List<ManufacturingProcess> manufacturingProcesses,
            @RequestParam int page,
            @RequestParam int size) {

        Page<Supplier> suppliers = supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcesses, page, size);
        return ResponseEntity.ok(suppliers);
    }
}