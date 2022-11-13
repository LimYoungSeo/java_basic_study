package org.example.inherit.poly;

import org.example.inherit.IdolDancer;

import java.util.ArrayList;
import java.util.List;

public class performanceTeam {

    private List<Idoldancer> idolDancers = new ArrayList<>();

    //팀원 추가하기
    public void addDancer(IdolDancer dancer) {
        idolDancers.add(dancer);
        System.out.println(dancer = "가 추가됨");


    }
}
