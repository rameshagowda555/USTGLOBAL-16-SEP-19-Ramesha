let password = document.getElementById("password");
let username = document.getElementById("username");
//for Password visibility
function showPassword() {
   
    if (password.type === "password") {
      password.type = "text";
    } else {
      password.type = "password";
    }
  }
//for validating a length of a password and username
  document.getElementById("button1").disabled = true;
  function validation(){   
  let len1 = username.value.length;
  let len2 =password.value.length;
  if(len1 > 5 && len2 > 6)
  document.getElementById("button1").disabled = false;
  else
  document.getElementById("button1").disabled = true;
  
  }
//for displaying the error message
document.getElementById("errorPassword").style.visibility = "hidden";
document.getElementById("errorUser").style.visibility = "hidden";
 function validation1(){
    if(username.value!="Ramesha" )
    document.getElementById("errorUser").style.visibility = "visible";
    else
    document.getElementById("errorUser").style.visibility = "hidden";
  
    if(password.value!=7411024475 )
    document.getElementById("errorPassword").style.visibility = "visible";
    else
    document.getElementById("errorPassword").style.visibility = "hidden";
}

