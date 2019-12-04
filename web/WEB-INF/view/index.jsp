<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html class="no-js" lang="">

<head>
  <meta charset="utf-8">
  <title>Home</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="resources/css/normalize.css">
  <link rel="stylesheet" href="resources/css/main.css">
  <meta name="theme-color" content="#fafafa">
</head>
<body>
<nav class="col-1">
  <ul>
    <li><a href="index.html">Home</a></li>
    <li><a href="Characters.html">Characters</a></li>
    <li><a href="Items.html">Items</a></li>
    <li><a href="Quests.html">Quests</a></li>
    <li><a href="Add.html">Add/Edit Page</a></li>
    <li><a href="search.html">Search</a></li>
  </ul>
</nav>
<div class="col-2">
  <header><h1>Wiki</h1></header>
  <main class="content">
    <article>Wiki site for a DnD campaign.  Contains information for characters, items, and quests.</article>
    <article>

      <table>
        <tr>
          <th>Race</th>
          <th>Speed</th>
        </tr>
        <c:forEach var="tempRace" items="${races}">

        </c:forEach>
      </table>

    </article>
  </main>
  <footer>Zach Dobrzynski sample site for Distributed Java</footer>
</div>
</body>

</html>