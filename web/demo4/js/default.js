$(document).ready(function(){
	$("#btn_create").click(function(){		
        var cell=$("#row").val();
    	var row=$("#row").val();
    	var table=$("<table cellspacing='0' cellpadding='0'>");
    	table.appendTo($("#createtable"));
    	for (var i =0;i<row;i++) {
    		if(i%2==0){
    			var tr=$("<tr bgcolor='red'></tr>");
    		}
    		else{
    			var tr=$("<tr bgcolor='blue'></tr>");
    		}	    
    	    tr.appendTo(table);
    	    for (var j = 0;j<cell; j++) {
    	    	var td=$("<td>"+i+"</td>");
    	    	td.appendTo(tr);
    	    };
    	};
    });
});  