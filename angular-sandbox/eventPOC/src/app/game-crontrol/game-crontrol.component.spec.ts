import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GameCrontrolComponent } from './game-crontrol.component';

describe('GameCrontrolComponent', () => {
  let component: GameCrontrolComponent;
  let fixture: ComponentFixture<GameCrontrolComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GameCrontrolComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GameCrontrolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
