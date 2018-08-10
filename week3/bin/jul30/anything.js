document.write("<h1>Welcome to JS </h1>");

function askinput()
{
	var name  = prompt("enter you name","aa");
	var message = document.getElementById("message1");
	alert("welcome"+name);
	
	}

function display()
{
	
	var r = confirm("r u sure u  want to logout");
	var message1 = document.getElementById("message1");
	if(r)
		{
		alert("logged out");
		}
	else
		{
		alert("welcome back");
		}
	
	}