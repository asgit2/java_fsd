import { Component, OnInit } from '@angular/core';
import { MenuPost } from '../menu-post';
import { TestService } from '../test.service';

@Component({
  selector: 'app-menu-list',
  templateUrl: './menu-list.component.html',
  styleUrls: ['./menu-list.component.css']
})
export class MenuListComponent implements OnInit {

  menuPost !: MenuPost[][];
  currentPage : number =0;
  constructor(private service : TestService) { }

  menus : any = this.service.getMenuData().subscribe((data:any)=> this.menus=data);
  ngOnInit(): void {
    for(let prop in this.menus){
      this.menuPost=[
        [
          {
            name: this.menus[prop].name,
            description: this.menus[prop].description,
            price: this.menus[prop].price
          },
          {
            name: this.menus[prop+1].name,
            description: this.menus[prop+1].description,
            price: this.menus[prop+1].price
          },
          {
            name: this.menus[prop+2].name,
            description: this.menus[prop+2].description,
            price: this.menus[prop+2].price
          }
        ],
      ];
    }
    // this.menuPost=[
    //   [
    //     {
    //       name: `dish 1`,
    //       description: `desc`,
    //       price: 120
    //     },
    //     {
    //       name: this.getmenu.name,
    //       description: `hdshdh`,
    //       price: 120
    //     }
    //   ],
    //   []
    // ];
  }
  updatePage(newPage : number){
    this.currentPage=newPage;
  }

}
