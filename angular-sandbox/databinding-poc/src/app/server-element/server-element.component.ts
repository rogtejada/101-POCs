import {
  AfterContentChecked,
  AfterContentInit, AfterViewChecked, AfterViewInit,
  Component,
  DoCheck,
  Input,
  OnChanges, OnDestroy,
  OnInit,
  SimpleChanges,
  ViewEncapsulation
} from '@angular/core';

@Component({
  selector: 'app-server-element',
  templateUrl: './server-element.component.html',
  styleUrls: ['./server-element.component.css']
})
export class ServerElementComponent implements OnInit,
  OnChanges,
  DoCheck,
  AfterContentInit,
  AfterContentChecked,
  AfterViewInit,
  AfterViewChecked,
  OnDestroy {

  // @Input('srvElement')
  // element: {type: string, name: string, content: string};
  @Input()
  name: string;

  constructor() {
    console.log('constructor was called');
  }

  ngOnChanges(changes: SimpleChanges) {
    console.log('on changes', changes);
  }

  ngOnInit() {
    console.log('ngOnInit was called');
  }

  ngDoCheck() {
    console.log('do check');
  }

  ngAfterContentInit() {
    console.log('ngAfterContentInit');
  }

  ngAfterContentChecked() {
    console.log('ngAfterContentChecked');
  }

  ngAfterViewChecked() {
    console.log('ngAfterViewChecked');
  }

  ngAfterViewInit() {
    console.log('ngAfterViewInit');
  }

  ngOnDestroy() {
    console.log('destroy');
  }
}
