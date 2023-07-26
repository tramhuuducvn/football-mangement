<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <html>

        <head>
            <title>View Books</title>
            <!-- <link href="<c:url value=" /css/common.css" />" rel="stylesheet" type="text/css"> -->
        </head>

        <body>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Abbrev Name</th>
                        <th>Founding date</th>
                        <th>Stadium</th>
                        <th>Tournament</th>
                        <th>About</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${footballClubs}" var="footballClub">
                        <tr>
                            <td>${footballClub.name}</td>
                            <td>${footballClub.abbrevName}</td>
                            <td>${footballClub.foundingDate}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </body>

        </html>