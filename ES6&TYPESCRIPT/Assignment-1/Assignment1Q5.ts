//a
function add(a,b=10){
    console.log(a+b);
}

add(10,40);
add(5);

//b

function userFriends(username,...arg){
    console.log("Name: "+username);
    console.log("Friends: ")
    for(let i in arg){
    console.log(arg[i])
    }
}
 userFriends("john","tom","harry");

