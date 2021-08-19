package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProcessStringService {

    public List<Integer> getCodeOfString(String string){
        List<Integer> codes = new ArrayList<>();
        int len = string.length();
        for (int i = 0; i < len; i++){
            codes.add((int) string.charAt(len - i - 1));
        }
        return codes;
    }

}
