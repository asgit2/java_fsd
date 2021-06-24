import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-view-restaurants',
  templateUrl: './view-restaurants.component.html',
  styleUrls: ['./view-restaurants.component.css']
})
export class ViewRestaurantsComponent implements OnInit {

  constructor(private service : TestService) { }
  rest : any = this.service.FeatchAllRestauarnts().subscribe((data: any)=> this.rest=data);
  ngOnInit(): void {
  }

}
