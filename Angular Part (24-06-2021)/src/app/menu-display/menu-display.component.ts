import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-menu-display',
  templateUrl: './menu-display.component.html',
  styleUrls: ['./menu-display.component.css']
})
export class MenuDisplayComponent implements OnInit {

  constructor(private service : TestService) { }
  
  menus : any = this.service.getMenuData().subscribe((data: any)=> this.menus=data);

  ngOnInit(): void {
  }

}
