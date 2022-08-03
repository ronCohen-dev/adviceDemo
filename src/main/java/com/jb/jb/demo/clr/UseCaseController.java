package com.jb.jb.demo.clr;

import com.jb.jb.demo.beans.Cat;
import com.jb.jb.demo.beans.Color;
import com.jb.jb.demo.beans.ListCats;
import com.jb.jb.demo.beans.Toy;
import com.jb.jb.demo.util.Art;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.management.loading.ClassLoaderRepository;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class UseCaseController implements CommandLineRunner {

    private final RestTemplate restTemplate;

    private static final String Url = "http://localhost:8080/cats";

    @Override
    public void run(String... args) throws Exception {
        System.out.println(Art.controller);

        System.out.println("adding cat");

        Toy t1 = Toy.builder()
                .name("ball").build();
        Toy t2 = Toy.builder()
                .name("mouse").build();
        List<Toy> l1 = new ArrayList<>();
        l1.add(t1);
        l1.add(t2);
        Cat c1 = new Cat("Shimi",7.5f,l1, Color.BLUE);

      ResponseEntity<String> res = restTemplate.postForEntity(Url, c1 , String.class);
        System.out.println(res.getStatusCode().value()==201);

        System.out.println("getting all cats");

        restTemplate.getForObject(Url, ListCats.class).getCats().forEach(System.out::println);

    }
}
