package com.example.demo;




import java.util.HashMap; 
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Map<String, String> questionAnswerMap = new HashMap<>();
    public Controller() {
        questionAnswerMap.put("What is the color of Carrot", "Orange");
        questionAnswerMap.put("What is the capital of France?", "The capital of France is Paris.");
        questionAnswerMap.put("What comes after the number9?", "Number 10");
        questionAnswerMap.put("What color starts with the color G?", "Green");
        questionAnswerMap.put("During which festival does santa comes to visit?", "christmas");
        questionAnswerMap.put("What is the color of the teeth?", "White");
        questionAnswerMap.put("How many fingers do you have in one hand?", "10");
        questionAnswerMap.put("What is the color of your bugatti?", "Black");
        questionAnswerMap.put("What comes after the number9?", "Number 10");
        questionAnswerMap.put("What do you drink that comes from the cow?", "Milk");
        questionAnswerMap.put("What part of the body lets you see?", "Eyes");
        questionAnswerMap.put("What is the color of the leaf?", "Green");
        
        // Add more question-answer mappings here
    }

    @GetMapping("/ask")
    public String askQuestion(@RequestParam("question") String question) {
        String answer = questionAnswerMap.getOrDefault(question, "I don't have an answer to that question.");
        return "Your question: " + question + "\nAnswer: " + answer;
    }
}


