# KATALON API TESTING

## Requirements
* Install [Katalon Studio](https://katalon.com)
* Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/#java11?er=221886)
* Register a [Github](https://github.com/) account 
* API documentation

## Project Structure
Test Cases
* CREATE Token
* CREATE Booking
* GET Booking ID
* UPDATE Booking Data
* DELETE Booking Data

Object Repository
* CREATE - Create token
* CREATE - Create booking
* GET - Get List booking ID
* GET - booking by ID
* GET - booking ID by name
* GET - booking ID by checkin and checkout
* PUT - Update booking by ID
* PATCH - Partial Update
* DELETE - Delete Booking
* GET - Healthcheck
  
Test Suites
* Create Booking
* E2E Testing

Global Variable
* Base_URL
* Token

## Creating New API Tests
1 Create a New Test Case
* Go to File → New → Test Case.
* Name your test case.
2. Add API Requests
* Navigate to Object Repository.
* Right-click and select New → Web Service Request.
* Configure the HTTP method (GET, POST, PUT, DELETE), headers, and parameters.

## API Documentation
### Auth - CreateToken
Creates a new auth token to use for access to the PUT and DELETE /booking
POST
```
https://restful-booker.herokuapp.com/auth
```
Example 1:
```
curl -X POST \
  https://restful-booker.herokuapp.com/auth \
  -H 'Content-Type: application/json' \
  -d '{
    "username" : "admin",
    "password" : "password123"
}'
```
Header
| Field          | Type           | Description    |
| -------------- | -------------- | -------------- |
| Content-Type   | string         | Sets the format of payload you are sending
|                |                | Default value: application/json   |






