import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { TeammatesComponent } from './teammates/teammates.component';
import { FormsModule } from '@angular/forms';
import { MenuDisplayComponent } from './menu-display/menu-display.component';
import { AddMenuComponent } from './add-menu/add-menu.component';
import { RestaurantdetailsComponent } from './restaurantdetails/restaurantdetails.component';
import { AccountComponent } from './account/account.component';
import { CustomerFormComponent } from './customer-form/customer-form.component';
import { RestaurantFormComponent } from './restaurant-form/restaurant-form.component';
import { MenuFormComponent } from './menu-form/menu-form.component';
import { BookATableComponent } from './book-atable/book-atable.component';
import { MenuPostTileComponent } from './menu-post-tile/menu-post-tile.component';
import { MenuListComponent } from './menu-list/menu-list.component';
import { PaginatorComponent } from './paginator/paginator.component';
import { LoginComponent } from './login/login.component';
import { CatalogComponent } from './catalog/catalog.component';
import { MenuByCategoryComponent } from './menu-by-category/menu-by-category.component';
import { GetVegItemsComponent } from './get-veg-items/get-veg-items.component';
import { GetChineseComponent } from './get-chinese/get-chinese.component';
import { GetDrinksComponent } from './get-drinks/get-drinks.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { ViewRestaurantsComponent } from './view-restaurants/view-restaurants.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    TeammatesComponent,
    MenuDisplayComponent,
    AddMenuComponent,
    RestaurantdetailsComponent,
    AccountComponent,
    CustomerFormComponent,
    RestaurantFormComponent,
    MenuFormComponent,
    BookATableComponent,
    MenuPostTileComponent,
    MenuListComponent,
    PaginatorComponent,
    LoginComponent,
    CatalogComponent,
    MenuByCategoryComponent,
    GetVegItemsComponent,
    GetChineseComponent,
    GetDrinksComponent,
    RestaurantComponent,
    ViewRestaurantsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
