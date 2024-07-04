package com.roy.raj.Learning.Spring.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbService implements DataService{
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
    public int find_maxi() {
        int arr[] = {1 , 2 , 3, 4 , 5};
        int maxi = arr[0];
        for(int ele : arr) maxi = Math.max(maxi, ele);
        return maxi;
    }
}
