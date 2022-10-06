/**
 * 
 */



let mtable = document.querySelector('#mtable');

$.ajax({
	url : "/jspweb/member/list" ,
	success : function( result ){
		console.log(result);
	}
});
