package com.springboot.food.service;

import com.springboot.food.io.FoodRequest;
import com.springboot.food.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FoodService {
    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);

    List<FoodResponse> readFoods();

    FoodResponse readFoods(String id);

    boolean deleteFile(String fileName);

    void deleteFood(String id);
}
