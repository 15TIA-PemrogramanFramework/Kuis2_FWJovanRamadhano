/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.Kuis_1040.repo;

import com.setia.Kuis_1040.entity.IPK;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface IPKRepo extends CrudRepository<IPK, Long> {

    @Query("select c from IPK c")
    public List<IPK> findAllIPK();
}
