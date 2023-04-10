/**
 * login.js
 */
$(document).ready(function(){
    $('#NoCheck').on('click',function(){
        event.preventDefault();
        var prdNo = $('#prdNo').val();
        $.ajax({
            type:"post",
            url:"prdNoCheck",
            data:{"prdNo":prdNo},
            dataType:'text',
            success:function(result){
                if(result == "success"){
                    alert("사용 가능한 번호입니다.");
                }
                else
                    alert("사용할 수 없는 번호입니다.");
            },
            error:function(){
                alert("오류");
            },
            complete:function(){

            }
        })
    })
});