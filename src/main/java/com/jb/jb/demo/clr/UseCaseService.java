package com.jb.jb.demo.clr;

import com.jb.jb.demo.beans.Cat;
import com.jb.jb.demo.beans.Color;
import com.jb.jb.demo.beans.Toy;
import com.jb.jb.demo.service.CatService;
import com.jb.jb.demo.util.Art;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Order(2)
@RequiredArgsConstructor
public class UseCaseService  implements CommandLineRunner{

     private final CatService catService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(Art.service);
//        System.out.println("Add some cat ...");
//
//        Toy t1 = Toy.builder()
//                .name("PC").build();
//        Toy t2 = Toy.builder()
//                .name("XBOX").build();
//        List<Toy> l = new ArrayList<>();
//        l.add(t1);
//        l.add(t2);
//        Cat c3 = new Cat("Mali",30.5f,l, Color.WHITE);
//        catService.addCat(c3);
//        System.out.println("Getting some cat ...");
//        System.out.println(catService.getSpecificCat(3));
//        System.out.println("updating some cat ...");
//        Cat c = new Cat(c3.getId(),"Pali",26.5f,l, Color.WHITE);
//        catService.updateCate(c);
//        System.out.println("Delete some cat ...");
//        System.out.println(catService.removeCat(3));
//        System.out.println("Getting all cats ...");
//        System.out.println(catService.getCats());
    }

}
