document.write("<script language=javascript src='/static/js/tool/Base64.js'></script>");


var E = window.wangEditor

$(document).ready(function(){


    var url = window.location.host;
    $("#loginFormSubmit").click(function(){
        //var datastring = "23333333";
        var name = document.getElementById("phone&email").value;
        var password = document.getElementById("password").value;

        var base = new Base64();
        var encypass = base.encode(password);
        alert("N:"+name+"   P:"+encypass);

        var data = {
            username : name,
            passworld : encypass
        }

        $.ajax({
                type: "POST",
                url: "Subwindow",
                data: JSON.stringify(data),
                dataType:'json',
                contentType:"application/json",
                success: function(data) {

                },
                error: function() {
                }
            }
        );


        /*$.ajax({
                type: "POST",
                url: "Subwindow",
                data: JSON.stringify(data),
                dataType:'json',
                contentType:"application/json",
                success: function(data) {

                },
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    if (textStatus && textStatus == "timeout") {
                        confirm("网络超时，请重试！");
                    }else{
                        var sss =   XMLHttpRequest.responseJSON.timestamp;
                    }
                }
            }
        );*/
    });
});


