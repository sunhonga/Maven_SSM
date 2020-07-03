


$(function () {
    $("#tx_test").click(function () {
        // window.open(open"tx_test.do");
        $.post( "tx_test.do",{name:sunhong,age:18,address:chengdu},function(data,status){
            $("#zqlbtextarea").html(data);
            console.log("asd");
        },"json" );
    });
})


