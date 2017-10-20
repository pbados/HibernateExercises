package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.D;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DRepository extends JpaRepository<D, Long> {
}
