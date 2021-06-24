import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeammatesComponent } from './teammates.component';

describe('TeammatesComponent', () => {
  let component: TeammatesComponent;
  let fixture: ComponentFixture<TeammatesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TeammatesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TeammatesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
