package com.controller;

import com.domain.CustomizePackage;
import com.exception.BadRequestAlertException;
import com.exception.NotFoundAlertException;
import com.service.CustomizePackageService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomizePackageController {

    private CustomizePackageService customizePackageService;

    public CustomizePackageController(CustomizePackageService customizePackageService){
        this.customizePackageService=customizePackageService;
    }
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


    @PostMapping("/customize-package")
    public ResponseEntity<CustomizePackage> createCustomizePackage(@Valid @RequestBody CustomizePackage customizePackage) throws Exception {
        if (customizePackage.getId() != null) {
            throw new BadRequestAlertException("A new customize package cannot have an id value");
        }
        customizePackageService.insert(customizePackage);
        return ResponseEntity.created(new URI("/customize-package/"))
                .body(customizePackage);
    }

    /*
    @PutMapping("/customize-package")
    public ResponseEntity<CustomizePackage> updateCustomizePackage(@Valid @RequestBody CustomizePackage customizePackage) throws Exception {
        if (customizePackage.getId() == null) {
            throw new BadRequestAlertException("Invalid id");
        }
        customizePackageService.update(customizePackage);
        return ResponseEntity.created(new URI("/customize-package/"))
                .body(customizePackage);
    }

     */

    @GetMapping("/customize-package")
    public ResponseEntity<List<CustomizePackage>> getAllCustomizePackage() {
        List<CustomizePackage> authorities = customizePackageService.getAll();
        return ResponseEntity.ok().body(authorities);
    }

    @GetMapping("/customize-package/{id}")
    public ResponseEntity<CustomizePackage> getCustomizePackage(@PathVariable Long id) {
        Optional<CustomizePackage> customizePackage = Optional.ofNullable(customizePackageService.get(id));
        if (customizePackage.isPresent()) {
            return ResponseEntity.ok().body(customizePackage.get());
        }
        throw new NotFoundAlertException("Record not found [" + id + "]");
    }


    @DeleteMapping("/customize-package/{id}")
    public ResponseEntity<CustomizePackage> deleteCustomizePackage(@PathVariable Long id) {
        customizePackageService.delete(id);
        return ResponseEntity.noContent().build();
    }

     

}
