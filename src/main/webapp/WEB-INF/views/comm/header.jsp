<%@ page import="com.example.demo.domain.MemberVO" %>
<%@ page import="java.util.List" %><%--
 헤더 파일
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- jQuery -->
<script src="//code.jquery.com/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">--%>
<!-- 부가적인 테마 -->
<%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">--%>
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>--%>

<%--css--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%--<link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.min.css">--%>
<link rel="stylesheet" type="text/css" href="/resources/css/bootstrap2.min.css">
<%--js--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


<%
    String strLoginId = "guest";
    String strName = "guest";
    String strRole = "";

    String strLogInOut="";
    String strUrl="";

    session = request.getSession(false);
    if(session != null){
        strLoginId = (String) session.getAttribute("ss_login_id");
        strName = (String) session.getAttribute("ss_name");
        strRole = (String) session.getAttribute("ss_role");
        strLogInOut ="LogOut";
        //strUrl = "/login/logout";
        strUrl = "login/logout";

    }
    if(strLoginId==null){
         strLoginId = "guest";
         strName = "guest";
        strLogInOut ="LogIn";
        //strUrl = "/login/login";
        strUrl = "/login/login";
    }

    String strAuth = (String) request.getAttribute("ss_auth");
    if(strAuth==null){ strAuth = "N"; }

%>

<%--<div class="container">--%>
<%--    <header class="d-flex flex-wrap align-items-center justify-content-center py-3 mb-4 border-bottom">--%>
<%--        <ul class="nav nav-pills">--%>
<%--            <li class="nav-item"><a href="/" class="nav-link active" aria-current="page">Home(H)</a></li>--%>
<%--            <li class="nav-item"><a href="/list" class="nav-link">게시판</a></li>--%>
<%--            <% //if("Y".equals(strAuth)){ %>--%>
<%--            <li class="nav-item"><a href="/member/list" class="nav-link">회원목록</a></li>--%>
<%--            <% //} %>--%>

<%--        </ul>--%>
<%--        <div class="col-md-3 text-end">--%>

<%--            <button type="button" class="btn btn-outline-primary me-2" onclick="location.href='<%=strUrl%>'" ><%=strLogInOut%></button>--%>
<%--            <% if("guest".equals(strLoginId)) { %>--%>
<%--            <button type="button" class="btn btn-primary" onclick="location.href='/member/insert'">Sign-up</button>--%>
<%--            <% } %>--%>
<%--        </div>--%>
<%--    </header>--%>
<%--</div>--%>


<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">스프링부트 게시판 mybatis-postgresql, jsp ajax 사용</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarColor01">

            <ul class="navbar-nav me-auto">
                <a> </a>
                <li class="nav-item"></li>
                <%--                <li class="nav-item">--%>
                <%--                    <a class="nav-link active" href="/">Home--%>
                <%--                        <span class="visually-hidden">(current)</span>--%>
                <%--                    </a>--%>
                <%--                </li>--%>
                <%--                <li class="nav-item">--%>
                <%--                    <a class="nav-link" href="/list">jsp ajax 게시판</a>--%>
                <%--                </li>--%>
                <li class="nav-item"><a href="/" class="nav-link active" aria-current="page">Home(H)</a></li>
                <li class="nav-item"><a href="/list" class="nav-link">게시판</a></li>
                <% //if("Y".equals(strAuth)){ %>
                <li class="nav-item"><a href="/member/list" class="nav-link">회원목록</a></li>
                <% //} %>

            </ul>


            <div class="col-md-3 text-end">
                <p style="color: #ffffff"><%=strName%>님 안녕하세요</p>
                <button type="button" class="btn btn-outline-light" onclick="location.href='<%=strUrl%>'" ><%=strLogInOut%></button>
                <% if("guest".equals(strLoginId)) { %>
                <button type="button" class="btn btn-outline-light" onclick="location.href='/member/insert'">Sign-up</button>
                <% } %>
            </div>
            <%--            <button type="button" class="btn btn-outline-light">로그인</button>--%>
            <%--            <button type="button" class="btn btn-outline-light">회원가입</button>--%>
            <%--            <form class="d-flex">--%>
            <%--                <input class="form-control me-sm-2" type="text" placeholder="Search">--%>
            <%--                <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>--%>
            <%--            </form>--%>
        </div>
    </div>
</nav>