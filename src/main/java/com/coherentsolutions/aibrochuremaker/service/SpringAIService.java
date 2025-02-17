package com.coherentsolutions.aibrochuremaker.service;

import com.coherentsolutions.aibrochuremaker.model.BrochureRequest;
import com.coherentsolutions.aibrochuremaker.model.Website;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class SpringAIService {

    private final ChatModel chatModel;

    @Value("classpath:templates/link-prompt-template.st")
    private Resource linkPromptTemplate;

    @Value("classpath:templates/brochure_system_prompt.st")
    private Resource systemPromptTemplate;

    @Value("classpath:templates/brochure_user_prompt.st")
    private Resource userPromptTemplate;

    public SpringAIService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    private String loadTemplate(Resource template) throws IOException {
        // TODO: Load the template file content as a String
        return "";
    }

    public String generateLinksPrompt(Website website) {
        try {
            // TODO: Load link prompt template
            String template = "";
            // TODO: Convert list of links to a single string
            String links = "";
            // TODO: Replace placeholders with actual values in the template
            return "";
        } catch (IOException e) {
            throw new RuntimeException("Failed to load or process the link prompt template", e);
        }
    }

    public String getRelevantLinks(String prompt) {
        // TODO: Create a PromptTemplate using the prompt
        PromptTemplate promptTemplate = new PromptTemplate("");
        Prompt chatPrompt = promptTemplate.create(Map.of());
        ChatResponse response = chatModel.call(chatPrompt);

        // TODO: Extract and return the response content as JSON
        return "";
    }

    public String generateBrochure(BrochureRequest request) {
        try {
            // TODO: Load system and user prompt templates
            String systemPrompt = "";
            String userPrompt = "";

            // TODO: Replace placeholders with actual company details
            String fullPrompt = "";

            // TODO: Create and send the chat request
            PromptTemplate promptTemplate = new PromptTemplate(fullPrompt);
            Prompt prompt = promptTemplate.create(Map.of());
            ChatResponse response = chatModel.call(prompt);

            // TODO: Extract and return the response content as a generated brochure
            return "";
        } catch (IOException e) {
            throw new RuntimeException("Failed to load template", e);
        }
    }
}

