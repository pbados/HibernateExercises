package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.Aa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AaRepository extends JpaRepository<Aa, Long> {
}
