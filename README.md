# Spring Security with JWT

This project implements **JWT authentication** in **Spring Boot** to make APIs stateless and secure. The server generates a token, and the client includes it in the headers for every request.

## Why JWT?
- No session storage required
- Works well with microservices
- Secure (includes token expiration and claims)
- Prevents CSRF attacks since tokens are in headers

## Tech Stack
- **Java 17+**
- **Spring Boot 3**
- **Spring Security 6**
- **JWT**
- **Maven**

## API Endpoints
- `POST /login` → Generate JWT token
- `POST /register` → Register a new user
- `GET /product` → Get product details (Requires Auth)

## Usage
1. **Get a Token:** Use `/login` to authenticate and receive a JWT.
2. **Include the Token:** Send it as a `Bearer` token in the `Authorization` header for protected endpoints.
3. **Verify JWT:** Decode the token at [jwt.io](https://jwt.io/) to inspect claims. 