## CRUD Operations for Project Management System

### GET http://localhost:8080/pms/fetchAll
```json
[
  {
    "id": 1,
    "name": "Adarsh3",
    "description": "This is test description3",
    "startDate": "2024-04-28T00:00:00.000+00:00",
    "endDate": "2024-04-28T00:00:00.000+00:00"
  },
  {
    "id": 2,
    "name": "Akash",
    "description": "This is test description3",
    "startDate": "2024-04-28T00:00:00.000+00:00",
    "endDate": "2024-04-28T00:00:00.000+00:00"
  },
  {
    "id": 3,
    "name": "Adarsh",
    "description": "This is about something",
    "startDate": "2024-04-28T00:00:00.000+00:00",
    "endDate": "2024-04-28T00:00:00.000+00:00"
  }
]
```

### GET http://localhost:8080/pms/fetchById/3
```json
  {
    "id": 3,
    "name": "Adarsh",
    "description": "This is about something",
    "startDate": "2024-04-28T00:00:00.000+00:00",
    "endDate": "2024-04-28T00:00:00.000+00:00"
  }
```

### GET http://localhost:8080/pms/delete/3
200 OK

### Create
```sh
POST /pms/post HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 133


    {
      "name": "Adarsh",
      "description": "This is about abc",
      "startDate": "2024-04-28",
      "endDate":"2024-04-28"
    }

```

### Update
```sh
PUT /pms/updateById/9999999/Babu ji HTTP/1.1
Host: localhost:8080
```
