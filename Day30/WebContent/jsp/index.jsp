<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>簡單的 JSP 範例</title>
</head>
<body>
    <h1>歡迎來到 JSP 範例</h1>

    <p>當前的時間是：<%= new java.util.Date() %></p>

    <p>這是一個簡單的靜態內容。</p>

    <% 
        // 這裡是一段動態 Java 程式碼
        String name = "世界";
    %>
    <p>動態內容：你好，<%= name %>！</p>
</body>
</html>
