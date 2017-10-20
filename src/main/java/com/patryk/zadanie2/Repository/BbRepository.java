package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.Bb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BbRepository extends JpaRepository<Bb, Long>{
}
