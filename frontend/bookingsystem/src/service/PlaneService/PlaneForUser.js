import axios from '../http'

export function PlaneForUser(){
    return axios.get('/plane').then(respone => {
        return respone;
    }).catch(e=> {
        console.log(e);
    });

}