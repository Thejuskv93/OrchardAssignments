function validateData()
{
    
    var fname=document.f1.fname.value;
    var lname=document.f1.lname.value;
    var title=document.f1.title.value;
    var address=document.f1.address.value;
    var city=document.f1.city.value;
    var state=document.f1.state.value;
    var pcode=document.f1.pcode.value;
    var country=document.f1.country.value;
    var phone=document.f1.phone.value;
    var fax=document.f1.fax.value;
    var email=document.f1.email.value;
    var payment=document.f1.payment.value;
    
    
   if(fname=="" || lname==""||title==""||address==""||city==""||state==""||pcode==""||country==""||phone==""||fax==""||email==""||payment=="")
   {
       alert("You cant leve any fields blank");
       return false;
   }
   if(pcode.length!=6)
   {
       alert("Invalid pin code");
       return false;
   }
   else if(!pcode.match(/[0-9]{6}/))
   {
        alert("Invalid pincode length");
        return false;
   }
   if(!email.match(/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/))
   {
       alert("Invalid email");
       return false;
   }
}

function checkEmpty()
{
    if(document.getElementById("fname").value=="")
    {
        document.getElementById("warning").innerHTML="*please fill in the data";
    }
}