package com.patryk.zadanie2.Repository;

import com.patryk.zadanie2.Model.C;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Collection;

@Repository
public interface CRepository extends JpaRepository<C, Long> {

    //5-b-i
    @Query(value = "SELECT COUNT(c.name) FROM C c", nativeQuery = true)
    int ile();

    //5-b-ii
    //em

    //5-c-i
    @Query(value = "SELECT COUNT(c.name) FROM C c WHERE c.name='ASDF'", nativeQuery = true)
    int ile2();

    //5-c-ii
    //@Query("SELECT COUNT(c.name) FROM C c WHERE c.name='ASDF'")
    //Collection<C> col();

    //5-c-iii
    Collection<C> findByName(String name);

}
