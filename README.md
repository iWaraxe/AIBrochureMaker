# AI Webcrawler - Core Project

## Overview
This project serves as the foundation for your implementation of an AI-powered web crawler. The goal is to develop a system that fetches relevant links from a given website, extracts information, and generates a brochure using AI. The core project includes predefined structures and TODOs that guide you in implementing the necessary functionality.

## Learning Objectives
- Implement web scraping using **JSoup**.
- Process and filter extracted links.
- Manage and structure HTTP requests in a **Spring Boot** application.
- Handle JSON responses effectively.
- Work with templates for structured prompt generation.

## Project Setup
### Prerequisites
- **Java 21**
- **Maven**
- **Spring Boot 3**
- **JSoup (for web scraping)**
- (Optional) Any IDE like IntelliJ IDEA

### Installation Steps
1. Clone the repository:
2. Navigate to the project folder.


## Tasks
### 1. Implement Web Scraping
- Complete the `Website` class by implementing the `fromUrl(String url)` method.
- Ensure **JSoup** is used to extract relevant data from the web pages.

### 2. Process Links
- Implement `DetailFetcherService` to fetch detailed content from relevant links.
- Ensure irrelevant links such as privacy policies are filtered out.

### 3. Generate a Brochure
- Implement `SpringAIService` (or a similar service) to structure AI prompts.
- Work with **text-based templates** to dynamically generate AI input.

### 4. Build the API Endpoints
- Implement `WebCrawlerController` methods:
    - `/getRelevantLinks`: Processes the links extracted from the website.
    - `/generateBrochure`: Uses AI-generated content to create a brochure.

### 5. Work with Templates
- Implement proper **prompt templates** stored in `resources/templates/`.
- Ensure they are dynamically populated with website data.

## Expected Output
Once completed, the system should:
- Accept a URL via API request.
- Extract relevant links and page content.
- Filter out irrelevant data.
- Generate a **Markdown-formatted** company brochure.

## Submission Guidelines
- Push your changes to a **new branch** in your repository.
- Open a **Pull Request (PR)** for review.
- Ensure your code follows proper **Java best practices**.
- Submit a link to your repository for evaluation.

Happy coding! 🚀

