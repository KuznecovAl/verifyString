<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>

    <title>Verify String</title>
</head>
<body>
<div align="center">

    <form action="verStr" method="post" accept-charset="UTF-8" style="color:red;border: dotted greenyellow; background-color: darkblue">
        <b>String</b><input type="text" name="stringForVerify" maxlength="30" placeholder=${msg1} /><br/>
        <input type="submit" value="Проверка">
        <div style="color: coral">${msg1} : ${msg2}</div>
    </form>
</div>
</body>
</html>
