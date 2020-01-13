import { Component, OnInit } from '@angular/core';
import {removeErrorMarkup} from 'tslint/lib/verify/parse';

@Component({
  selector: 'app-directives-training',
  templateUrl: './directives-training.component.html',
  styleUrls: ['./directives-training.component.css']
})
export class DirectivesTrainingComponent implements OnInit {

  isDisplayActive = false;
  clicks = [];

  constructor() { }

  ngOnInit() {
  }

  changeDisplay() {
    this.clicks.push(new Date());
    this.isDisplayActive = !this.isDisplayActive;
  }

  getBackgroundColor(click) {
    return click >= 5 ? 'blue' : 'transparent';
  }
}
