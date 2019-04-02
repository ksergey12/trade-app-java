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

<h3>Customer list</h3>
<br>
<div>

    <table border="3" bgcolor="#f0f8ff">
        <tr>
            <th>Name</th>
            <th>Addres</th>
            <th>Phone</th>
            <th>ContactPerson</th>
            <th>Delete</th>
        </tr>
            <#list customers as customer>
                <tr>
                    <td>${customer.name}</td>
                    <td>${customer.addres}</td>
                    <td>${customer.phone}</td>
                    <td>${customer.contactPerson}</td>
                    <td><a href="/customer/delete/${customer.id}">Delete</a> </td>

                <#--<td><a href="/student/delete/${student.id}">Delete</a></td>
                <td><a href="/student/edit/${student.id}">Edit</a></td> -->
                </tr>
            </#list>
    </table>

</div>

<a href="/customer/add">Add new customer</a>


</body>
</html>