package com.mthree.StudentDB.repository;

import com.mthree.StudentDB.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/*
JpaRepository supplies us with the CRUD operations
*/

public interface StudentRepository extends JpaRepository<Student, Long> {
}
