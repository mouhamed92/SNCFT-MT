package com.sncft.Billetterie.Dao;

import com.sncft.Billetterie.Entity.Gare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200/")
public interface GareRepository extends JpaRepository<Gare,Long> {
}
