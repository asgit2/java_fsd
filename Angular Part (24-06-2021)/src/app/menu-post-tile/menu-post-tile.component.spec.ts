import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuPostTileComponent } from './menu-post-tile.component';

describe('MenuPostTileComponent', () => {
  let component: MenuPostTileComponent;
  let fixture: ComponentFixture<MenuPostTileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuPostTileComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuPostTileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
