var employee={
    id:1,
    greet:function()
    {
        var self=this;
        setTimeout(function(){console.log(self.id)},1000);

    }
}
employee.greet();

//or

var student={
    id:1,
    greet:function(){
        setTimeout(()=>{console.log(this.id)},1000);
    }
}
student.greet();

var funParam=(value=10)=>{
    console.log(value);
}
funParam();
funParam(20);
var percentBonus=()=>4 ;
let add=(value=10,bonus=value* percentBonus())=>
{
    console.log(value+bonus);
}
add();
add(20);
add(20,30);
add(undefined,40);

var employee2={
    id:1,
    greet:function()
    {
        
        var self=this;
        var a=function()
        {
            console.log("hello")
        };
        a();

    }
}
employee2.greet();




