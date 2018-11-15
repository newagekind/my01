<%--
  Created by IntelliJ IDEA.
  User: crowndint
  Date: 2018/8/25
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <form action="/account/save" method="post" enctype="multipart/form-data">
     姓名: <input type="text" name="name" /><br/>
     金额: <input type="text" name="money" /><br/>
    选择图片：<input type="file" name="imgFile" /><br/>
    <input type="submit" value="提交" />
  </form>

</body>
</html>
