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
<a href="<@spring.url '/index'/>">Home</a>

<div>
    <fieldset>
        <legend>Add order</legend>
        <form name="order" action="" method="POST">

            amount:<@spring.formInput "orderForm.amount" "" "number"/>
            <br>
            name:<@spring.formSingleSelect "orderForm.good" mavs ""/>
           <br>
            customer:<@spring.formSingleSelect "orderForm.customer" mavsCustomer ""/>
            <br>
            date:<@spring.formInput "orderForm.date" "" "date"/>
            <br>
            count:<@spring.formInput "orderForm.count" "" "number"/>
            <br>

        <br>


            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>