<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>

<body>

    <h3>Good list</h3>
    <br>
    <div>

        <table border="3" bgcolor="#f0f8ff">
            <tr>
                <th>Name</th>
                <th>Prise</th>
                <th>Delivery</th>
                <th>Description</th>
                <th>Delete</th>
            </tr>
            <#list goods as good>
                <tr>
                    <td>${good.name}</td>
                    <td>${good.price}</td>
                    <td>${good.delivery}</td>
                    <td>${good.description}</td>
                    <td><a href="/good/delete/${good.id}">Delete</a> </td>

                <#--<td><a href="/student/delete/${student.id}">Delete</a></td>
                <td><a href="/student/edit/${student.id}">Edit</a></td> -->
                </tr>
            </#list>
        </table>

    </div>

    <a href="/good/add">Add new good</a>


</body>
</html>