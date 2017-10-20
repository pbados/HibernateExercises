package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.Aaa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AaaRepository extends JpaRepository<Aaa, Long>{
}
