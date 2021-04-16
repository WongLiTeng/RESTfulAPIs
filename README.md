## RESTfulAPIs
Create RESTful API using SpringBoot and PostgreSQL

## PostgreSQL Database
Database: Test
Table: feature
Primary Key: featureName, email

## POST Feature API
Method: POST
Endpoint: http://localhost:8080/feature
Reuest Body:
{
	"featureName": "feature1",
	"email": "test1@gmail.com",
	"enable": true
}

## GET Feature API
Method: GET
Endpoint: http://localhost:8080/feature?email=test1@gmail.com&featureName=feature1
Response Body:
{
	"canAccess": true
}
