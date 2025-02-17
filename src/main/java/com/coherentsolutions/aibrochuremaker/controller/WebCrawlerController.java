package com.coherentsolutions.aibrochuremaker.controller;

import com.coherentsolutions.aibrochuremaker.model.UrlRequest;
import com.coherentsolutions.aibrochuremaker.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WebCrawlerController {

    private final SpringAIService springAIService;
    private final DetailFetcherService detailFetcherService;

    public WebCrawlerController(SpringAIService springAIService,
                                DetailFetcherService detailFetcherService) {
        this.springAIService = springAIService;
        this.detailFetcherService = detailFetcherService;
    }

    @PostMapping("/getRelevantLinks")
    public ResponseEntity<String> getRelevantLinks(@RequestBody String url) {
        try {
            // TODO: Create Website instance from URL
            // TODO: Generate prompt using SpringAIService
            // TODO: Get relevant links from SpringAIService
            // TODO: Return the JSON response
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error processing request: " + e.getMessage());
        }
    }

    @PostMapping("/generateBrochure")
    public ResponseEntity<String> generateBrochure(@RequestBody UrlRequest urlRequest) {
        try {
            // TODO: Create Website instance from URL
            // TODO: Generate prompt using SpringAIService
            // TODO: Get relevant links from SpringAIService
            // TODO: Fetch detailed content for all relevant links
            // TODO: Generate brochure using the content with SpringAIService
            // TODO: Return the generated brochure
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error generating brochure: " + e.getMessage());
        }
    }
}