import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DirectivesTrainingComponent } from './directives-training.component';

describe('DirectivesTrainingComponent', () => {
  let component: DirectivesTrainingComponent;
  let fixture: ComponentFixture<DirectivesTrainingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DirectivesTrainingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DirectivesTrainingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
