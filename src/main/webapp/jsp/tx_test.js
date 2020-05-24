


$(function () {
    $("#tx_test").click(function () {
        // window.open(open"tx_test.do");
        $.post( "tx_test.do",function(data,status){
            $("#zqlbtextarea").html(data);
            console.log("asd");
        },"json" );
    });
})


