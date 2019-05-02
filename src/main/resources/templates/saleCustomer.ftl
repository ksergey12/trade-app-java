<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">

</head>
<body>
<a href="/index">Home</a>

<p>
<h1>Сума всех заказов по товару ${string}</h1>
<h3>${integer} </h3>
</p>
<a href="<@spring.url '/customer/list'/>" class="list-group-item active">customer List</a>
</body>

</html>
