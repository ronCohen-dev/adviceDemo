package com.jb.jb.demo.clr;

import com.jb.jb.demo.beans.Cat;
import com.jb.jb.demo.beans.Color;
import com.jb.jb.demo.beans.Toy;
import com.jb.jb.demo.reposetory.CatRepo;
import com.jb.jb.demo.reposetory.ToyRepo;
import com.jb.jb.demo.util.Art;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Order(1)
public class BootStrap implements CommandLineRunner {

    private final CatRepo catRepo;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(Art.bootStrap);

        System.out.println(Art.init);

//        Toy t1 = Toy.builder()
//                .name("ball").build();
//        Toy t2 = Toy.builder()
//                .name("mouse").build();
//        List<Toy> l1 = new ArrayList<>();
//        l1.add(t1);
//        l1.add(t2);
//        Cat c1 = new Cat("Mizi",3.5f,l1,Color.BLUE);
//
//        Toy t3 = Toy.builder()
//                .name("tanis ball").build();
//        Toy t4 = Toy.builder()
//                .name("basketball").build();
//        List<Toy> l2 = new ArrayList<>();
//        l2.add(t3);
//        l2.add(t4);
//        Cat c2 = new Cat("Moli",5.5f,l2,Color.BLACK);
//
//        catRepo.save(c1);
//        catRepo.save(c2);


    }
}
