import axios from '../http'
export function Login(usr,pwd){
    return axios.post('/login',null,{
        params:{
            username: usr,
            password: pwd
        }
    }).then(respone=>{
        return respone;
    }).catch(e=> {
        console.log(e);
    });
}

export function GetListLogin(){
    return axios.get('/login').then(respone=> {
        return respone;
    }).catch(e => {
        console.log(e);
    });
}