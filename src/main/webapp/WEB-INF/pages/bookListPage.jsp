<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>BookList</title>
</head>
<body>
<h2>Book List</h2>
<table border='0'>
    <c:if test="${!empty bookList }">
        <c:forEach items="${bookList }" var="book">
            <tr>
                <td>${book.bookId}</td>
                <td>${book.bookName}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>
