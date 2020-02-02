import {
  AfterContentChecked,
  AfterContentInit, AfterViewChecked, AfterViewInit,
  Component,
  DoCheck,
  Input,
  OnChanges, OnDestroy,
  OnInit,
  SimpleChanges,
  ViewEncapsulation,
  ViewChild, ElementRef, ContentChild
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
  @ViewChild('heading', { static: false })
  header: ElementRef;
  @ContentChild('contentParagraph', {static: true})
  paragraph: ElementRef;

  constructor() {
    console.log('constructor was called');
  }

  ngOnChanges(changes: SimpleChanges) {
    console.log('on changes', changes);
  }

  ngOnInit() {
    console.log('Paragraph Content:', this.paragraph.nativeElement.textContent);
    console.log('ngOnInit was called');
  }

  ngDoCheck() {
    console.log('do check');
  }

  ngAfterContentInit() {
    console.log('ngAfterContentInit');
    console.log('Paragraph Content:', this.paragraph.nativeElement.textContent);
  }

  ngAfterContentChecked() {
    console.log('ngAfterContentChecked');
  }

  ngAfterViewChecked() {
    console.log('ngAfterViewChecked');
  }

  ngAfterViewInit() {
    console.log('ngAfterViewInit');
    console.log('textContent: ', this.header.nativeElement.textContent);
  }

  ngOnDestroy() {
    console.log('destroy');
  }
}
