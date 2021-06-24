import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-paginator',
  templateUrl: './paginator.component.html',
  styleUrls: ['./paginator.component.css']
})
export class PaginatorComponent implements OnInit {

  @Output() pageNumberClick= new EventEmitter<number>();
  @Input() pageNumbers : any;
  pages !: number[];
  constructor() { }

  ngOnInit(): void {
    this.pages = new Array(this.pageNumbers);
  }
  pageNumberClicked(pageNumber : number) : void{
    this.pageNumberClick.emit(pageNumber);
  }

}
