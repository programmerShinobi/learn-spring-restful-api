# User API Spec

## Register User

Endpoint : POST /api/users

Request Body :
```json
{
  "username": "shinobi",
  "password": "secret",
  "name": "Faqih Pratama Muhti"
}
```
Response Body (Success) :
```json
{
  "data": "OK"
}
```
Response Body (Failed) :
```json
{
  "data": "KO",
  "errors": "username must not blank, ???"
}
```

## Login User

Endpoint : POST /api/auth/login

Request Body :
```json
{
  "username": "faqih",
  "password": "secret"
}
```
Response Body (Success) :
```json
{
  "data": {
    "token": "TOKEN",
    "expiredAt": 2342342423423 // miliseconds
  }
}
```
Response Body (Failed, 401) :
```json
{
  "errors": "username or password wrong"
}
```

## Get User

Endpoint : GET /api/users/current

Request Header :
- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :
```json
{
  "data": {
    "username": "shinobi",
    "name": "Faqih Pratama Muhti"
  }
}
```

Response Body (Failed, 401) :
```json
{
  "errors": "Unauthorized"
}
```

## Update User

Endpoint : PATCH /api/users/current

Request Header :
- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "name" : "Faqih Pratama Muhti, S.Kom.", // put if only want to update name
  "password" : "new-password" // put if only must to update password
}
```
Response Body (Success) :
```json
{
  "data": {
    "username": "shinobi",
    "name": "Faqih Pratama Muhti, S.Kom."
  }
}
```
Response Body (Failed, 401) :
```json
{
  "errors": "Unauthorized"
}
```

## Logout User

Endpoint : DELETE /api/auth/logout

```json
{
  "data": "OK"
}
```