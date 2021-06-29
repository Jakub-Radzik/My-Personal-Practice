import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Child1aComponent } from './child1a.component';

describe('Child1aComponent', () => {
  let component: Child1aComponent;
  let fixture: ComponentFixture<Child1aComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Child1aComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Child1aComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
