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
</head>
<body>
    <form method="post" enctype="multipart/form-data" id="fileForm">
        <input type="file" value="上传" name="file" id="file"/>
    </form>
</body>

    <script>
        function update() {
            var formdate = document.getElementById("fileForm");
            $.ajax({
                url: "/Enterpriseadmin/addTender",
                type: formdate,
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
            })
        }
    </script>

</html>
