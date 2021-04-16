## RESTfulAPIs Change Log
Create RESTful API using SpringBoot and PostgreSQL  

## PostgreSQL Database Information
Database: test  
Table: feature  
Primary Key: featureName, email    

## Prerequisite
1. Create database "test" by execute query "CREATE DATABASE test;" in PostgreSQL
2. Change username and password in file "application.properties"
3. Open the poject with intellij tools and run the "DemoApplication.java" to start to service  
4. Use Postman to test these 2 API  

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
