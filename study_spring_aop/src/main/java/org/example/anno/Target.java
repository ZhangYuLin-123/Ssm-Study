package org.example.anno;

import org.springframework.stereotype.Component;

@Component
public class Target implements TargetInterface {

    public void save() {
        System.out.println("saving......");
    }
}
