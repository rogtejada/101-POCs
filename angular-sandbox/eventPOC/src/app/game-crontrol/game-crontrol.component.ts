import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-game-crontrol',
  templateUrl: './game-crontrol.component.html',
  styleUrls: ['./game-crontrol.component.css']
})
export class GameCrontrolComponent implements OnInit {
  interval;
  @Output()
  intervalFired = new EventEmitter<number>();
  lastNumber = 0;

  constructor() { }

  ngOnInit() {
  }

  onStartGame() {
    this.interval = setInterval(() => {
      this.intervalFired.emit(this.lastNumber + 1 );
      this.lastNumber++;
    }, 1000);
  }

  onPauseGame() {
    clearInterval(this.interval);
    console.log('paused');
  }
}
