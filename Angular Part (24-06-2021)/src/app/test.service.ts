import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from 'src/customer';
import { Reserve } from 'src/reserve';
import { Menu } from '../menu';
import { Restaurant } from './restaurant/restaurant';

@Injectable({
  providedIn: 'root'
})
export class TestService {
  
  
  responseData! :any;
  constructor(private httpClient : HttpClient) { }

  getCount(): any {
    let restUrl ="http://localhost:8082/menu/count";
    let response = this.httpClient.get(restUrl);
    return response;
  }
  getMenuData() :any{
    let restUrl ="http://localhost:8082/menu/all";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getNonVegItems(): any{
    let restUrl ="http://localhost:8082/menu/category/Non-veg";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getVegItems(): any{
    let restUrl ="http://localhost:8082/menu/category/veg";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getChineseItems(): any{
    let restUrl ="http://localhost:8082/menu/category/chinese";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  getDrinksItems(): any{
    let restUrl ="http://localhost:8082/menu/category/drinks";
    let response = this.httpClient.get(restUrl);
    response.subscribe((responseData) => console.log(responseData));
    return response;
  }
  addNewMenu(menu : Menu) : any{
    return this.httpClient.post<Menu>("http://localhost:8082/menu/add",menu);
  }
  deleteMenu(menuId: number) {
    this.httpClient.delete("http://localhost:8082/menu/" + menuId).subscribe(
      (responseData)=> {
        this.responseData = responseData;
        console.log(responseData);}
        );
  }
  FeatchAllRestauarnts() : any{
    return this.httpClient.get("http://localhost:8083/restaurant/all").subscribe(
      (responseData)=> console.log(responseData)
    );
  }

  addNewRestaurant(restaurant : Restaurant) : any{
    return this.httpClient.post<Restaurant>("http://localhost:8083/restaurant/add" ,restaurant)
    .subscribe((responseData)=> {
      this.responseData = this.responseData;
      console.log(responseData);
    });
  }
  bookATable(reserve : Reserve) :any{
    let restUrl ="http://localhost:8090/reservetable/add";
    return this.httpClient.post<Reserve>(restUrl ,reserve)
    .subscribe((responseData)=> {
      this.responseData = this.responseData;
      console.log(responseData);
    });
  }
  addCredential(credential: Credential) : any{
    let restUrl ="http://localhost:8086/credentials/add";
    return this.httpClient.post<Credential>(restUrl,Credential)
    .subscribe((responseData)=>{
      this.responseData =this.responseData;
      console.log(responseData);
    });
  }
  addNewCustomer(customer : Customer): any{
    let restUrl ="http://localhost:8084/customer/add";
    return this.httpClient.post<Credential>(restUrl,Customer)
    .subscribe((responseData)=>{
      this.responseData =this.responseData;
      console.log(responseData);
    });
  }
  
}
