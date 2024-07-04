package com.roy.raj.Learning.Spring.exercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class MySqlService implements DataService{
    public int[] retrieveData() {
        return new int[] {5 , 4, 6 , 3};
    }

    public int find_maxi() {
        int arr[] = {5 , 4, 6 , 3};
        int maxi = arr[0];
        for(int ele : arr) maxi = Math.max(maxi, ele);
        return maxi;
    }
}
