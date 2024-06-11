/**
 * 
 */
	/*
	<button id="btn">연결 테스트</button>
	를 클릭했을때 나오는 기능
	*/
 	function btn(){
		alert("클릭되었습니다");
		
	}
 	
 	
 	/*
	<button id="btn">연결 테스트</button>
	를 클릭했을때 나오는 기능
	*/

	document.querySelector("#btn").addEventListener("click",btn);
	
	/*
	<button id="btn">연결 테스트</button>
	를 제이쿼리 형식으로 변경하기
	*/
	$(document).ready(function(){
	$("#btn").click(btn);
	});
	