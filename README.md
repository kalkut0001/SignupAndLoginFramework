# Spring Boot JWT Authentication tutorial

Signup and login framework with jwt token.

### Used technical stacks

Core java,
Spring boot,
Spring boot JPA,
MySQL database
JWT authentication

### Insert roles to roles table:

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

### Api guides

1) If you try to access the
   http://localhost:8080/api/test

{
"path": "/error",
"error": "Unauthorized",
"message": "Full authentication is required to access this resource",
"status": 401
}

2) First signup :
   Url: http://localhost:8080/api/auth/signup
   Body:
   {
   "username": "Arijit",
   "password": "test0001",
   "email": "arijit.patra0001@gmail.com",
   "roles":[{"role": "ROLE_USER"}]
   }
Response: 
   {
   "message": "User registered successfully!"
   }

If you try again you wil get:

{
"message": "Error: Username is already taken!"
}

2) For signin:

Url: http://localhost:8080/api/auth/signin

{
"id": 1,
"username": "Arijit",
"email": "arijit.patra0001@gmail.com",
"roles": [
"ROLE_USER"
],
"accessToken": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJBcmlqaXQiLCJpYXQiOjE3MDIzNzQwMzIsImV4cCI6MTcwMjQ2MDQzMn0.z8OteUE7hg28Y_5P7UcS2U_5QfCVBnde9QuZoX4O0cg",
"tokenType": "Bearer"
}

For successful login it will create jwt token.

Save this token in browser cache and add it to Authorization header part to use other endpoints.
