<%--
  Created by IntelliJ IDEA.
  User: lizhisuao
  Date: 19-5-7
  Time: 下午8:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/mdui.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/mdui.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/css/mdui.css" type="text/css" rel="stylesheet" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/mdui.min.css"/>
</head>
<body>
    <form method="post" enctype="multipart/form-data" id="fileForm">
        <input type="file" value="上传" name="file" id="file"/>
        <input type="submit" value="保存" onclick="update()" id="submit"/>
    </form>
</body>

    <script>
        function update() {
            var formData;
            formData = new FormData(document.getElementById("fileForm"));
            $.ajax({
                url: "/Enterpriseadmin/addTender",
                type: "post",
                data: formData,
                async : false,
                cache : false,
                dataType : "json",
                contentType : false,
                processData : false,
                success : function(data){
                    if(data.stateCode.trim() === "1") {
                        alert("成功");
                    }
                }
            });
        }
    </script>

</html>
