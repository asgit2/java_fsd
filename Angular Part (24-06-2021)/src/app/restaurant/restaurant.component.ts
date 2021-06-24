import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';
import { Restaurant } from './restaurant';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {

  restaurant : Restaurant = new Restaurant();
  constructor(private service : TestService) { }

  ngOnInit(): void {
  }
  FeatchAllRestauarnts() : any{
    return this.service.FeatchAllRestauarnts();
  }
  addNewRestaurant(){
    return this.service.addNewRestaurant(this.restaurant).subscribe(()=>{alert("Restaurant Data is Stored Successfully")});
  }

}
