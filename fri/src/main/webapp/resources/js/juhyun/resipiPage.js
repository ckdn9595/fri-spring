$(document).ready(function(){
	$('.pagebtn').click(function(){
		// 어떤 버튼이 클릭됬는지 알아낸다.
		var sno = $(this).attr('id');
		
		if(!sno){
			// sno가 null 또는 Undefined 인 경우는 페이지번호 버튼이다.
			sno = $(this).text();
			alert(sno);
		}
		
		$('#nowPage').val(sno);
		$('#pfrm').submit();
	});
	
	$('#lbtn').click(function(){
/*		var bno = $('#lfrm').children().first().val();
		var mno = $('#lfrm').children().last().val();
		
		alert(bno);
		alert(mno);
*/		
		var lcnt = $('#lfrm').children().last().val();
		
		if(lcnt == '1'){
			alert('이미 추천한 게시글입니다.');
			return;
		}
		
		$('#lfrm').submit();
	});
	
	$('.other').click(function(){
		var bno = $(this).attr('name');
		
		$('#'+ bno).submit();
	});
	
	$('#rbtn').click(function(){
		$('#rfrm').submit();
	});
	
	$('#firstpagebtn').click(function(){
		$('#whatpage').attr('value' , '1');
		$('#pageform').submit();
	});
	$('#lastpagebtn').click(function(){
		$('#whatpage').attr('value' , $('#lastpagesave').html());
		$('#pageform').submit();
	});
	$('.pagebtn').click(function(){
		$('#whatpage').attr('value' , $(this).html());
		$('#pageform').submit();
	});
});