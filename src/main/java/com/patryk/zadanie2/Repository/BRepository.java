package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.B;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRepository extends JpaRepository<B, Long> {
}
