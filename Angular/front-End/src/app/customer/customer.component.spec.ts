import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CUstomerComponent } from './customer.component';

describe('CUstomerComponent', () => {
  let component: CUstomerComponent;
  let fixture: ComponentFixture<CUstomerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CUstomerComponent]
    });
    fixture = TestBed.createComponent(CUstomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
