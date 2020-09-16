<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>E ai pessoal da FTT!</h1>
<%= new java.util.Date() %>

<ul>

<% for(int i=0; i<10; i++) { %>
	<li>Item <%= i %></li>
<% } %>
	
</ul>
<p>
JSP referência: 
<a href="https://www.devmedia.com.br/introducao-ao-java-server-pages-jsp/25602">https://www.devmedia.com.br/introducao-ao-java-server-pages-jsp/25602</a>
</p>
</body>
</html>