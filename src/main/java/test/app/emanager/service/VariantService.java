package test.app.emanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.app.emanager.model.Variant;
import test.app.emanager.repo.VariantRepo;

@Service
public class VariantService {

    @Autowired
    private VariantRepo variantRepo;


    public Variant save(Variant variant) {
        return variantRepo.save(variant);
    }

}
