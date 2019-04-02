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

<div>
    <fieldset>
        <legend>Add good</legend>
        <form name="good" action="" method="POST">
            name:<@spring.formInput "goodForm.name" "" "text"/>
            <br>
            addres:<@spring.formInput "goodForm.addres" "" "text"/>
            <br>
            phone:<@spring.formInput "goodForm.phone" "" "number"/>
            <br>
            contactPerson:<@spring.formInput "goodForm.contactPerson" "" "text"/>
            <br>

            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>