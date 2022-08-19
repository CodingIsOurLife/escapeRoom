### Request
```
POST /member/register HTTP/1.1
Host: 192.168.56.1:8080
Content-Type: application/json

{
    "pw" : "password",
    "nickname" : "닉네임",
    "email" : "abc@abc.com"
}
```

### Response
```
HTTP/1.1 200 Ok

{
"nickname" : "닉네임"
}
```