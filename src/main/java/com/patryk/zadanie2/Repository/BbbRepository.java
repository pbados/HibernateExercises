package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.Bbb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BbbRepository extends JpaRepository<Bbb, Long> {
}
