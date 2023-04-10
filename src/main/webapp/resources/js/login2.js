/**
 * login.js
 */
$(document).ready(function(){
    $('#frmLogin').on('submit',function(){
        event.preventDefault();
        
        var userId = $('#user_id').val();
        var userPw = $('#user_pw').val();

        $.ajax({
            type:"post",
            url:"login",
            data:{"id":userId,
                  "pw":userPw},
            dataType:'text',
            success:function(result){
                if(result == "success"){
                    alert("로그인 성공\n 상품 조회 화면으로 이동합니다.");
                    location.href="/mybatis/product/productListAll";
                }
                else
                    alert("로그인 실패");
            },
            error:function(){

            },
            complete:function(){

            }
    	});
    });
});