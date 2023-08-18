<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../path-to-your/common-style.css">
    <!-- Link to your common CSS file -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <title>Insert title here</title>
    <style>
        /* Additional styles specific to this page */
		#confirmation-container {
		    text-align: center; 
		    padding: 40px; /* Increased padding */
		    background-color: #f9f9f9; /* Lighter background */
		    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
		    margin: 200px auto;
		    max-width: 800px;
		    max-height: 800px;
		    border-radius: 10px; /* Added border-radius */
		}
		
		.confirmation-heading {
		    font-size: 28px; /* Increased font size */
		    margin-bottom: 30px; /* Increased margin */
		    color: #333; /* Dark text color */
		    font-weight: 600; /* Bold text */
		}
		
		table {
		    margin: 0 auto;
		    border-collapse: collapse;
		    width: 100%; /* Reduced width for some spacing */
		}
		
		th, td {
		    padding: 15px; /* Increased padding */
		    text-align: center;
		    border-bottom: 1px solid #e5e5e5; /* Lighter border color */
		    font-size: 18px; /* Increased font size */
		    width: 25%;
		}
		
		th {
		    background-color: #f1f1f1; /* Light background for headers */
		    font-weight: bold; /* Bold headers */
		}
		
		.confirmation-button-container {
		    text-align: center; 
		    margin-top: 30px; /* Increased margin */
		}
		
		.confirmation-button {
		    background-color: #007BFF; /* Primary blue color */
		    color: #fff;
		    border: none;
		    padding: 12px 25px; /* Increased padding */
		    font-size: 18px; /* Increased font size */
		    cursor: pointer;
		    margin-top: 10px;
		    border-radius: 5px; /* Added border-radius */
		    transition: background-color 0.3s, transform 0.3s; /* Added transition for hover effects */
		}
		
		.confirmation-button:hover {
		    background-color: #0056b3; /* Darker blue on hover */
		    transform: translateY(-2px); /* Small upward motion on hover */
		}
		
		.confirmation-button:active {
		    transform: translateY(0); /* Reset position on active */
		}
    </style>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<c:set var="classVO" value="${ClassVO}" />

<div id="confirmation-container">
    <div class="confirmation-heading">
        예약이 완료 되었습니다
    </div>
    <table>
        <tr>
            <th>강좌명</th>
            <th>강사명</th>
        </tr>
        <tr>
            <td>${classInfo.class_title}</td>
            <td>${classInfo.nickname}</td>
        </tr>
        <tr>
            <th>날짜</th>
            <th>시간</th>
        </tr>
        <tr>
            <td>${date}</td>
            <td>${time}</td>
        </tr>
    </table>
    <div class="confirmation-button-container">
        <c:if test="${memberVo != null}">
            <c:if test="${memberVo.teacheryn == 'Y'}">
                <button class="confirmation-button" onclick="window.location.href='../mypage/teacher?member_no=${memberVo.member_no }'">예약확인</button>
            </c:if>
            <c:if test="${memberVo.teacheryn == 'N'}">
                <button class="confirmation-button" onclick="window.location.href='../mypage/student?member_no=${memberVo.member_no }'">예약확인</button>
            </c:if>
        </c:if>
        <button class="confirmation-button" onclick="window.location.href='http://localhost:8080/class/read?class_no=${class_no}'">돌아가기</button>
    </div>
</div>

<%@ include file="../common/footer.jsp" %>
<script src="../resources/js/confirm.js"></script>
</body>
</html>
