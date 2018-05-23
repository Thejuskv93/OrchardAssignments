
function valOperation()
{
   
    var num1=parseInt(document.getElementById('num1').value);
    var num2=parseInt(document.getElementById('num2').value);
    var oper=document.getElementById('operation').value;
    var res=0;
    if(oper==="add")
    {
        res=num1+num2;
        document.getElementById('result').value=res;
    }
    if(oper==="sub")
    {
        res=num1-num2;
        document.getElementById('result').value=res;
    }
    if(oper==="mul")
    {
        res=num1*num2;
        document.getElementById('result').value=res;
    }
}
