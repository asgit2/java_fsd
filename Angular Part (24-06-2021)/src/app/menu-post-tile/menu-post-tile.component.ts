import { Component, Input, OnInit } from '@angular/core';
import { MenuPost } from '../menu-post';
import { TestService } from '../test.service';

@Component({
  selector: 'app-menu-post-tile',
  templateUrl: './menu-post-tile.component.html',
  styleUrls: ['./menu-post-tile.component.css']
})
export class MenuPostTileComponent implements OnInit {

  @Input('post') post !: MenuPost;
  constructor(private service : TestService) { }
  menus : any = this.service.getMenuData().subscribe((data: any)=> this.menus=data);

  ngOnInit(): void {
  }

}
