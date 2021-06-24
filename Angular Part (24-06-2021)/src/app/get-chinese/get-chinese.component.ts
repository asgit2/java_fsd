import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-get-chinese',
  templateUrl: './get-chinese.component.html',
  styleUrls: ['./get-chinese.component.css']
})
export class GetChineseComponent implements OnInit {

  constructor(private service : TestService) { }

  menus : any = this.service.getChineseItems().subscribe((data: any)=> this.menus=data);
  ngOnInit(): void {
  }

}
