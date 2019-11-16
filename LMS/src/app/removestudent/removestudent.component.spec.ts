import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RemovestudentComponent } from './removestudent.component';

describe('RemovestudentComponent', () => {
  let component: RemovestudentComponent;
  let fixture: ComponentFixture<RemovestudentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RemovestudentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RemovestudentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
