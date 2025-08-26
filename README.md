🛒 FakeStore API Integration (Spring Boot + Retrofit)

This project demonstrates how to integrate a third-party REST API (FakeStore API
) into a Spring Boot application using Retrofit.
It provides endpoints to fetch and expose product categories in a structured way.

🔧 Tech Stack

Java 21

Spring Boot 3.5.5

Retrofit2 (HTTP client)

Lombok (for DTOs)

Maven

📂 Project Structure
src/main/java/com/fakestoreapi/FakeStoreAPI
│
├── Controller
│   └── CategoryController.java        # REST controller for categories
│
├── Service
│   └── CategoryService.java           # Service layer
│
├── Gateway
│   └── FakeStoreApi.java              # Retrofit interface for API calls
│
├── DTO
│   ├── CategoryDTO.java               # DTO for single category
│   └── CategoryResponseDTO.java       # DTO for API response
│
└── Mapper
    └── GetAllCategoryMapper.java      # Mapper for converting response DTOs

⚡ Features

Fetch product categories from FakeStore API using Retrofit

Map API responses to custom DTOs

Expose REST endpoints via Spring Boot (/api/categories)

Easy-to-extend integration layer for new endpoints

▶️ Running the Project
1. Clone Repository
git clone https://github.com/your-username/fakestore-retrofit-springboot.git
cd fakestore-retrofit-springboot

2. Build & Run

Make sure Maven is installed and Java 21 is available.

mvn clean install
mvn spring-boot:run

3. Access Endpoints

Once the app is running, open:

http://localhost:8080/api/categories

🌍 API Endpoints
Method	Endpoint	Description
GET	/api/categories	Fetch all categories from FakeStore API
🧩 Example Response

GET /api/categories

[
  {
    "name": "electronics"
  },
  {
    "name": "jewelery"
  },
  {
    "name": "men's clothing"
  },
  {
    "name": "women's clothing"
  }
]

📦 Dependencies

Key Maven dependencies:

<dependency>
    <groupId>com.squareup.retrofit2</groupId>
    <artifactId>retrofit</artifactId>
    <version>2.11.0</version>
</dependency>
<dependency>
    <groupId>com.squareup.retrofit2</groupId>
    <artifactId>converter-gson</artifactId>
    <version>2.11.0</version>
</dependency>
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>

🚀 Future Enhancements

Add product details endpoint

Implement caching with Redis

Add error handling + logging

Write unit & integration tests
