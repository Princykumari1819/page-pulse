# Page Pulse

Page Pulse is a simple web application built using Spring Boot that analyzes any webpage and generates a basic SEO report. It accepts a website URL, fetches the page, extracts useful information, and displays the results in a clean interface.

---

## Features

- Analyze any valid website URL
- Display HTTP status code
- Measure page response time
- Extract page title
- Extract meta description
- Count H1 headings
- Count total images
- Count images without alt text
- Calculate approximate word count
- Handle invalid URLs and errors gracefully

---

## Technologies Used

- Java
- Spring Boot
- Jsoup
- HTML
- CSS
- JavaScript
- Maven
- JUnit 5

---

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Reload Maven dependencies if required.
4. Run `PagePulseApplication.java`.
5. Open your browser and visit:

```
http://localhost:8080
```

6. Enter a website URL and click **Analyze**.

---

## API

### Endpoint

```
GET /analyze
```

### Example Request

```
http://localhost:8080/analyze?url=https://example.com
```

### Sample Response

```json
{
  "status": 200,
  "responseTime": 527,
  "title": "Example Domain",
  "metaDescription": "No meta description found",
  "h1Count": 1,
  "imageCount": 0,
  "altTextCount": 0,
  "wordCount": 19
}
```

---

## Error Handling

The application handles:

- Invalid URLs
- Connection failures
- Request timeouts
- Unexpected errors

Instead of crashing, the application returns a simple and meaningful response.

---

## Design Decisions

### 1. Spring Boot

I used Spring Boot because it makes building REST APIs simple and keeps the project organized.

### 2. Jsoup

I chose Jsoup because it provides an easy way to fetch webpages and extract HTML elements such as the title, meta description, headings, images, and page text.

### 3. Simple User Interface

I kept the frontend simple so that users can quickly enter a URL and view the report without unnecessary complexity.

---

## Testing

The project includes basic JUnit tests for:

- Successful page analysis
- Invalid URL handling
- Failure scenario

---

## AI Usage

I used ChatGPT as a learning and debugging assistant while building this project. It helped me understand Spring Boot concepts, troubleshoot errors, and understand how to implement different parts of the application whenever I got stuck. I tested the application myself, verified the outputs, and made the final decisions on how the project should work.

---

## Future Improvements

If I had more time, I would like to:

- Improve the UI design
- Add more SEO checks
- Show SEO improvement suggestions
- Export reports as PDF
- Add more unit tests

---

## Author
Princy Kumari