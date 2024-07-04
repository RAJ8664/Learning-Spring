package com.roy.raj.Learning.Spring.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
    int find_maxi();
}
