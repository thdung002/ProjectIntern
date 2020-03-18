import axios from '../http'

export function PlaneForSale(id){
    return axios.get('/admin/plane',{
        params:{
            id: id,
        }
    } ).then(respone => {
        return respone;
    }).catch(e=> {
        console.log(e);
    });

}