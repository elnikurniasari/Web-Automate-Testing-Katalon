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

## Example of API Documentation
### Auth - CreateToken
Creates a new auth token to use for access to the PUT and DELETE /booking
🟢 POST
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
| Content-Type   | string         | Sets the format of payload you are sending |
|                |                | Default value: `application/json`   |

Request Body
| Field          | Type           | Description    |
| -------------- | -------------- | -------------- |
| Username       | string         | Username for authentication |
|                |                | Default value: `admin`   |
| Password       | string         | Password for authentication |
|                |                | Default value: `password123`   |

Success 200
| Field          | Type           | Description    |
| -------------- | -------------- | -------------- |
| Token          | string         | Token to use in future requests |

Respon
```
HTTP/1.1 200 OK

{
    "token": "abc123"
}
```

### Booking - GetBookingIds
Returns the ids of all the bookings that exist within the API. Can take optional query strings to search and return a subset of booking ids.
🔵 GET
```
https://restful-booker.herokuapp.com/booking
```
Example 1:
```
curl -i https://restful-booker.herokuapp.com/booking
```
Header
| Field                          | Type           | Description    |
| ------------------------------ | -------------- | -------------- |
| firstname `optional`           | string         |	Return bookings with a specific firstname |
| lastname `optional`            | string         | Return bookings with a specific lastname  |
| checkin `optional`             | date           | Return bookings that have a checkin date greater than or equal to the set checkin date. Format must be CCYY-MM-DD  |
| checkout `optional`            | date           | Return bookings that have a checkout date greater than or equal to the set checkout date. Format must be CCYY-MM-DD  |

Success 200
| Field          | Type           | Description    |
| -------------- | -------------- | -------------- |
| Object         | object[]       | Array of objects that contain unique booking IDs |
| bookingid      | number         | ID of a specific booking that matches search criteria |

Respon
```
HTTP/1.1 200 OK

[
  {
    "bookingid": 1
  },
  {
    "bookingid": 2
  },
  {
    "bookingid": 3
  },
  {
    "bookingid": 4
  }
]
```



