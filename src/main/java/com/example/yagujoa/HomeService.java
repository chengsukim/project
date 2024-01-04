package com.example.yagujoa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {
    private final HomeRepository homeRepository;

    public List<Home> getList() {
        return this.homeRepository.findAll();
    }
}
