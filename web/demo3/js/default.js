var title=$("#title");
title.click(function(ev){
    var ev=ev || window.event;
    var target=ev.target || ev.srcElement;
    if (target.nodeName.toLowerCase() == "div"){
        $(".normal").css("background","url(images/title_bg.gif)");
        $(target).css("background","url(images/title_bg2.gif)");
        var id=target.id;
        var i=id.substr(id.length-1,1);
        var content_id="content_"+i;
        $(".content1").css("display","none");
        $("#"+content_id).css("display","block");             
    }
})  
            