package gr.aueb.cf.teacherapp.repository;

import gr.aueb.cf.teacherapp.model.static_data.Region;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegionRepository extends JpaRepository<Region, Long>, JpaSpecificationExecutor<Region>{
}
