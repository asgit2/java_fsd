import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { AddMenuComponent } from './add-menu/add-menu.component';
import { AppComponent } from './app.component';
import { BookATableComponent } from './book-atable/book-atable.component';
import { CustomerFormComponent } from './customer-form/customer-form.component';
import { GetChineseComponent } from './get-chinese/get-chinese.component';
import { GetDrinksComponent } from './get-drinks/get-drinks.component';
import { GetVegItemsComponent } from './get-veg-items/get-veg-items.component';
import { LoginComponent } from './login/login.component';
import { MenuByCategoryComponent } from './menu-by-category/menu-by-category.component';
import { MenuDisplayComponent } from './menu-display/menu-display.component';
import { MenuFormComponent } from './menu-form/menu-form.component';
import { RestaurantFormComponent } from './restaurant-form/restaurant-form.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { RestaurantdetailsComponent } from './restaurantdetails/restaurantdetails.component';
import { TeammatesComponent } from './teammates/teammates.component';
import { ViewRestaurantsComponent } from './view-restaurants/view-restaurants.component';

//Define Route Url
const routes: Routes = [
  {path :'team', component: TeammatesComponent},
  {path:'restaurant', component:RestaurantComponent,
  children:[
    {path:'addMenu', component:AddMenuComponent}
  ]},
  {path:'displayMenu',component:MenuDisplayComponent  },
  {path:'getNonVeg',component:MenuByCategoryComponent},
  {path:'getVeg',component:GetVegItemsComponent},
  {path:'getChinese',component:GetChineseComponent},
  {path:'getDrinks',component:GetDrinksComponent},
  {path:'viewRestaurant',component:RestaurantdetailsComponent},
  {path:'allRestauants', component:ViewRestaurantsComponent},
  {path: 'account' , component:AccountComponent},
  {path:'login', component:LoginComponent},
  {path:'customerReg', component:CustomerFormComponent},
  {path:'RestaurantEnrollment', component:RestaurantFormComponent},
  {path:'AddMenus', component:MenuFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
