package test.app.emanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import test.app.emanager.model.Variant;

public interface VariantRepo extends JpaRepository<Variant, Long> {



}
