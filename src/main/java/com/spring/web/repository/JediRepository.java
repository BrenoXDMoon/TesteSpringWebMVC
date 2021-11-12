package com.spring.web.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.web.model.Jedi;
import org.springframework.stereotype.Repository;

@Repository
public interface JediRepository extends JpaRepository<Long, Jedi> {
}
