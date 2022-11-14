
    $(function() {
    $("#chinese").click(function(){
        console.log("aaaa")
    });
    $("#english").click(function(){
    var ko = $("#korean").val();
    $.ajax({
    url:"/english",
    type:"GET",
    dataType:"json",
    data:{korean:ko},
    success:function(v){
    console.log(v);
},error:function(e){
    console.log(e);
}
});
})
});
