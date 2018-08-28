<!-- this jstl library to import in jsp page -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- prefix = "c" used it in html to be easy -->



<html>
<body>
hi ${sessionName}
this is all todos you have
<br>
<br>

<table>
<thead>
<tr>
<th> id </th>
<th> user </th>
<th> discription </th>
<th> Date </th>
<th> is Done ? </th>
<th>Delete</th>
</tr>


</thead>
<tbody>
<!-- 
@ c is a prefix
@ foreach line = for( Todo todo:todos)
 -->
<c:forEach items="${todos}" var ="todo">
<tr>
<td>${todo.id}</td>
<td>${todo.user}</td>
<td>${todo.desc}</td>
<td>${todo.targetDate}</td>
<td>${todo.done}</td>
<td><a type="button" href="/deletetodo?id=${todo.id}">Delete</a></td>
</tr>


</c:forEach>



</tbody>


</table>

</body>


</html>