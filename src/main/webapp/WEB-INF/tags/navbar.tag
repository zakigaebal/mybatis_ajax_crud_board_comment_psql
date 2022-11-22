<%@ tag language="java" pageEncoding="UTF-8"%>

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
                <% if("ADMIN".equals(strRole)){ %>
                <li class="nav-item"><a href="/admin" class="nav-link active" aria-current="page">Home(A)</a></li>
    <li class="nav-item"><a href="/member/list" class="nav-link">회원목록</a></li>
    <% } %>

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


<%--<nav class="navbar navbar-default">--%>
<%--    <div class="container-fluid">--%>
<%--        <div class="navbar-header">--%>
<%--            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">--%>
<%--                <span class="sr-only">Toggle navigation</span>--%>
<%--                <span class="icon-bar"></span>--%>
<%--                <span class="icon-bar"></span>--%>
<%--                <span class="icon-bar"></span>--%>
<%--            </button>--%>
<%--            <a class="navbar-brand" href="#">스프링부트 게시판 mybatis-postgresql</a>--%>
<%--        </div>--%>
<%--        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">--%>
<%--            <ul class="nav navbar-nav navbar-right">--%>
<%--                <li class="active"><a href="/list">jsp ajax 게시판</a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</nav>--%>
