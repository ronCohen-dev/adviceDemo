package com.jb.jb.demo.reposetory;

import com.jb.jb.demo.beans.Cat;
import com.jb.jb.demo.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepo extends JpaRepository<Cat, Integer> {

}
