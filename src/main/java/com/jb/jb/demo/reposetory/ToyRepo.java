package com.jb.jb.demo.reposetory;

import com.jb.jb.demo.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepo extends JpaRepository <Toy, Integer>{
}
