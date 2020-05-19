




$(function() {
    // k = zqlb,v=[{id,zqlb,subzqlb,desc}]
    var map = {};

    $("#zqlb").change(function() {
        //2. 一旦里面的值发生了改变，那么就去请求该省份的城市数据
        //$("#province").varl();
        var id = $(this).val();
        if(!map[id]){
            $.post( "selectZqlbById.do",{id:id} ,function(data,status){
                var m = {};
                $(data).each(function(index , c) {
                    m[c.id] = c;
                });
                map[id] = m;
                console.log(map);


                //先清空
                $("#subzqlb").html("<option value='' >-请选择-</option>");
                //再遍历，追加
                $(data).each(function(index , c) {
                    $("#subzqlb").append("<option value='"+c.id+"' >"+c.subzqlb +"</option>");
                    //$("#zqlbtextarea").text(c.desc);
                });
            },"json" );
        }else {
            $("#subzqlb").html("<option value='' >-请选择-</option>");
            for(var key in map[id]){
                $("#subzqlb").append("<option value='"+map[id][key].id+"' >"+map[id][key].subzqlb +"</option>");
            }
        }


    });

    $("#subzqlb").change(function(e){
        console.log(1);
        var i = $("#zqlb").val();
        var tmp = map[i];
        $("#zqlbtextarea").text(tmp[$("#subzqlb").val()].desc);
    });





});