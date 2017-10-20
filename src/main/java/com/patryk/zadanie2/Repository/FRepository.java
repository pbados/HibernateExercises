package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.F;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FRepository extends JpaRepository<F, Long> {
}
