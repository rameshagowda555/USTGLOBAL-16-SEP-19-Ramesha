import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieheaderComponent } from './movieheader.component';

describe('MovieheaderComponent', () => {
  let component: MovieheaderComponent;
  let fixture: ComponentFixture<MovieheaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MovieheaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MovieheaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
