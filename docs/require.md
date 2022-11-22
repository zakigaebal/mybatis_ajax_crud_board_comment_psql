# 게시판 프로젝트 - MyBatis

Mybatis 게시판을 만든다.
<hr>

## 개발환경
- postgresql
- jsp
- springboot
- grdle빌드툴
- war패키징


## Todo
- springboot swagger - api, controller, response해보기
    - mybatis - postgresql 연동
    - crud controller 생성
    - crud api 연동
- 웹 템플릿 다운받고 연동하기
    1.  웹템플릿 정하기

    2. 다운받은 템플릿 연동하기
    - 템플릿엔진 사용하지않고 정적 컨테츠로 바로 보여주기
- 게시판 쓸수 있는 템플릿 가져오기
- 부트스트랩템플릿쓰기
- 댓글과 대댓글도 할수 있는 게시판 만들기
- ajax호출해서 crud가 될수 있도록 만들기
- jquery 사용하기
- jsp나 html로 만들기
- pageController.java를 만들어서 /board/list로 보내면 list.jsp로 가게
- crudController도 만드러야됨
- PageController.java
- /board/list -> list.jsp
- 게시판 crud
- 대댓글 만들기 ajax 활용하기

- 사용자 관리자 나눠서 관리
- 사용자페이지 관리자 페이지 만들기
- 회원가입 - 성별, 이름, 휴대폰번호
- 관리자 - 관리자페이지, 사용자페이지 나눠서 진행
- 답글 - 답글 수정할때 해당 사용자만 답글 수정하게
- 게시글 - 게시글 사용유무 체크하기
- 게시글 - 게시글이 사용유무가 무이면 사용자페이지에서 안보이게 하기
- 게시글 - 관리자페이지에서 사요유무체크가 유무인지 게시글리스트에 보여야할듯
- 게시글 - 고정 공지사항 유무 만들기
- 로그인, 회원가입 가능하게 세션으로 만들기


- 관리자페이지 완료
- 사용자페이지 생성중


절차 : 큰그림그리기
- 요구사항 정의하기
- 필요 sql, erd 만들기
- 스프링부트 시작하기
  - 처음할때는 먼저 검색되게끔만 만들기
- dto만들기(lombok사용)
- dao(interface)만들기 -@mapper 사용
- mapper, xml 만들기
- controller 사용 - sout로 로그찍고 페이지 이동하기, 디버깅확인하기
- jsp활용, jstl 사용


- 게시글검색
- 게시글페이지네이션
  글수정할때 controller에서 return할때 자바스크립트alert - 성공,실패처리 자바스크립트 location.href = “/updateForm”처리

게시글 조회수 만들기

웹브라우저백키 눌렀을때 페이지로딩하기

게시판 내림차순 정렬

댓글 내림차순 정렬

큰그림 ppt


## 요구 사항
git (github)  
Mybatis  
jquery  
ajax  



## 구현 내용
- 화면 구성 - jsp
- 디자인 - bootstrap

### 로그인 페이지  
아이디, 비밀번호를 입력하고 로그인하는 화면을 만든다.  
로그인이 완료되면 회원정보 페이지로 이동한다.

### 회원정보 페이지
회원정보를 보여주는 화면

API 문서  
링크

