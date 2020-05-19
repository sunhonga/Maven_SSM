


$(function () {
    $("#tx_test").click(function () {
        $.post( "tx_test.do",function(data,status){
            $("#zqlbtextarea").html(JSON.stringify(data));
        },"json" );
    });
})


