# Relevant cover test

## Requirements 

Java (8+) installed
Git client (optional)
Curl or tool to make http requests e.g. postman, chrome browser, etc.

## How to build it

Start by cloning this repository in your local machine 
<code>git clone https://github.com/mostrovoi/relevant-cover.git</code>

This project uses gradle as build tool. Go to relevant-cover folder and run
<code>./gradlew bootRun</code>

This will start up a server listening in port 8100

## How to use it

This server is a sample test using JWT tokens as authentication mechanism for a REST api.
There are 2 endpoints available

<code>/login 

/users/{username}</code>

### Login operation

You should POST a request to http://localhost:8100/login 
with your username and password in the body payload e.g with curl.:

<code>curl -i -H "Content-Type: application/json" -X POST -d '{
    "username": "xxxx",
    "password": "xxxx"
}' http://localhost:8100/login</code>

Where xxxx is your actual user and password. This operation, if succesful, will return a Bearer token in the response. This token should be used for all operations requiring authorization

#### Get a user

There is the endpoint /users/{username} which will retrieve the details of a user. e.g.:

<code>curl -H "Authorization: Bearer xxx.yyy.zzz" http://localhost:8100/users/xxxx</code>

Here, you should copy the token obtained before and replace xxx by the user you want to get info from.

#### Data

This demo uses an in-memory database already populated with 2 users:


| user | password |
| ---- |-----|
| oscar | oscar |
| bruno | bruno |

You can try out the demo with this data. Feedback welcome!