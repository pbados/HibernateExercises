package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.A;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ARepository extends JpaRepository<A, Long> {
}
